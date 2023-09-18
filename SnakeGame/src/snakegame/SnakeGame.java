/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakegame;

/**
 *
 * @author vanquan
 */
//package snakegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class SnakeGame extends JFrame {
    private final int TILE_SIZE = 30;
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int ALL_TILES = (WIDTH * HEIGHT) / (TILE_SIZE * TILE_SIZE);
    private final int RANDOM_POSITION = 29;
    private final Timer timer;

    private final int x[] = new int[ALL_TILES];
    private final int y[] = new int[ALL_TILES];

    private int snakeSize;
    private int appleX;
    private int appleY;

    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if ((key == KeyEvent.VK_LEFT) && (!right)) {
                    left = true;
                    up = false;
                    down = false;
                }

                if ((key == KeyEvent.VK_RIGHT) && (!left)) {
                    right = true;
                    up = false;
                    down = false;
                }

                if ((key == KeyEvent.VK_UP) && (!down)) {
                    up = true;
                    right = false;
                    left = false;
                }

                if ((key == KeyEvent.VK_DOWN) && (!up)) {
                    down = true;
                    right = false;
                    left = false;
                }
            }
        });

        SnakePanel panel = new SnakePanel();
        this.add(panel);

        initGame();
        timer = new Timer(140, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (inGame) {
                    checkApple();
                    checkCollisions();
                    move();
                }
                panel.repaint();
            }
        });
        timer.start();
    }

    private void initGame() {
        snakeSize = 3;

        for (int z = 0; z < snakeSize; z++) {
            x[z] = 50 - z * 10;
            y[z] = 50;
        }

        locateApple();
    }

    private void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            snakeSize++;
            locateApple();
        }
    }

    private void move() {
        for (int z = snakeSize; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (left) {
            x[0] -= TILE_SIZE;
        }

        if (right) {
            x[0] += TILE_SIZE;
        }

        if (up) {
            y[0] -= TILE_SIZE;
        }

        if (down) {
            y[0] += TILE_SIZE;
        }
    }

    private void checkCollisions() {
        for (int z = snakeSize; z > 0; z--) {
            if ((z > 3) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }

        if (y[0] >= HEIGHT) {
            inGame = false;
        }

        if (y[0] < 0) {
            inGame = false;
        }

        if (x[0] >= WIDTH) {
            inGame = false;
        }

        if (x[0] < 0) {
            inGame = false;
        }

        if (!inGame) {
            timer.stop();
        }
    }

    private void locateApple() {
        int r = (int) (Math.random() * RANDOM_POSITION);
        appleX = ((r * TILE_SIZE));

        r = (int) (Math.random() * RANDOM_POSITION);
        appleY = ((r * TILE_SIZE));
    }

    private class SnakePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (inGame) {
                g.setColor(Color.RED);
                g.fillRect(appleX, appleY, TILE_SIZE, TILE_SIZE);

                for (int z = 0; z < snakeSize; z++) {
                    if (z == 0) {
                        g.setColor(Color.GREEN);
                        g.fillRect(x[z], y[z], TILE_SIZE, TILE_SIZE);
                    } else {
                        g.setColor(Color.BLUE);
                        g.fillRect(x[z], y[z], TILE_SIZE, TILE_SIZE);
                    }
                }
            } else {
                gameOver(g);
            }
        }

        private void gameOver(Graphics g) {
            String msg = "Game Over";
            Font font = new Font("SansSerif", Font.BOLD, 50);
            FontMetrics metrics = getFontMetrics(font);

            g.setColor(Color.RED);
            g.setFont(font);
            g.drawString(msg, (WIDTH - metrics.stringWidth(msg)) / 2, HEIGHT / 2);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new SnakeGame();
            frame.setVisible(true);
        });
    }
}

