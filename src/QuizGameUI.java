/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;

/**
 *
 * @author MatDal
 */
    

public class QuizGameUI extends javax.swing.JFrame {
    
    String answer;
    String correct;
    int index;
    int totalScore;
    int secondsT = 60;

    public int theoRNG(){
        Random rate = new Random();
        int number=0;
        
        for(int i=1; i<=1; i++){
            number = rate.nextInt(10);
        }
        return number;
    }
    
    public int progRNG(){
        Random rate = new Random();
        int number=0;
        
        for(int i=1; i<=1; i++){
            number = 1 + rate.nextInt(25);
        }
        return number;
    }
    
    public void choiceShuffle( String[] choices) throws FileNotFoundException{
        
        List<String> list = Arrays.asList(choices);
        
        Collections.shuffle(list);
        list.toArray(choices);
    }
    
    Timer timer1 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsT = 60;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsT--;
            secondsLeft.setText(String.valueOf(secondsT));
            if(secondsT<=0){
                mainPanel.removeAll();
                mainPanel.add(theoretical2Panel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer timer2 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsT = 60;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsT--;
            secondsLeft1.setText(String.valueOf(secondsT));
            if(secondsT<=0){
                mainPanel.removeAll();
                mainPanel.add(code1Panel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer timer3 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsP = 90;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsP--;
            secondsLeft2.setText(String.valueOf(secondsP));
            if(secondsP<=0){
                mainPanel.removeAll();
                mainPanel.add(theoretical3Panel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer timer4 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsT = 60;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsT--;
            secondsLeft3.setText(String.valueOf(secondsT));
            if(secondsT<=0){
                mainPanel.removeAll();
                mainPanel.add(theoretical4Panel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer timer5 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsT = 60;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsT--;
            secondsLeft4.setText(String.valueOf(secondsT));
            if(secondsT<=0){
                mainPanel.removeAll();
                mainPanel.add(code2Panel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer timer6 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsP = 90;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsP--;
            secondsLeft5.setText(String.valueOf(secondsP));
            if(secondsP<=0){
                mainPanel.removeAll();
                mainPanel.add(theoretical5Panel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer timer7 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsT = 60;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsT--;
            secondsLeft6.setText(String.valueOf(secondsT));
            if(secondsT<=0){
                mainPanel.removeAll();
                mainPanel.add(theoretical6Panel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        }
    });
    
    Timer timer8 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsT = 60;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsT--;
            secondsLeft7.setText(String.valueOf(secondsT));
            if(secondsT<=0){
                mainPanel.removeAll();
                mainPanel.add(code3Panel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer timer9 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsP = 90;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsP--;
            secondsLeft8.setText(String.valueOf(secondsP));
            if(secondsP<=0){
                mainPanel.removeAll();
                mainPanel.add(theoretical7Panel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer timer10 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsT = 60;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsT--;
            secondsLeft9.setText(String.valueOf(secondsT));
            if(secondsT<=0){
                mainPanel.removeAll();
                mainPanel.add(code4Panel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer timer11 = new Timer(1000,new ActionListener(){ // timer for each question
        int secondsP = 90;
        @Override
        public void actionPerformed(ActionEvent e){
            secondsP--;
            secondsLeft10.setText(String.valueOf(secondsP));
            if(secondsP<=0){
                mainPanel.removeAll();
                mainPanel.add(resultsPanel);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        }
    });
    
    Timer pause = new Timer(2000,new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            mainPanel.removeAll();
            mainPanel.add(theoretical1Panel);
            mainPanel.revalidate();
            mainPanel.repaint();
            secondsLeft.setText(Integer.toString(secondsT));
            timer1.start();
        }
    });

    public QuizGameUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        startMenuPanel = new javax.swing.JPanel();
        startGameButton = new javax.swing.JButton();
        instructionsButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        aboutPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        howToPanel = new javax.swing.JPanel();
        howTo = new javax.swing.JTextArea();
        returntoMenuButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        resultsPanel = new javax.swing.JPanel();
        homeFinishButton = new javax.swing.JButton();
        finishExitButton = new javax.swing.JButton();
        scoreField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        theoretical1Panel = new javax.swing.JPanel();
        optionB1 = new javax.swing.JTextArea();
        optionA1 = new javax.swing.JTextArea();
        optionC1 = new javax.swing.JTextArea();
        optionD1 = new javax.swing.JTextArea();
        secondsLeft = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        questions1Text = new javax.swing.JTextArea();
        choiceA1 = new javax.swing.JButton();
        choiceB1 = new javax.swing.JButton();
        choiceC1 = new javax.swing.JButton();
        choiceD1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        theoretical2Panel = new javax.swing.JPanel();
        optionB2 = new javax.swing.JTextArea();
        optionA2 = new javax.swing.JTextArea();
        optionC2 = new javax.swing.JTextArea();
        optionD2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        questions2Text = new javax.swing.JTextArea();
        secondsLeft1 = new javax.swing.JTextField();
        choiceA2 = new javax.swing.JButton();
        choiceB2 = new javax.swing.JButton();
        choiceC2 = new javax.swing.JButton();
        choiceD2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        code1Panel = new javax.swing.JPanel();
        optionB3 = new javax.swing.JTextArea();
        optionA3 = new javax.swing.JTextArea();
        optionC3 = new javax.swing.JTextArea();
        optionD3 = new javax.swing.JTextArea();
        secondsLeft2 = new javax.swing.JTextField();
        choiceA3 = new javax.swing.JButton();
        choiceB3 = new javax.swing.JButton();
        choiceC3 = new javax.swing.JButton();
        choiceD3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questions3Text = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        theoretical3Panel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        questions4Text = new javax.swing.JTextArea();
        optionB4 = new javax.swing.JTextArea();
        optionA4 = new javax.swing.JTextArea();
        optionC4 = new javax.swing.JTextArea();
        optionD4 = new javax.swing.JTextArea();
        secondsLeft3 = new javax.swing.JTextField();
        choiceA4 = new javax.swing.JButton();
        choiceB4 = new javax.swing.JButton();
        choiceC4 = new javax.swing.JButton();
        choiceD4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        theoretical4Panel = new javax.swing.JPanel();
        optionB5 = new javax.swing.JTextArea();
        optionA5 = new javax.swing.JTextArea();
        optionC5 = new javax.swing.JTextArea();
        optionD5 = new javax.swing.JTextArea();
        secondsLeft4 = new javax.swing.JTextField();
        choiceA5 = new javax.swing.JButton();
        choiceB5 = new javax.swing.JButton();
        choiceC5 = new javax.swing.JButton();
        choiceD5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        questions5Text = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        code2Panel = new javax.swing.JPanel();
        optionB6 = new javax.swing.JTextArea();
        optionA6 = new javax.swing.JTextArea();
        optionC6 = new javax.swing.JTextArea();
        optionD6 = new javax.swing.JTextArea();
        secondsLeft5 = new javax.swing.JTextField();
        choiceA6 = new javax.swing.JButton();
        choiceB6 = new javax.swing.JButton();
        choiceC6 = new javax.swing.JButton();
        choiceD6 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        questions6Text = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        theoretical5Panel = new javax.swing.JPanel();
        optionB7 = new javax.swing.JTextArea();
        optionA7 = new javax.swing.JTextArea();
        optionC7 = new javax.swing.JTextArea();
        optionD7 = new javax.swing.JTextArea();
        secondsLeft6 = new javax.swing.JTextField();
        choiceA7 = new javax.swing.JButton();
        choiceB7 = new javax.swing.JButton();
        choiceC7 = new javax.swing.JButton();
        choiceD7 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        questions7Text = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        theoretical6Panel = new javax.swing.JPanel();
        optionB8 = new javax.swing.JTextArea();
        optionA8 = new javax.swing.JTextArea();
        optionC8 = new javax.swing.JTextArea();
        optionD8 = new javax.swing.JTextArea();
        secondsLeft7 = new javax.swing.JTextField();
        choiceA8 = new javax.swing.JButton();
        choiceB8 = new javax.swing.JButton();
        choiceC8 = new javax.swing.JButton();
        choiceD8 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        questions8Text = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        code3Panel = new javax.swing.JPanel();
        optionB9 = new javax.swing.JTextArea();
        optionA9 = new javax.swing.JTextArea();
        optionC9 = new javax.swing.JTextArea();
        optionD9 = new javax.swing.JTextArea();
        secondsLeft8 = new javax.swing.JTextField();
        choiceA9 = new javax.swing.JButton();
        choiceB9 = new javax.swing.JButton();
        choiceC9 = new javax.swing.JButton();
        choiceD9 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        questions9Text = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        theoretical7Panel = new javax.swing.JPanel();
        optionB10 = new javax.swing.JTextArea();
        optionA10 = new javax.swing.JTextArea();
        optionC10 = new javax.swing.JTextArea();
        optionD10 = new javax.swing.JTextArea();
        secondsLeft9 = new javax.swing.JTextField();
        choiceA10 = new javax.swing.JButton();
        choiceB10 = new javax.swing.JButton();
        choiceC10 = new javax.swing.JButton();
        choiceD10 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        questions10Text = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        code4Panel = new javax.swing.JPanel();
        optionB11 = new javax.swing.JTextArea();
        optionA11 = new javax.swing.JTextArea();
        optionC11 = new javax.swing.JTextArea();
        optionD11 = new javax.swing.JTextArea();
        secondsLeft10 = new javax.swing.JTextField();
        choiceA11 = new javax.swing.JButton();
        choiceB11 = new javax.swing.JButton();
        choiceC11 = new javax.swing.JButton();
        choiceD11 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        questions11Text = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KOMSAYA");
        setMinimumSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 0, 51));
        mainPanel.setForeground(new java.awt.Color(0, 0, 51));
        mainPanel.setLayout(new java.awt.CardLayout());

        startMenuPanel.setBackground(new java.awt.Color(0, 0, 51));
        startMenuPanel.setForeground(new java.awt.Color(0, 0, 51));
        startMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startGameButton.setBackground(new java.awt.Color(255, 255, 255));
        startGameButton.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        startGameButton.setForeground(new java.awt.Color(0, 0, 102));
        startGameButton.setText("START");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });
        startMenuPanel.add(startGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 390, 90));

        instructionsButton.setBackground(new java.awt.Color(255, 255, 255));
        instructionsButton.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        instructionsButton.setForeground(new java.awt.Color(0, 0, 102));
        instructionsButton.setText("HOW TO PLAY");
        instructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionsButtonActionPerformed(evt);
            }
        });
        startMenuPanel.add(instructionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 260, 60));

        quitButton.setBackground(new java.awt.Color(255, 255, 255));
        quitButton.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        quitButton.setForeground(new java.awt.Color(0, 0, 51));
        quitButton.setText("QUIT");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        startMenuPanel.add(quitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 260, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/01.png"))); // NOI18N
        startMenuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 580));

        mainPanel.add(startMenuPanel, "card2");

        aboutPanel.setBackground(new java.awt.Color(0, 0, 51));
        aboutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sharou - アトリエと電脳世界 (Atelier and the Cyber World)");
        aboutPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/02.png"))); // NOI18N
        aboutPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 580));

        mainPanel.add(aboutPanel, "card3");

        howToPanel.setBackground(new java.awt.Color(0, 0, 51));
        howToPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        howTo.setEditable(false);
        howTo.setBackground(new java.awt.Color(204, 51, 0));
        howTo.setColumns(20);
        howTo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        howTo.setForeground(new java.awt.Color(255, 255, 255));
        howTo.setRows(5);
        howTo.setText("There are 11 questions\n7 theoretical and 4 programming questions\nPoints are awarded for each correct answer\n60 second timer for theoretical questions \nand 90 seconds for programming questions");
        howToPanel.add(howTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 550, 170));

        returntoMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        returntoMenuButton.setFont(new java.awt.Font("Bahnschrift", 0, 30)); // NOI18N
        returntoMenuButton.setForeground(new java.awt.Color(0, 0, 51));
        returntoMenuButton.setText("RETURN");
        returntoMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returntoMenuButtonActionPerformed(evt);
            }
        });
        howToPanel.add(returntoMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 447, 260, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/01.png"))); // NOI18N
        howToPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 580));

        mainPanel.add(howToPanel, "card6");

        resultsPanel.setBackground(new java.awt.Color(0, 0, 51));
        resultsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeFinishButton.setBackground(new java.awt.Color(255, 255, 255));
        homeFinishButton.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        homeFinishButton.setForeground(new java.awt.Color(0, 0, 51));
        homeFinishButton.setText("MENU");
        homeFinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeFinishButtonActionPerformed(evt);
            }
        });
        resultsPanel.add(homeFinishButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 260, 60));

        finishExitButton.setBackground(new java.awt.Color(255, 255, 255));
        finishExitButton.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        finishExitButton.setForeground(new java.awt.Color(0, 0, 51));
        finishExitButton.setText("QUIT");
        finishExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishExitButtonActionPerformed(evt);
            }
        });
        resultsPanel.add(finishExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 260, 60));

        scoreField.setBackground(new java.awt.Color(255, 255, 255));
        scoreField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        scoreField.setForeground(new java.awt.Color(0, 0, 51));
        scoreField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreFieldActionPerformed(evt);
            }
        });
        resultsPanel.add(scoreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 300, 60, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("11");
        jLabel3.setOpaque(true);
        resultsPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 60, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/05.png"))); // NOI18N
        resultsPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 580));

        mainPanel.add(resultsPanel, "card4");

        theoretical1Panel.setBackground(new java.awt.Color(0, 0, 51));
        theoretical1Panel.setForeground(new java.awt.Color(0, 0, 51));
        theoretical1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB1.setEditable(false);
        optionB1.setBackground(new java.awt.Color(255, 255, 255));
        optionB1.setColumns(20);
        optionB1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionB1.setForeground(new java.awt.Color(0, 0, 51));
        optionB1.setLineWrap(true);
        optionB1.setRows(5);
        optionB1.setWrapStyleWord(true);
        optionB1.setAutoscrolls(false);
        optionB1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        theoretical1Panel.add(optionB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 350, 40));

        optionA1.setEditable(false);
        optionA1.setBackground(new java.awt.Color(216, 203, 199));
        optionA1.setColumns(20);
        optionA1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionA1.setForeground(new java.awt.Color(0, 0, 51));
        optionA1.setLineWrap(true);
        optionA1.setRows(5);
        optionA1.setWrapStyleWord(true);
        optionA1.setAutoscrolls(false);
        theoretical1Panel.add(optionA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 350, 40));

        optionC1.setEditable(false);
        optionC1.setBackground(new java.awt.Color(255, 255, 255));
        optionC1.setColumns(20);
        optionC1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionC1.setForeground(new java.awt.Color(0, 0, 51));
        optionC1.setLineWrap(true);
        optionC1.setRows(5);
        optionC1.setWrapStyleWord(true);
        optionC1.setAutoscrolls(false);
        theoretical1Panel.add(optionC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 350, 40));

        optionD1.setEditable(false);
        optionD1.setBackground(new java.awt.Color(216, 203, 199));
        optionD1.setColumns(20);
        optionD1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionD1.setForeground(new java.awt.Color(0, 0, 51));
        optionD1.setLineWrap(true);
        optionD1.setRows(5);
        optionD1.setWrapStyleWord(true);
        optionD1.setAutoscrolls(false);
        theoretical1Panel.add(optionD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 340, 40));

        secondsLeft.setEditable(false);
        secondsLeft.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeftActionPerformed(evt);
            }
        });
        theoretical1Panel.add(secondsLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        questions1Text.setEditable(false);
        questions1Text.setBackground(new java.awt.Color(255, 255, 255));
        questions1Text.setColumns(20);
        questions1Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions1Text.setForeground(new java.awt.Color(0, 0, 51));
        questions1Text.setLineWrap(true);
        questions1Text.setRows(5);
        questions1Text.setWrapStyleWord(true);
        jScrollPane2.setViewportView(questions1Text);

        theoretical1Panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 670, 260));

        choiceA1.setBackground(new java.awt.Color(0, 153, 153));
        choiceA1.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA1.setForeground(new java.awt.Color(255, 255, 255));
        choiceA1.setText("A");
        choiceA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA1ActionPerformed(evt);
            }
        });
        theoretical1Panel.add(choiceA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 100));

        choiceB1.setBackground(new java.awt.Color(0, 153, 153));
        choiceB1.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB1.setForeground(new java.awt.Color(255, 255, 255));
        choiceB1.setText("B");
        choiceB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB1ActionPerformed(evt);
            }
        });
        theoretical1Panel.add(choiceB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 100));

        choiceC1.setBackground(new java.awt.Color(0, 153, 153));
        choiceC1.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC1.setForeground(new java.awt.Color(255, 255, 255));
        choiceC1.setText("C");
        choiceC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC1ActionPerformed(evt);
            }
        });
        theoretical1Panel.add(choiceC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 100));

        choiceD1.setBackground(new java.awt.Color(0, 153, 153));
        choiceD1.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD1.setForeground(new java.awt.Color(255, 255, 255));
        choiceD1.setText("D");
        choiceD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD1ActionPerformed(evt);
            }
        });
        theoretical1Panel.add(choiceD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 100, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.png"))); // NOI18N
        theoretical1Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(theoretical1Panel, "card5");

        theoretical2Panel.setBackground(new java.awt.Color(0, 0, 51));
        theoretical2Panel.setForeground(new java.awt.Color(0, 0, 51));
        theoretical2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB2.setEditable(false);
        optionB2.setBackground(new java.awt.Color(255, 255, 255));
        optionB2.setColumns(20);
        optionB2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionB2.setForeground(new java.awt.Color(0, 0, 51));
        optionB2.setLineWrap(true);
        optionB2.setRows(5);
        optionB2.setWrapStyleWord(true);
        optionB2.setAutoscrolls(false);
        optionB2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        theoretical2Panel.add(optionB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 350, 40));

        optionA2.setEditable(false);
        optionA2.setBackground(new java.awt.Color(216, 203, 199));
        optionA2.setColumns(20);
        optionA2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionA2.setForeground(new java.awt.Color(0, 0, 51));
        optionA2.setLineWrap(true);
        optionA2.setRows(5);
        optionA2.setWrapStyleWord(true);
        optionA2.setAutoscrolls(false);
        theoretical2Panel.add(optionA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 350, 40));

        optionC2.setEditable(false);
        optionC2.setBackground(new java.awt.Color(255, 255, 255));
        optionC2.setColumns(20);
        optionC2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionC2.setForeground(new java.awt.Color(0, 0, 51));
        optionC2.setLineWrap(true);
        optionC2.setRows(5);
        optionC2.setWrapStyleWord(true);
        optionC2.setAutoscrolls(false);
        theoretical2Panel.add(optionC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 350, 40));

        optionD2.setEditable(false);
        optionD2.setBackground(new java.awt.Color(216, 203, 199));
        optionD2.setColumns(20);
        optionD2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionD2.setForeground(new java.awt.Color(0, 0, 51));
        optionD2.setLineWrap(true);
        optionD2.setRows(5);
        optionD2.setWrapStyleWord(true);
        optionD2.setAutoscrolls(false);
        theoretical2Panel.add(optionD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 340, 40));

        questions2Text.setEditable(false);
        questions2Text.setBackground(new java.awt.Color(255, 255, 255));
        questions2Text.setColumns(20);
        questions2Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions2Text.setForeground(new java.awt.Color(0, 0, 51));
        questions2Text.setLineWrap(true);
        questions2Text.setRows(5);
        questions2Text.setWrapStyleWord(true);
        jScrollPane3.setViewportView(questions2Text);

        theoretical2Panel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 670, 260));

        secondsLeft1.setEditable(false);
        secondsLeft1.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft1.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft1.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft1ActionPerformed(evt);
            }
        });
        theoretical2Panel.add(secondsLeft1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA2.setBackground(new java.awt.Color(0, 153, 153));
        choiceA2.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA2.setForeground(new java.awt.Color(255, 255, 255));
        choiceA2.setText("A");
        choiceA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA2ActionPerformed(evt);
            }
        });
        theoretical2Panel.add(choiceA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 100));

        choiceB2.setBackground(new java.awt.Color(0, 153, 153));
        choiceB2.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB2.setForeground(new java.awt.Color(255, 255, 255));
        choiceB2.setText("B");
        choiceB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB2ActionPerformed(evt);
            }
        });
        theoretical2Panel.add(choiceB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 100));

        choiceC2.setBackground(new java.awt.Color(0, 153, 153));
        choiceC2.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC2.setForeground(new java.awt.Color(255, 255, 255));
        choiceC2.setText("C");
        choiceC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC2ActionPerformed(evt);
            }
        });
        theoretical2Panel.add(choiceC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 100));

        choiceD2.setBackground(new java.awt.Color(0, 153, 153));
        choiceD2.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD2.setForeground(new java.awt.Color(255, 255, 255));
        choiceD2.setText("D");
        choiceD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD2ActionPerformed(evt);
            }
        });
        theoretical2Panel.add(choiceD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 100, 100));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.png"))); // NOI18N
        theoretical2Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(theoretical2Panel, "card5");

        code1Panel.setBackground(new java.awt.Color(0, 0, 51));
        code1Panel.setForeground(new java.awt.Color(0, 0, 51));
        code1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB3.setEditable(false);
        optionB3.setBackground(new java.awt.Color(255, 255, 255));
        optionB3.setColumns(20);
        optionB3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionB3.setForeground(new java.awt.Color(0, 0, 51));
        optionB3.setLineWrap(true);
        optionB3.setRows(5);
        optionB3.setWrapStyleWord(true);
        optionB3.setAutoscrolls(false);
        optionB3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        code1Panel.add(optionB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 240, 50));

        optionA3.setEditable(false);
        optionA3.setBackground(new java.awt.Color(216, 203, 199));
        optionA3.setColumns(20);
        optionA3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionA3.setForeground(new java.awt.Color(0, 0, 51));
        optionA3.setLineWrap(true);
        optionA3.setRows(5);
        optionA3.setWrapStyleWord(true);
        optionA3.setAutoscrolls(false);
        code1Panel.add(optionA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, -1, 50));

        optionC3.setEditable(false);
        optionC3.setBackground(new java.awt.Color(255, 255, 255));
        optionC3.setColumns(20);
        optionC3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionC3.setForeground(new java.awt.Color(0, 0, 51));
        optionC3.setLineWrap(true);
        optionC3.setRows(5);
        optionC3.setWrapStyleWord(true);
        optionC3.setAutoscrolls(false);
        code1Panel.add(optionC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 240, 40));

        optionD3.setEditable(false);
        optionD3.setBackground(new java.awt.Color(216, 203, 199));
        optionD3.setColumns(20);
        optionD3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionD3.setForeground(new java.awt.Color(0, 0, 51));
        optionD3.setLineWrap(true);
        optionD3.setRows(5);
        optionD3.setWrapStyleWord(true);
        optionD3.setAutoscrolls(false);
        code1Panel.add(optionD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 240, 50));

        secondsLeft2.setEditable(false);
        secondsLeft2.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft2.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft2.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft2ActionPerformed(evt);
            }
        });
        code1Panel.add(secondsLeft2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA3.setBackground(new java.awt.Color(0, 153, 153));
        choiceA3.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA3.setForeground(new java.awt.Color(255, 255, 255));
        choiceA3.setText("A");
        choiceA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA3ActionPerformed(evt);
            }
        });
        code1Panel.add(choiceA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 90, 90));

        choiceB3.setBackground(new java.awt.Color(0, 153, 153));
        choiceB3.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB3.setForeground(new java.awt.Color(255, 255, 255));
        choiceB3.setText("B");
        choiceB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB3ActionPerformed(evt);
            }
        });
        code1Panel.add(choiceB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 90, 90));

        choiceC3.setBackground(new java.awt.Color(0, 153, 153));
        choiceC3.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC3.setForeground(new java.awt.Color(255, 255, 255));
        choiceC3.setText("C");
        choiceC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC3ActionPerformed(evt);
            }
        });
        code1Panel.add(choiceC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 90, 90));

        choiceD3.setBackground(new java.awt.Color(0, 153, 153));
        choiceD3.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD3.setForeground(new java.awt.Color(255, 255, 255));
        choiceD3.setText("D");
        choiceD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD3ActionPerformed(evt);
            }
        });
        code1Panel.add(choiceD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 90, 90));

        questions3Text.setEditable(false);
        questions3Text.setBackground(new java.awt.Color(39, 55, 85));
        questions3Text.setColumns(20);
        questions3Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions3Text.setForeground(new java.awt.Color(255, 255, 255));
        questions3Text.setLineWrap(true);
        questions3Text.setRows(5);
        questions3Text.setWrapStyleWord(true);
        jScrollPane1.setViewportView(questions3Text);

        code1Panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 460, 240));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/04.png"))); // NOI18N
        code1Panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(code1Panel, "card5");

        theoretical3Panel.setBackground(new java.awt.Color(0, 0, 51));
        theoretical3Panel.setForeground(new java.awt.Color(0, 0, 51));
        theoretical3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questions4Text.setEditable(false);
        questions4Text.setBackground(new java.awt.Color(255, 255, 255));
        questions4Text.setColumns(20);
        questions4Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions4Text.setForeground(new java.awt.Color(0, 0, 51));
        questions4Text.setLineWrap(true);
        questions4Text.setRows(5);
        questions4Text.setWrapStyleWord(true);
        jScrollPane4.setViewportView(questions4Text);

        theoretical3Panel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 680, 260));

        optionB4.setEditable(false);
        optionB4.setBackground(new java.awt.Color(255, 255, 255));
        optionB4.setColumns(20);
        optionB4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionB4.setForeground(new java.awt.Color(0, 0, 51));
        optionB4.setLineWrap(true);
        optionB4.setRows(5);
        optionB4.setWrapStyleWord(true);
        optionB4.setAutoscrolls(false);
        optionB4.setMargin(new java.awt.Insets(10, 10, 10, 10));
        theoretical3Panel.add(optionB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 350, 40));

        optionA4.setEditable(false);
        optionA4.setBackground(new java.awt.Color(216, 203, 199));
        optionA4.setColumns(20);
        optionA4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionA4.setForeground(new java.awt.Color(0, 0, 51));
        optionA4.setLineWrap(true);
        optionA4.setRows(5);
        optionA4.setWrapStyleWord(true);
        optionA4.setAutoscrolls(false);
        theoretical3Panel.add(optionA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 350, 40));

        optionC4.setEditable(false);
        optionC4.setBackground(new java.awt.Color(255, 255, 255));
        optionC4.setColumns(20);
        optionC4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionC4.setForeground(new java.awt.Color(0, 0, 51));
        optionC4.setLineWrap(true);
        optionC4.setRows(5);
        optionC4.setWrapStyleWord(true);
        optionC4.setAutoscrolls(false);
        theoretical3Panel.add(optionC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 350, 40));

        optionD4.setEditable(false);
        optionD4.setBackground(new java.awt.Color(216, 203, 199));
        optionD4.setColumns(20);
        optionD4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionD4.setForeground(new java.awt.Color(0, 0, 51));
        optionD4.setLineWrap(true);
        optionD4.setRows(5);
        optionD4.setWrapStyleWord(true);
        optionD4.setAutoscrolls(false);
        theoretical3Panel.add(optionD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 340, 40));

        secondsLeft3.setEditable(false);
        secondsLeft3.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft3.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft3.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft3ActionPerformed(evt);
            }
        });
        theoretical3Panel.add(secondsLeft3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA4.setBackground(new java.awt.Color(0, 153, 153));
        choiceA4.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA4.setForeground(new java.awt.Color(255, 255, 255));
        choiceA4.setText("A");
        choiceA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA4ActionPerformed(evt);
            }
        });
        theoretical3Panel.add(choiceA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 100));

        choiceB4.setBackground(new java.awt.Color(0, 153, 153));
        choiceB4.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB4.setForeground(new java.awt.Color(255, 255, 255));
        choiceB4.setText("B");
        choiceB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB4ActionPerformed(evt);
            }
        });
        theoretical3Panel.add(choiceB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 100));

        choiceC4.setBackground(new java.awt.Color(0, 153, 153));
        choiceC4.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC4.setForeground(new java.awt.Color(255, 255, 255));
        choiceC4.setText("C");
        choiceC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC4ActionPerformed(evt);
            }
        });
        theoretical3Panel.add(choiceC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 100));

        choiceD4.setBackground(new java.awt.Color(0, 153, 153));
        choiceD4.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD4.setForeground(new java.awt.Color(255, 255, 255));
        choiceD4.setText("D");
        choiceD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD4ActionPerformed(evt);
            }
        });
        theoretical3Panel.add(choiceD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 100, 100));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.png"))); // NOI18N
        theoretical3Panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(theoretical3Panel, "card5");

        theoretical4Panel.setBackground(new java.awt.Color(0, 0, 51));
        theoretical4Panel.setForeground(new java.awt.Color(0, 0, 51));
        theoretical4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB5.setEditable(false);
        optionB5.setBackground(new java.awt.Color(255, 255, 255));
        optionB5.setColumns(20);
        optionB5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionB5.setForeground(new java.awt.Color(0, 0, 51));
        optionB5.setLineWrap(true);
        optionB5.setRows(5);
        optionB5.setWrapStyleWord(true);
        optionB5.setAutoscrolls(false);
        optionB5.setMargin(new java.awt.Insets(10, 10, 10, 10));
        theoretical4Panel.add(optionB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 350, 40));

        optionA5.setEditable(false);
        optionA5.setBackground(new java.awt.Color(216, 203, 199));
        optionA5.setColumns(20);
        optionA5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionA5.setForeground(new java.awt.Color(0, 0, 51));
        optionA5.setLineWrap(true);
        optionA5.setRows(5);
        optionA5.setWrapStyleWord(true);
        optionA5.setAutoscrolls(false);
        theoretical4Panel.add(optionA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 350, 40));

        optionC5.setEditable(false);
        optionC5.setBackground(new java.awt.Color(255, 255, 255));
        optionC5.setColumns(20);
        optionC5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionC5.setForeground(new java.awt.Color(0, 0, 51));
        optionC5.setLineWrap(true);
        optionC5.setRows(5);
        optionC5.setWrapStyleWord(true);
        optionC5.setAutoscrolls(false);
        theoretical4Panel.add(optionC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 350, 40));

        optionD5.setEditable(false);
        optionD5.setBackground(new java.awt.Color(216, 203, 199));
        optionD5.setColumns(20);
        optionD5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionD5.setForeground(new java.awt.Color(0, 0, 51));
        optionD5.setLineWrap(true);
        optionD5.setRows(5);
        optionD5.setWrapStyleWord(true);
        optionD5.setAutoscrolls(false);
        theoretical4Panel.add(optionD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 340, 40));

        secondsLeft4.setEditable(false);
        secondsLeft4.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft4.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft4.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft4ActionPerformed(evt);
            }
        });
        theoretical4Panel.add(secondsLeft4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA5.setBackground(new java.awt.Color(0, 153, 153));
        choiceA5.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA5.setForeground(new java.awt.Color(255, 255, 255));
        choiceA5.setText("A");
        choiceA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA5ActionPerformed(evt);
            }
        });
        theoretical4Panel.add(choiceA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 100));

        choiceB5.setBackground(new java.awt.Color(0, 153, 153));
        choiceB5.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB5.setForeground(new java.awt.Color(255, 255, 255));
        choiceB5.setText("B");
        choiceB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB5ActionPerformed(evt);
            }
        });
        theoretical4Panel.add(choiceB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 100));

        choiceC5.setBackground(new java.awt.Color(0, 153, 153));
        choiceC5.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC5.setForeground(new java.awt.Color(255, 255, 255));
        choiceC5.setText("C");
        choiceC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC5ActionPerformed(evt);
            }
        });
        theoretical4Panel.add(choiceC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 100));

        choiceD5.setBackground(new java.awt.Color(0, 153, 153));
        choiceD5.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD5.setForeground(new java.awt.Color(255, 255, 255));
        choiceD5.setText("D");
        choiceD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD5ActionPerformed(evt);
            }
        });
        theoretical4Panel.add(choiceD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 100, 100));

        questions5Text.setEditable(false);
        questions5Text.setBackground(new java.awt.Color(255, 255, 255));
        questions5Text.setColumns(20);
        questions5Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions5Text.setForeground(new java.awt.Color(0, 0, 51));
        questions5Text.setLineWrap(true);
        questions5Text.setRows(5);
        questions5Text.setWrapStyleWord(true);
        jScrollPane5.setViewportView(questions5Text);

        theoretical4Panel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 670, 260));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.png"))); // NOI18N
        theoretical4Panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(theoretical4Panel, "card5");

        code2Panel.setBackground(new java.awt.Color(0, 0, 51));
        code2Panel.setForeground(new java.awt.Color(0, 0, 51));
        code2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB6.setEditable(false);
        optionB6.setBackground(new java.awt.Color(255, 255, 255));
        optionB6.setColumns(20);
        optionB6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionB6.setForeground(new java.awt.Color(0, 0, 51));
        optionB6.setLineWrap(true);
        optionB6.setRows(5);
        optionB6.setWrapStyleWord(true);
        optionB6.setAutoscrolls(false);
        optionB6.setMargin(new java.awt.Insets(10, 10, 10, 10));
        code2Panel.add(optionB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 240, 50));

        optionA6.setEditable(false);
        optionA6.setBackground(new java.awt.Color(216, 203, 199));
        optionA6.setColumns(20);
        optionA6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionA6.setForeground(new java.awt.Color(0, 0, 51));
        optionA6.setLineWrap(true);
        optionA6.setRows(5);
        optionA6.setWrapStyleWord(true);
        optionA6.setAutoscrolls(false);
        code2Panel.add(optionA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 270, -1, 50));

        optionC6.setEditable(false);
        optionC6.setBackground(new java.awt.Color(255, 255, 255));
        optionC6.setColumns(20);
        optionC6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionC6.setForeground(new java.awt.Color(0, 0, 51));
        optionC6.setLineWrap(true);
        optionC6.setRows(5);
        optionC6.setWrapStyleWord(true);
        optionC6.setAutoscrolls(false);
        code2Panel.add(optionC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 240, 40));

        optionD6.setEditable(false);
        optionD6.setBackground(new java.awt.Color(216, 203, 199));
        optionD6.setColumns(20);
        optionD6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionD6.setForeground(new java.awt.Color(0, 0, 51));
        optionD6.setLineWrap(true);
        optionD6.setRows(5);
        optionD6.setWrapStyleWord(true);
        optionD6.setAutoscrolls(false);
        code2Panel.add(optionD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 240, 50));

        secondsLeft5.setEditable(false);
        secondsLeft5.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft5.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft5.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft5ActionPerformed(evt);
            }
        });
        code2Panel.add(secondsLeft5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA6.setBackground(new java.awt.Color(0, 153, 153));
        choiceA6.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA6.setForeground(new java.awt.Color(255, 255, 255));
        choiceA6.setText("A");
        choiceA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA6ActionPerformed(evt);
            }
        });
        code2Panel.add(choiceA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 90, 90));

        choiceB6.setBackground(new java.awt.Color(0, 153, 153));
        choiceB6.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB6.setForeground(new java.awt.Color(255, 255, 255));
        choiceB6.setText("B");
        choiceB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB6ActionPerformed(evt);
            }
        });
        code2Panel.add(choiceB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 90, 90));

        choiceC6.setBackground(new java.awt.Color(0, 153, 153));
        choiceC6.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC6.setForeground(new java.awt.Color(255, 255, 255));
        choiceC6.setText("C");
        choiceC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC6ActionPerformed(evt);
            }
        });
        code2Panel.add(choiceC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 90, 90));

        choiceD6.setBackground(new java.awt.Color(0, 153, 153));
        choiceD6.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD6.setForeground(new java.awt.Color(255, 255, 255));
        choiceD6.setText("D");
        choiceD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD6ActionPerformed(evt);
            }
        });
        code2Panel.add(choiceD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 90, 90));

        questions6Text.setEditable(false);
        questions6Text.setBackground(new java.awt.Color(39, 55, 85));
        questions6Text.setColumns(20);
        questions6Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions6Text.setForeground(new java.awt.Color(255, 255, 255));
        questions6Text.setLineWrap(true);
        questions6Text.setRows(5);
        questions6Text.setWrapStyleWord(true);
        jScrollPane7.setViewportView(questions6Text);

        code2Panel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 460, 240));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/04.png"))); // NOI18N
        code2Panel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(code2Panel, "card5");

        theoretical5Panel.setBackground(new java.awt.Color(0, 0, 51));
        theoretical5Panel.setForeground(new java.awt.Color(0, 0, 51));
        theoretical5Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB7.setEditable(false);
        optionB7.setBackground(new java.awt.Color(255, 255, 255));
        optionB7.setColumns(20);
        optionB7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionB7.setForeground(new java.awt.Color(0, 0, 51));
        optionB7.setLineWrap(true);
        optionB7.setRows(5);
        optionB7.setWrapStyleWord(true);
        optionB7.setAutoscrolls(false);
        optionB7.setMargin(new java.awt.Insets(10, 10, 10, 10));
        theoretical5Panel.add(optionB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 350, 40));

        optionA7.setEditable(false);
        optionA7.setBackground(new java.awt.Color(216, 203, 199));
        optionA7.setColumns(20);
        optionA7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionA7.setForeground(new java.awt.Color(0, 0, 51));
        optionA7.setLineWrap(true);
        optionA7.setRows(5);
        optionA7.setWrapStyleWord(true);
        optionA7.setAutoscrolls(false);
        theoretical5Panel.add(optionA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 350, 40));

        optionC7.setEditable(false);
        optionC7.setBackground(new java.awt.Color(255, 255, 255));
        optionC7.setColumns(20);
        optionC7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionC7.setForeground(new java.awt.Color(0, 0, 51));
        optionC7.setLineWrap(true);
        optionC7.setRows(5);
        optionC7.setWrapStyleWord(true);
        optionC7.setAutoscrolls(false);
        theoretical5Panel.add(optionC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 350, 40));

        optionD7.setEditable(false);
        optionD7.setBackground(new java.awt.Color(216, 203, 199));
        optionD7.setColumns(20);
        optionD7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionD7.setForeground(new java.awt.Color(0, 0, 51));
        optionD7.setLineWrap(true);
        optionD7.setRows(5);
        optionD7.setWrapStyleWord(true);
        optionD7.setAutoscrolls(false);
        theoretical5Panel.add(optionD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 340, 40));

        secondsLeft6.setEditable(false);
        secondsLeft6.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft6.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft6.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft6ActionPerformed(evt);
            }
        });
        theoretical5Panel.add(secondsLeft6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA7.setBackground(new java.awt.Color(0, 153, 153));
        choiceA7.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA7.setForeground(new java.awt.Color(255, 255, 255));
        choiceA7.setText("A");
        choiceA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA7ActionPerformed(evt);
            }
        });
        theoretical5Panel.add(choiceA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 100));

        choiceB7.setBackground(new java.awt.Color(0, 153, 153));
        choiceB7.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB7.setForeground(new java.awt.Color(255, 255, 255));
        choiceB7.setText("B");
        choiceB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB7ActionPerformed(evt);
            }
        });
        theoretical5Panel.add(choiceB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 100));

        choiceC7.setBackground(new java.awt.Color(0, 153, 153));
        choiceC7.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC7.setForeground(new java.awt.Color(255, 255, 255));
        choiceC7.setText("C");
        choiceC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC7ActionPerformed(evt);
            }
        });
        theoretical5Panel.add(choiceC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 100));

        choiceD7.setBackground(new java.awt.Color(0, 153, 153));
        choiceD7.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD7.setForeground(new java.awt.Color(255, 255, 255));
        choiceD7.setText("D");
        choiceD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD7ActionPerformed(evt);
            }
        });
        theoretical5Panel.add(choiceD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 100, 100));

        questions7Text.setEditable(false);
        questions7Text.setBackground(new java.awt.Color(255, 255, 255));
        questions7Text.setColumns(20);
        questions7Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions7Text.setForeground(new java.awt.Color(0, 0, 51));
        questions7Text.setLineWrap(true);
        questions7Text.setRows(5);
        questions7Text.setWrapStyleWord(true);
        jScrollPane6.setViewportView(questions7Text);

        theoretical5Panel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 670, 260));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.png"))); // NOI18N
        theoretical5Panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(theoretical5Panel, "card5");

        theoretical6Panel.setBackground(new java.awt.Color(0, 0, 51));
        theoretical6Panel.setForeground(new java.awt.Color(0, 0, 51));
        theoretical6Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB8.setEditable(false);
        optionB8.setBackground(new java.awt.Color(255, 255, 255));
        optionB8.setColumns(20);
        optionB8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionB8.setForeground(new java.awt.Color(0, 0, 51));
        optionB8.setLineWrap(true);
        optionB8.setRows(5);
        optionB8.setWrapStyleWord(true);
        optionB8.setAutoscrolls(false);
        optionB8.setMargin(new java.awt.Insets(10, 10, 10, 10));
        theoretical6Panel.add(optionB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 350, 40));

        optionA8.setEditable(false);
        optionA8.setBackground(new java.awt.Color(216, 203, 199));
        optionA8.setColumns(20);
        optionA8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionA8.setForeground(new java.awt.Color(0, 0, 51));
        optionA8.setLineWrap(true);
        optionA8.setRows(5);
        optionA8.setWrapStyleWord(true);
        optionA8.setAutoscrolls(false);
        theoretical6Panel.add(optionA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 350, 40));

        optionC8.setEditable(false);
        optionC8.setBackground(new java.awt.Color(255, 255, 255));
        optionC8.setColumns(20);
        optionC8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionC8.setForeground(new java.awt.Color(0, 0, 51));
        optionC8.setLineWrap(true);
        optionC8.setRows(5);
        optionC8.setWrapStyleWord(true);
        optionC8.setAutoscrolls(false);
        theoretical6Panel.add(optionC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 350, 40));

        optionD8.setEditable(false);
        optionD8.setBackground(new java.awt.Color(216, 203, 199));
        optionD8.setColumns(20);
        optionD8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionD8.setForeground(new java.awt.Color(0, 0, 51));
        optionD8.setLineWrap(true);
        optionD8.setRows(5);
        optionD8.setWrapStyleWord(true);
        optionD8.setAutoscrolls(false);
        theoretical6Panel.add(optionD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 340, 40));

        secondsLeft7.setEditable(false);
        secondsLeft7.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft7.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft7.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft7ActionPerformed(evt);
            }
        });
        theoretical6Panel.add(secondsLeft7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA8.setBackground(new java.awt.Color(0, 153, 153));
        choiceA8.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA8.setForeground(new java.awt.Color(255, 255, 255));
        choiceA8.setText("A");
        choiceA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA8ActionPerformed(evt);
            }
        });
        theoretical6Panel.add(choiceA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 100));

        choiceB8.setBackground(new java.awt.Color(0, 153, 153));
        choiceB8.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB8.setForeground(new java.awt.Color(255, 255, 255));
        choiceB8.setText("B");
        choiceB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB8ActionPerformed(evt);
            }
        });
        theoretical6Panel.add(choiceB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 100));

        choiceC8.setBackground(new java.awt.Color(0, 153, 153));
        choiceC8.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC8.setForeground(new java.awt.Color(255, 255, 255));
        choiceC8.setText("C");
        choiceC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC8ActionPerformed(evt);
            }
        });
        theoretical6Panel.add(choiceC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 100));

        choiceD8.setBackground(new java.awt.Color(0, 153, 153));
        choiceD8.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD8.setForeground(new java.awt.Color(255, 255, 255));
        choiceD8.setText("D");
        choiceD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD8ActionPerformed(evt);
            }
        });
        theoretical6Panel.add(choiceD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 100, 100));

        questions8Text.setEditable(false);
        questions8Text.setBackground(new java.awt.Color(255, 255, 255));
        questions8Text.setColumns(20);
        questions8Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions8Text.setForeground(new java.awt.Color(0, 0, 51));
        questions8Text.setLineWrap(true);
        questions8Text.setRows(5);
        questions8Text.setWrapStyleWord(true);
        jScrollPane8.setViewportView(questions8Text);

        theoretical6Panel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 670, 260));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.png"))); // NOI18N
        theoretical6Panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(theoretical6Panel, "card5");

        code3Panel.setBackground(new java.awt.Color(0, 0, 51));
        code3Panel.setForeground(new java.awt.Color(0, 0, 51));
        code3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB9.setEditable(false);
        optionB9.setBackground(new java.awt.Color(255, 255, 255));
        optionB9.setColumns(20);
        optionB9.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionB9.setForeground(new java.awt.Color(0, 0, 51));
        optionB9.setLineWrap(true);
        optionB9.setRows(5);
        optionB9.setWrapStyleWord(true);
        optionB9.setAutoscrolls(false);
        optionB9.setMargin(new java.awt.Insets(10, 10, 10, 10));
        code3Panel.add(optionB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 240, 50));

        optionA9.setEditable(false);
        optionA9.setBackground(new java.awt.Color(216, 203, 199));
        optionA9.setColumns(20);
        optionA9.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionA9.setForeground(new java.awt.Color(0, 0, 51));
        optionA9.setLineWrap(true);
        optionA9.setRows(5);
        optionA9.setWrapStyleWord(true);
        optionA9.setAutoscrolls(false);
        code3Panel.add(optionA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 270, -1, 50));

        optionC9.setEditable(false);
        optionC9.setBackground(new java.awt.Color(255, 255, 255));
        optionC9.setColumns(20);
        optionC9.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionC9.setForeground(new java.awt.Color(0, 0, 51));
        optionC9.setLineWrap(true);
        optionC9.setRows(5);
        optionC9.setWrapStyleWord(true);
        optionC9.setAutoscrolls(false);
        code3Panel.add(optionC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 240, 40));

        optionD9.setEditable(false);
        optionD9.setBackground(new java.awt.Color(216, 203, 199));
        optionD9.setColumns(20);
        optionD9.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionD9.setForeground(new java.awt.Color(0, 0, 51));
        optionD9.setLineWrap(true);
        optionD9.setRows(5);
        optionD9.setWrapStyleWord(true);
        optionD9.setAutoscrolls(false);
        code3Panel.add(optionD9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 240, 50));

        secondsLeft8.setEditable(false);
        secondsLeft8.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft8.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft8.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft8ActionPerformed(evt);
            }
        });
        code3Panel.add(secondsLeft8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA9.setBackground(new java.awt.Color(0, 153, 153));
        choiceA9.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA9.setForeground(new java.awt.Color(255, 255, 255));
        choiceA9.setText("A");
        choiceA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA9ActionPerformed(evt);
            }
        });
        code3Panel.add(choiceA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 90, 90));

        choiceB9.setBackground(new java.awt.Color(0, 153, 153));
        choiceB9.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB9.setForeground(new java.awt.Color(255, 255, 255));
        choiceB9.setText("B");
        choiceB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB9ActionPerformed(evt);
            }
        });
        code3Panel.add(choiceB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 90, 90));

        choiceC9.setBackground(new java.awt.Color(0, 153, 153));
        choiceC9.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC9.setForeground(new java.awt.Color(255, 255, 255));
        choiceC9.setText("C");
        choiceC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC9ActionPerformed(evt);
            }
        });
        code3Panel.add(choiceC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 90, 90));

        choiceD9.setBackground(new java.awt.Color(0, 153, 153));
        choiceD9.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD9.setForeground(new java.awt.Color(255, 255, 255));
        choiceD9.setText("D");
        choiceD9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD9ActionPerformed(evt);
            }
        });
        code3Panel.add(choiceD9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 90, 90));

        questions9Text.setEditable(false);
        questions9Text.setBackground(new java.awt.Color(39, 55, 85));
        questions9Text.setColumns(20);
        questions9Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions9Text.setForeground(new java.awt.Color(255, 255, 255));
        questions9Text.setLineWrap(true);
        questions9Text.setRows(5);
        questions9Text.setWrapStyleWord(true);
        jScrollPane9.setViewportView(questions9Text);

        code3Panel.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 460, 240));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/04.png"))); // NOI18N
        code3Panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(code3Panel, "card5");

        theoretical7Panel.setBackground(new java.awt.Color(0, 0, 51));
        theoretical7Panel.setForeground(new java.awt.Color(0, 0, 51));
        theoretical7Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB10.setEditable(false);
        optionB10.setBackground(new java.awt.Color(255, 255, 255));
        optionB10.setColumns(20);
        optionB10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionB10.setForeground(new java.awt.Color(0, 0, 51));
        optionB10.setLineWrap(true);
        optionB10.setRows(5);
        optionB10.setWrapStyleWord(true);
        optionB10.setAutoscrolls(false);
        optionB10.setMargin(new java.awt.Insets(10, 10, 10, 10));
        theoretical7Panel.add(optionB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 350, 40));

        optionA10.setEditable(false);
        optionA10.setBackground(new java.awt.Color(216, 203, 199));
        optionA10.setColumns(20);
        optionA10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionA10.setForeground(new java.awt.Color(0, 0, 51));
        optionA10.setLineWrap(true);
        optionA10.setRows(5);
        optionA10.setWrapStyleWord(true);
        optionA10.setAutoscrolls(false);
        theoretical7Panel.add(optionA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 350, 40));

        optionC10.setEditable(false);
        optionC10.setBackground(new java.awt.Color(255, 255, 255));
        optionC10.setColumns(20);
        optionC10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionC10.setForeground(new java.awt.Color(0, 0, 51));
        optionC10.setLineWrap(true);
        optionC10.setRows(5);
        optionC10.setWrapStyleWord(true);
        optionC10.setAutoscrolls(false);
        theoretical7Panel.add(optionC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 350, 40));

        optionD10.setEditable(false);
        optionD10.setBackground(new java.awt.Color(216, 203, 199));
        optionD10.setColumns(20);
        optionD10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        optionD10.setForeground(new java.awt.Color(0, 0, 51));
        optionD10.setLineWrap(true);
        optionD10.setRows(5);
        optionD10.setWrapStyleWord(true);
        optionD10.setAutoscrolls(false);
        theoretical7Panel.add(optionD10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 340, 40));

        secondsLeft9.setEditable(false);
        secondsLeft9.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft9.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft9.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft9ActionPerformed(evt);
            }
        });
        theoretical7Panel.add(secondsLeft9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA10.setBackground(new java.awt.Color(0, 153, 153));
        choiceA10.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA10.setForeground(new java.awt.Color(255, 255, 255));
        choiceA10.setText("A");
        choiceA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA10ActionPerformed(evt);
            }
        });
        theoretical7Panel.add(choiceA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 100));

        choiceB10.setBackground(new java.awt.Color(0, 153, 153));
        choiceB10.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB10.setForeground(new java.awt.Color(255, 255, 255));
        choiceB10.setText("B");
        choiceB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB10ActionPerformed(evt);
            }
        });
        theoretical7Panel.add(choiceB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 100));

        choiceC10.setBackground(new java.awt.Color(0, 153, 153));
        choiceC10.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC10.setForeground(new java.awt.Color(255, 255, 255));
        choiceC10.setText("C");
        choiceC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC10ActionPerformed(evt);
            }
        });
        theoretical7Panel.add(choiceC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 100));

        choiceD10.setBackground(new java.awt.Color(0, 153, 153));
        choiceD10.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD10.setForeground(new java.awt.Color(255, 255, 255));
        choiceD10.setText("D");
        choiceD10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD10ActionPerformed(evt);
            }
        });
        theoretical7Panel.add(choiceD10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 100, 100));

        questions10Text.setEditable(false);
        questions10Text.setBackground(new java.awt.Color(255, 255, 255));
        questions10Text.setColumns(20);
        questions10Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions10Text.setForeground(new java.awt.Color(0, 0, 51));
        questions10Text.setLineWrap(true);
        questions10Text.setRows(5);
        questions10Text.setWrapStyleWord(true);
        jScrollPane10.setViewportView(questions10Text);

        theoretical7Panel.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 670, 260));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.png"))); // NOI18N
        theoretical7Panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(theoretical7Panel, "card5");

        code4Panel.setBackground(new java.awt.Color(0, 0, 51));
        code4Panel.setForeground(new java.awt.Color(0, 0, 51));
        code4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionB11.setEditable(false);
        optionB11.setBackground(new java.awt.Color(255, 255, 255));
        optionB11.setColumns(20);
        optionB11.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionB11.setForeground(new java.awt.Color(0, 0, 51));
        optionB11.setLineWrap(true);
        optionB11.setRows(5);
        optionB11.setWrapStyleWord(true);
        optionB11.setAutoscrolls(false);
        optionB11.setMargin(new java.awt.Insets(10, 10, 10, 10));
        code4Panel.add(optionB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 240, 50));

        optionA11.setEditable(false);
        optionA11.setBackground(new java.awt.Color(216, 203, 199));
        optionA11.setColumns(20);
        optionA11.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionA11.setForeground(new java.awt.Color(0, 0, 51));
        optionA11.setLineWrap(true);
        optionA11.setRows(5);
        optionA11.setWrapStyleWord(true);
        optionA11.setAutoscrolls(false);
        code4Panel.add(optionA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 270, -1, 50));

        optionC11.setEditable(false);
        optionC11.setBackground(new java.awt.Color(255, 255, 255));
        optionC11.setColumns(20);
        optionC11.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionC11.setForeground(new java.awt.Color(0, 0, 51));
        optionC11.setLineWrap(true);
        optionC11.setRows(5);
        optionC11.setWrapStyleWord(true);
        optionC11.setAutoscrolls(false);
        code4Panel.add(optionC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 240, 40));

        optionD11.setEditable(false);
        optionD11.setBackground(new java.awt.Color(216, 203, 199));
        optionD11.setColumns(20);
        optionD11.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        optionD11.setForeground(new java.awt.Color(0, 0, 51));
        optionD11.setLineWrap(true);
        optionD11.setRows(5);
        optionD11.setWrapStyleWord(true);
        optionD11.setAutoscrolls(false);
        code4Panel.add(optionD11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 240, 50));

        secondsLeft10.setEditable(false);
        secondsLeft10.setBackground(new java.awt.Color(255, 255, 255));
        secondsLeft10.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        secondsLeft10.setForeground(new java.awt.Color(0, 0, 51));
        secondsLeft10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondsLeft10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsLeft10ActionPerformed(evt);
            }
        });
        code4Panel.add(secondsLeft10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 90));

        choiceA11.setBackground(new java.awt.Color(0, 153, 153));
        choiceA11.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceA11.setForeground(new java.awt.Color(255, 255, 255));
        choiceA11.setText("A");
        choiceA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceA11ActionPerformed(evt);
            }
        });
        code4Panel.add(choiceA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 90, 90));

        choiceB11.setBackground(new java.awt.Color(0, 153, 153));
        choiceB11.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceB11.setForeground(new java.awt.Color(255, 255, 255));
        choiceB11.setText("B");
        choiceB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceB11ActionPerformed(evt);
            }
        });
        code4Panel.add(choiceB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 90, 90));

        choiceC11.setBackground(new java.awt.Color(0, 153, 153));
        choiceC11.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceC11.setForeground(new java.awt.Color(255, 255, 255));
        choiceC11.setText("C");
        choiceC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceC11ActionPerformed(evt);
            }
        });
        code4Panel.add(choiceC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 90, 90));

        choiceD11.setBackground(new java.awt.Color(0, 153, 153));
        choiceD11.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        choiceD11.setForeground(new java.awt.Color(255, 255, 255));
        choiceD11.setText("D");
        choiceD11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceD11ActionPerformed(evt);
            }
        });
        code4Panel.add(choiceD11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 90, 90));

        questions11Text.setEditable(false);
        questions11Text.setBackground(new java.awt.Color(39, 55, 85));
        questions11Text.setColumns(20);
        questions11Text.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        questions11Text.setForeground(new java.awt.Color(255, 255, 255));
        questions11Text.setLineWrap(true);
        questions11Text.setRows(5);
        questions11Text.setWrapStyleWord(true);
        jScrollPane11.setViewportView(questions11Text);

        code4Panel.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 460, 240));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/04.png"))); // NOI18N
        code4Panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(code4Panel, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void displayT1Question() throws FileNotFoundException, IOException {
        int a = theoRNG();
        switch(a) {
            case 0 -> {
                String qsn00,ch000,ch001,ch002,ch003,crc;
                String chc000 = null,chc001 = null,chc002 = null,chc003 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/1/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn00 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn00);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/1/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch000 = br.readLine()) != null) {
                        chc000 = ch000;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/1/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch001 = br.readLine()) != null) {
                        chc001 = ch001;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/1/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch002 = br.readLine()) != null) {
                        chc002 = ch002;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/1/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch003 = br.readLine()) != null) {
                        chc003 = ch003;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/1/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q00choices = {chc000,chc001,chc002,chc003};
                
                choiceShuffle(q00choices);

                optionA1.setText(q00choices[0]);
                optionB1.setText(q00choices[1]);
                optionC1.setText(q00choices[2]);
                optionD1.setText(q00choices[3]);
            }
            case 1 -> {
                String qsn01,ch010,ch011,ch012,ch013,crc;
                String chc010 = null,chc011 = null,chc012 = null,chc013 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/2/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn01 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn01);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/2/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch010 = br.readLine()) != null) {
                        chc010 = ch010;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/2/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch011 = br.readLine()) != null) {
                        chc011 = ch011;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/2/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch012 = br.readLine()) != null) {
                        chc012 = ch012;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/2/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch013 = br.readLine()) != null) {
                        chc013 = ch013;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/2/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q01choices = {chc010,chc011,chc012,chc013};
                
                choiceShuffle(q01choices);

                optionA1.setText(q01choices[0]);
                optionB1.setText(q01choices[1]);
                optionC1.setText(q01choices[2]);
                optionD1.setText(q01choices[3]);
            }
            case 2 -> {
                String qsn02,ch020,ch021,ch022,ch023,crc;
                String chc020 = null,chc021 = null,chc022 = null,chc023 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/3/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn02 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn02);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/3/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch020 = br.readLine()) != null) {
                        chc020 = ch020;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/3/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch021 = br.readLine()) != null) {
                        chc021 = ch021;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/3/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch022 = br.readLine()) != null) {
                        chc022 = ch022;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/3/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch023 = br.readLine()) != null) {
                        chc023 = ch023;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/3/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q02choices = {chc020,chc021,chc022,chc023};
                
                choiceShuffle(q02choices);

                optionA1.setText(q02choices[0]);
                optionB1.setText(q02choices[1]);
                optionC1.setText(q02choices[2]);
                optionD1.setText(q02choices[3]);
            }
            case 3 -> {
                String qsn03,ch030,ch031,ch032,ch033,crc;
                String chc030 = null,chc031 = null,chc032 = null,chc033 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/4/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn03 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn03);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/4/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch030 = br.readLine()) != null) {
                        chc030 = ch030;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/4/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch031 = br.readLine()) != null) {
                        chc031 = ch031;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/4/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch032 = br.readLine()) != null) {
                        chc032 = ch032;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/4/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch033 = br.readLine()) != null) {
                        chc033 = ch033;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/4/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q03choices = {chc030,chc031,chc032,chc033};
                
                choiceShuffle(q03choices);

                optionA1.setText(q03choices[0]);
                optionB1.setText(q03choices[1]);
                optionC1.setText(q03choices[2]);
                optionD1.setText(q03choices[3]);
            }
            case 4 -> {
                String qsn04,ch040,ch041,ch042,ch043,crc;
                String chc040 = null,chc041 = null,chc042 = null,chc043 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/5/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn04 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn04);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/5/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch040 = br.readLine()) != null) {
                        chc040 = ch040;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/5/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch041 = br.readLine()) != null) {
                        chc041 = ch041;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/5/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch042 = br.readLine()) != null) {
                        chc042 = ch042;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/5/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch043 = br.readLine()) != null) {
                        chc043 = ch043;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/5/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q04choices = {chc040,chc041,chc042,chc043};
                
                choiceShuffle(q04choices);

                optionA1.setText(q04choices[0]);
                optionB1.setText(q04choices[1]);
                optionC1.setText(q04choices[2]);
                optionD1.setText(q04choices[3]);
            }
            case 5 -> {
                String qsn05,ch050,ch051,ch052,ch053,crc;
                String chc050 = null,chc051 = null,chc052 = null,chc053 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/6/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn05 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn05);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/6/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch050 = br.readLine()) != null) {
                        chc050 = ch050;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/6/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch051 = br.readLine()) != null) {
                        chc051 = ch051;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/6/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch052 = br.readLine()) != null) {
                        chc052 = ch052;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/6/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch053 = br.readLine()) != null) {
                        chc053 = ch053;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/6/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q05choices = {chc050,chc051,chc052,chc053};
                
                choiceShuffle(q05choices);

                optionA1.setText(q05choices[0]);
                optionB1.setText(q05choices[1]);
                optionC1.setText(q05choices[2]);
                optionD1.setText(q05choices[3]);
            }
            case 6 -> {
                String qsn06,ch060,ch061,ch062,ch063,crc;
                String chc060 = null,chc061 = null,chc062 = null,chc063 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/7/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn06 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn06);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/7/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch060 = br.readLine()) != null) {
                        chc060 = ch060;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/7/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch061 = br.readLine()) != null) {
                        chc061 = ch061;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/7/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch062 = br.readLine()) != null) {
                        chc062 = ch062;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/7/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch063 = br.readLine()) != null) {
                        chc063 = ch063;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/7/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q06choices = {chc060,chc061,chc062,chc063};
                
                choiceShuffle(q06choices);

                optionA1.setText(q06choices[0]);
                optionB1.setText(q06choices[1]);
                optionC1.setText(q06choices[2]);
                optionD1.setText(q06choices[3]);
            }
            case 7 -> {
                String qsn07,ch070,ch071,ch072,ch073,crc;
                String chc070 = null,chc071 = null,chc072 = null,chc073 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/8/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn07 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn07);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/8/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch070 = br.readLine()) != null) {
                        chc070 = ch070;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/8/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch071 = br.readLine()) != null) {
                        chc071 = ch071;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/8/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch072 = br.readLine()) != null) {
                        chc072 = ch072;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/8/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch073 = br.readLine()) != null) {
                        chc073 = ch073;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/8/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q07choices = {chc070,chc071,chc072,chc073};
                
                choiceShuffle(q07choices);

                optionA1.setText(q07choices[0]);
                optionB1.setText(q07choices[1]);
                optionC1.setText(q07choices[2]);
                optionD1.setText(q07choices[3]);
            }
            case 8 -> {
                String qsn08,ch080,ch081,ch082,ch083,crc;
                String chc080 = null,chc081 = null,chc082 = null,chc083 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/9/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn08 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn08);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/9/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch080 = br.readLine()) != null) {
                        chc080 = ch080;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/9/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch081 = br.readLine()) != null) {
                        chc081 = ch081;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/9/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch082 = br.readLine()) != null) {
                        chc082 = ch082;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/9/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch083 = br.readLine()) != null) {
                        chc083 = ch083;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/9/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q08choices = {chc080,chc081,chc082,chc083};
                
                choiceShuffle(q08choices);

                optionA1.setText(q08choices[0]);
                optionB1.setText(q08choices[1]);
                optionC1.setText(q08choices[2]);
                optionD1.setText(q08choices[3]);
            }
            case 9 -> {
                String qsn09,ch090,ch091,ch092,ch093,crc;
                String chc090 = null,chc091 = null,chc092 = null,chc093 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/10/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn09 = br.readLine()) != null) {
                        questions1Text.setText(questions1Text.getText()+"\n" + qsn09);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/10/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch090 = br.readLine()) != null) {
                        chc090 = ch090;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/10/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch091 = br.readLine()) != null) {
                        chc091 = ch091;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/10/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch092 = br.readLine()) != null) {
                        chc092 = ch092;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/10/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch093 = br.readLine()) != null) {
                        chc093 = ch093;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/1/10/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q09choices = {chc090,chc091,chc092,chc093};
                
                choiceShuffle(q09choices);

                optionA1.setText(q09choices[0]);
                optionB1.setText(q09choices[1]);
                optionC1.setText(q09choices[2]);
                optionD1.setText(q09choices[3]);
            }
        }
    }
    
    public void displayT2Question() throws FileNotFoundException, IOException {
        int a = theoRNG();
        switch(a) {
            case 0 -> {
                String qsn10,ch100,ch101,ch102,ch103,crc;
                String chc100 = null,chc101 = null,chc102 = null,chc103 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/1/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn10 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn10);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/1/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch100 = br.readLine()) != null) {
                        chc100 = ch100;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/1/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch101 = br.readLine()) != null) {
                        chc101 = ch101;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/1/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch102 = br.readLine()) != null) {
                        chc102 = ch102;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/1/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch103 = br.readLine()) != null) {
                        chc103 = ch103;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/1/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q10choices = {chc100,chc101,chc102,chc103};
                
                choiceShuffle(q10choices);

                optionA2.setText(q10choices[0]);
                optionB2.setText(q10choices[1]);
                optionC2.setText(q10choices[2]);
                optionD2.setText(q10choices[3]);
            }
            case 1 -> {
                String qsn11,ch110,ch111,ch112,ch113,crc;
                String chc110 = null,chc111 = null,chc112 = null,chc113 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/2/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn11 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn11);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/2/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch110 = br.readLine()) != null) {
                        chc110 = ch110;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/2/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch111 = br.readLine()) != null) {
                        chc111 = ch111;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/2/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch112 = br.readLine()) != null) {
                        chc112 = ch112;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/2/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch113 = br.readLine()) != null) {
                        chc113 = ch113;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/2/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q11choices = {chc110,chc111,chc112,chc113};
                
                choiceShuffle(q11choices);

                optionA2.setText(q11choices[0]);
                optionB2.setText(q11choices[1]);
                optionC2.setText(q11choices[2]);
                optionD2.setText(q11choices[3]);
            }
            case 2 -> {
                String qsn12,ch120,ch121,ch122,ch123,crc;
                String chc120 = null,chc121 = null,chc122 = null,chc123 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/3/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn12 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn12);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/3/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch120 = br.readLine()) != null) {
                        chc120 = ch120;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/3/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch121 = br.readLine()) != null) {
                        chc121 = ch121;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/3/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch122 = br.readLine()) != null) {
                        chc122 = ch122;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/3/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch123 = br.readLine()) != null) {
                        chc123 = ch123;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/3/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q12choices = {chc120,chc121,chc122,chc123};
                
                choiceShuffle(q12choices);

                optionA2.setText(q12choices[0]);
                optionB2.setText(q12choices[1]);
                optionC2.setText(q12choices[2]);
                optionD2.setText(q12choices[3]);
            }
            case 3 -> {
                String qsn13,ch130,ch131,ch132,ch133,crc;
                String chc130 = null,chc131 = null,chc132 = null,chc133 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/4/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn13 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn13);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/4/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch130 = br.readLine()) != null) {
                        chc130 = ch130;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/4/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch131 = br.readLine()) != null) {
                        chc131 = ch131;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/4/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch132 = br.readLine()) != null) {
                        chc132 = ch132;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/4/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch133 = br.readLine()) != null) {
                        chc133 = ch133;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/4/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q13choices = {chc130,chc131,chc132,chc133};
                
                choiceShuffle(q13choices);

                optionA2.setText(q13choices[0]);
                optionB2.setText(q13choices[1]);
                optionC2.setText(q13choices[2]);
                optionD2.setText(q13choices[3]);
            }
            case 4 -> {
                String qsn14,ch140,ch141,ch142,ch143,crc;
                String chc140 = null,chc141 = null,chc142 = null,chc143 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/5/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn14 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn14);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/5/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch140 = br.readLine()) != null) {
                        chc140 = ch140;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/5/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch141 = br.readLine()) != null) {
                        chc141 = ch141;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/5/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch142 = br.readLine()) != null) {
                        chc142 = ch142;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/5/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch143 = br.readLine()) != null) {
                        chc143 = ch143;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/5/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q14choices = {chc140,chc141,chc142,chc143};
                
                choiceShuffle(q14choices);

                optionA2.setText(q14choices[0]);
                optionB2.setText(q14choices[1]);
                optionC2.setText(q14choices[2]);
                optionD2.setText(q14choices[3]);
            }
            case 5 -> {
                String qsn15,ch150,ch151,ch152,ch153,crc;
                String chc150 = null,chc151 = null,chc152 = null,chc153 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/6/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn15 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn15);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/6/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch150 = br.readLine()) != null) {
                        chc150 = ch150;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/6/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch151 = br.readLine()) != null) {
                        chc151 = ch151;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/6/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch152 = br.readLine()) != null) {
                        chc152 = ch152;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/6/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch153 = br.readLine()) != null) {
                        chc153 = ch153;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/6/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q15choices = {chc150,chc151,chc152,chc153};
                
                choiceShuffle(q15choices);

                optionA2.setText(q15choices[0]);
                optionB2.setText(q15choices[1]);
                optionC2.setText(q15choices[2]);
                optionD2.setText(q15choices[3]);
            }
            case 6 -> {
                String qsn16,ch160,ch161,ch162,ch163,crc;
                String chc160 = null,chc161 = null,chc162 = null,chc163 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/7/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn16 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn16);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/7/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch160 = br.readLine()) != null) {
                        chc160 = ch160;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/7/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch161 = br.readLine()) != null) {
                        chc161 = ch161;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/7/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch162 = br.readLine()) != null) {
                        chc162 = ch162;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/7/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch163 = br.readLine()) != null) {
                        chc163 = ch163;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/7/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q16choices = {chc160,chc161,chc162,chc163};
                
                choiceShuffle(q16choices);

                optionA2.setText(q16choices[0]);
                optionB2.setText(q16choices[1]);
                optionC2.setText(q16choices[2]);
                optionD2.setText(q16choices[3]);
            }
            case 7 -> {
                String qsn17,ch170,ch171,ch172,ch173,crc;
                String chc170 = null,chc171 = null,chc172 = null,chc173 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/8/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn17 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn17);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/8/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch170 = br.readLine()) != null) {
                        chc170 = ch170;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/8/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch171 = br.readLine()) != null) {
                        chc171 = ch171;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/8/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch172 = br.readLine()) != null) {
                        chc172 = ch172;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/8/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch173 = br.readLine()) != null) {
                        chc173 = ch173;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/8/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q17choices = {chc170,chc171,chc172,chc173};
                
                choiceShuffle(q17choices);

                optionA2.setText(q17choices[0]);
                optionB2.setText(q17choices[1]);
                optionC2.setText(q17choices[2]);
                optionD2.setText(q17choices[3]);
            }
            case 8 -> {
                String qsn18,ch180,ch181,ch182,ch183,crc;
                String chc180 = null,chc181 = null,chc182 = null,chc183 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/9/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn18 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn18);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/9/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch180 = br.readLine()) != null) {
                        chc180 = ch180;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/9/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch181 = br.readLine()) != null) {
                        chc181 = ch181;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/9/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch182 = br.readLine()) != null) {
                        chc182 = ch182;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/9/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch183 = br.readLine()) != null) {
                        chc183 = ch183;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/9/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q18choices = {chc180,chc181,chc182,chc183};
                
                choiceShuffle(q18choices);

                optionA2.setText(q18choices[0]);
                optionB2.setText(q18choices[1]);
                optionC2.setText(q18choices[2]);
                optionD2.setText(q18choices[3]);
            }
            case 9 -> {
                String qsn19,ch190,ch191,ch192,ch193,crc;
                String chc190 = null,chc191 = null,chc192 = null,chc193 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/10/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn19 = br.readLine()) != null) {
                        questions2Text.setText(questions2Text.getText()+"\n" + qsn19);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/10/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch190 = br.readLine()) != null) {
                        chc190 = ch190;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/10/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch191 = br.readLine()) != null) {
                        chc191 = ch191;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/10/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch192 = br.readLine()) != null) {
                        chc192 = ch192;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/10/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch193 = br.readLine()) != null) {
                        chc193 = ch193;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/2/10/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q19choices = {chc190,chc191,chc192,chc193};
                
                choiceShuffle(q19choices);

                optionA2.setText(q19choices[0]);
                optionB2.setText(q19choices[1]);
                optionC2.setText(q19choices[2]);
                optionD2.setText(q19choices[3]);
            }
        }
    }
    
    public void displayP1Question() throws FileNotFoundException, IOException {
        int a = progRNG();
        switch(a) {
            case 0 -> {
                String qsn20,ch200,ch201,ch202,ch203,crc;
                String chc200 = null,chc201 = null,chc202 = null,chc203 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/1/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn20 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn20);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/1/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch200 = br.readLine()) != null) {
                        chc200 = ch200;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/1/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch201 = br.readLine()) != null) {
                        chc201 = ch201;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/1/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch202 = br.readLine()) != null) {
                        chc202 = ch202;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/1/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch203 = br.readLine()) != null) {
                        chc203 = ch203;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/1/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q20choices = {chc200,chc201,chc202,chc203};
                
                choiceShuffle(q20choices);

                optionA3.setText(q20choices[0]);
                optionB3.setText(q20choices[1]);
                optionC3.setText(q20choices[2]);
                optionD3.setText(q20choices[3]);
            }
            case 1 -> {
                String qsn21,ch210,ch211,ch212,ch213,crc;
                String chc210 = null,chc211 = null,chc212 = null,chc213 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/2/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn21 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn21);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/2/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch210 = br.readLine()) != null) {
                        chc210 = ch210;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/2/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch211 = br.readLine()) != null) {
                        chc211 = ch211;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/2/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch212 = br.readLine()) != null) {
                        chc212 = ch212;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/2/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch213 = br.readLine()) != null) {
                        chc213 = ch213;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/2/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q21choices = {chc210,chc211,chc212,chc213};
                
                choiceShuffle(q21choices);

                optionA3.setText(q21choices[0]);
                optionB3.setText(q21choices[1]);
                optionC3.setText(q21choices[2]);
                optionD3.setText(q21choices[3]);
            }
            case 2 -> {
                String qsn22,ch220,ch221,ch222,ch223,crc;
                String chc220 = null,chc221 = null,chc222 = null,chc223 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/3/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn22 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn22);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/3/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch220 = br.readLine()) != null) {
                        chc220 = ch220;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/3/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch221 = br.readLine()) != null) {
                        chc221 = ch221;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/3/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch222 = br.readLine()) != null) {
                        chc222 = ch222;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/3/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch223 = br.readLine()) != null) {
                        chc223 = ch223;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/3/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q22choices = {chc220,chc221,chc222,chc223};
                
                choiceShuffle(q22choices);

                optionA3.setText(q22choices[0]);
                optionB3.setText(q22choices[1]);
                optionC3.setText(q22choices[2]);
                optionD3.setText(q22choices[3]);
            }
            case 3 -> {
                String qsn23,ch230,ch231,ch232,ch233,crc;
                String chc230 = null,chc231 = null,chc232 = null,chc233 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/4/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn23 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn23);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/4/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch230 = br.readLine()) != null) {
                        chc230 = ch230;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/4/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch231 = br.readLine()) != null) {
                        chc231 = ch231;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/4/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch232 = br.readLine()) != null) {
                        chc232 = ch232;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/4/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch233 = br.readLine()) != null) {
                        chc233 = ch233;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/4/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q23choices = {chc230,chc231,chc232,chc233};
                
                choiceShuffle(q23choices);

                optionA3.setText(q23choices[0]);
                optionB3.setText(q23choices[1]);
                optionC3.setText(q23choices[2]);
                optionD3.setText(q23choices[3]);
            }
            case 4 -> {
                String qsn24,ch240,ch241,ch242,ch243,crc;
                String chc240 = null,chc241 = null,chc242 = null,chc243 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/5/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn24 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn24);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/5/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch240 = br.readLine()) != null) {
                        chc240 = ch240;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/5/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch241 = br.readLine()) != null) {
                        chc241 = ch241;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/5/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch242 = br.readLine()) != null) {
                        chc242 = ch242;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/5/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch243 = br.readLine()) != null) {
                        chc243 = ch243;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/5/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q24choices = {chc240,chc241,chc242,chc243};
                
                choiceShuffle(q24choices);

                optionA3.setText(q24choices[0]);
                optionB3.setText(q24choices[1]);
                optionC3.setText(q24choices[2]);
                optionD3.setText(q24choices[3]);
            }
            case 5 -> {
                String qsn25,ch250,ch251,ch252,ch253,crc;
                String chc250 = null,chc251 = null,chc252 = null,chc253 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/6/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn25 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn25);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/6/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch250 = br.readLine()) != null) {
                        chc250 = ch250;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/6/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch251 = br.readLine()) != null) {
                        chc251 = ch251;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/6/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch252 = br.readLine()) != null) {
                        chc252 = ch252;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/6/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch253 = br.readLine()) != null) {
                        chc253 = ch253;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/6/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q25choices = {chc250,chc251,chc252,chc253};
                
                choiceShuffle(q25choices);

                optionA3.setText(q25choices[0]);
                optionB3.setText(q25choices[1]);
                optionC3.setText(q25choices[2]);
                optionD3.setText(q25choices[3]);
            }
            case 6 -> {
                String qsn26,ch260,ch261,ch262,ch263,crc;
                String chc260 = null,chc261 = null,chc262 = null,chc263 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/7/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn26 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn26);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/7/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch260 = br.readLine()) != null) {
                        chc260 = ch260;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/7/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch261 = br.readLine()) != null) {
                        chc261 = ch261;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/7/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch262 = br.readLine()) != null) {
                        chc262 = ch262;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/7/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch263 = br.readLine()) != null) {
                        chc263 = ch263;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/7/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q26choices = {chc260,chc261,chc262,chc263};
                
                choiceShuffle(q26choices);

                optionA3.setText(q26choices[0]);
                optionB3.setText(q26choices[1]);
                optionC3.setText(q26choices[2]);
                optionD3.setText(q26choices[3]);
            }
            case 7 -> {
                String qsn27,ch270,ch271,ch272,ch273,crc;
                String chc270 = null,chc271 = null,chc272 = null,chc273 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/8/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn27 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn27);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/8/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch270 = br.readLine()) != null) {
                        chc270 = ch270;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/8/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch271 = br.readLine()) != null) {
                        chc271 = ch271;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/8/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch272 = br.readLine()) != null) {
                        chc272 = ch272;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/8/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch273 = br.readLine()) != null) {
                        chc273 = ch273;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/8/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q27choices = {chc270,chc271,chc272,chc273};
                
                choiceShuffle(q27choices);

                optionA3.setText(q27choices[0]);
                optionB3.setText(q27choices[1]);
                optionC3.setText(q27choices[2]);
                optionD3.setText(q27choices[3]);
            }
            case 8 -> {
                String qsn28,ch280,ch281,ch282,ch283,crc;
                String chc280 = null,chc281 = null,chc282 = null,chc283 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/9/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn28 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn28);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/9/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch280 = br.readLine()) != null) {
                        chc280 = ch280;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/9/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch281 = br.readLine()) != null) {
                        chc281 = ch281;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/9/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch282 = br.readLine()) != null) {
                        chc282 = ch282;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/9/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch283 = br.readLine()) != null) {
                        chc283 = ch283;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/9/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q28choices = {chc280,chc281,chc282,chc283};
                
                choiceShuffle(q28choices);

                optionA3.setText(q28choices[0]);
                optionB3.setText(q28choices[1]);
                optionC3.setText(q28choices[2]);
                optionD3.setText(q28choices[3]);
            }
            case 9 -> {
                String qsn29,ch290,ch291,ch292,ch293,crc;
                String chc290 = null,chc291 = null,chc292 = null,chc293 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/10/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn29 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn29);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/10/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch290 = br.readLine()) != null) {
                        chc290 = ch290;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/10/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch291 = br.readLine()) != null) {
                        chc291 = ch291;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/10/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch292 = br.readLine()) != null) {
                        chc292 = ch292;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/10/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch293 = br.readLine()) != null) {
                        chc293 = ch293;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/10/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q29choices = {chc290,chc291,chc292,chc293};
                
                choiceShuffle(q29choices);

                optionA3.setText(q29choices[0]);
                optionB3.setText(q29choices[1]);
                optionC3.setText(q29choices[2]);
                optionD3.setText(q29choices[3]);
            }
            case 10 -> {
                String qsn210,ch2100,ch2101,ch2102,ch2103,crc;
                String chc2100 = null,chc2101 = null,chc2102 = null,chc2103 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/11/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn210 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn210);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/11/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2100 = br.readLine()) != null) {
                        chc2100 = ch2100;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/11/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2101 = br.readLine()) != null) {
                        chc2101 = ch2101;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/11/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2102 = br.readLine()) != null) {
                        chc2102 = ch2102;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/11/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2103 = br.readLine()) != null) {
                        chc2103 = ch2103;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/11/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q210choices = {chc2100,chc2101,chc2102,chc2103};
                
                choiceShuffle(q210choices);

                optionA3.setText(q210choices[0]);
                optionB3.setText(q210choices[1]);
                optionC3.setText(q210choices[2]);
                optionD3.setText(q210choices[3]);
            }
            case 11 -> {
                String qsn211,ch2110,ch2111,ch2112,ch2113,crc;
                String chc2110 = null,chc2111 = null,chc2112 = null,chc2113 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/12/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn211 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn211);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/12/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2110 = br.readLine()) != null) {
                        chc2110 = ch2110;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/12/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2111 = br.readLine()) != null) {
                        chc2111 = ch2111;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/12/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2112 = br.readLine()) != null) {
                        chc2112 = ch2112;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/12/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2113 = br.readLine()) != null) {
                        chc2113 = ch2113;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/12/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q211choices = {chc2110,chc2111,chc2112,chc2113};
                
                choiceShuffle(q211choices);

                optionA3.setText(q211choices[0]);
                optionB3.setText(q211choices[1]);
                optionC3.setText(q211choices[2]);
                optionD3.setText(q211choices[3]);
            }
            case 12 -> {
                String qsn212,ch2120,ch2121,ch2122,ch2123,crc;
                String chc2120 = null,chc2121 = null,chc2122 = null,chc2123 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/13/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn212 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn212);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/13/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2120 = br.readLine()) != null) {
                        chc2120 = ch2120;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/13/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2121 = br.readLine()) != null) {
                        chc2121 = ch2121;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/13/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2122 = br.readLine()) != null) {
                        chc2122 = ch2122;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/13/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2123 = br.readLine()) != null) {
                        chc2123 = ch2123;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/13/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q212choices = {chc2120,chc2121,chc2122,chc2123};
                
                choiceShuffle(q212choices);

                optionA3.setText(q212choices[0]);
                optionB3.setText(q212choices[1]);
                optionC3.setText(q212choices[2]);
                optionD3.setText(q212choices[3]);
            }
            case 13 -> {
                String qsn213,ch2130,ch2131,ch2132,ch2133,crc;
                String chc2130 = null,chc2131 = null,chc2132 = null,chc2133 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/14/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn213 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn213);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/14/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2130 = br.readLine()) != null) {
                        chc2130 = ch2130;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/14/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2131 = br.readLine()) != null) {
                        chc2131 = ch2131;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/14/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2132 = br.readLine()) != null) {
                        chc2132 = ch2132;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/14/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2133 = br.readLine()) != null) {
                        chc2133 = ch2133;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/14/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q213choices = {chc2130,chc2131,chc2132,chc2133};
                
                choiceShuffle(q213choices);

                optionA3.setText(q213choices[0]);
                optionB3.setText(q213choices[1]);
                optionC3.setText(q213choices[2]);
                optionD3.setText(q213choices[3]);
            }
            case 14 -> {
                String qsn214,ch2140,ch2141,ch2142,ch2143,crc;
                String chc2140 = null,chc2141 = null,chc2142 = null,chc2143 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/15/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn214 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn214);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/15/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2140 = br.readLine()) != null) {
                        chc2140 = ch2140;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/15/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2141 = br.readLine()) != null) {
                        chc2141 = ch2141;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/15/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2142 = br.readLine()) != null) {
                        chc2142 = ch2142;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/15/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2143 = br.readLine()) != null) {
                        chc2143 = ch2143;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/15/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q214choices = {chc2140,chc2141,chc2142,chc2143};
                
                choiceShuffle(q214choices);

                optionA3.setText(q214choices[0]);
                optionB3.setText(q214choices[1]);
                optionC3.setText(q214choices[2]);
                optionD3.setText(q214choices[3]);
            }
            case 15 -> {
                String qsn215,ch2150,ch2151,ch2152,ch2153,crc;
                String chc2150 = null,chc2151 = null,chc2152 = null,chc2153 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/16/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn215 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn215);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/16/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2150 = br.readLine()) != null) {
                        chc2150 = ch2150;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/16/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2151 = br.readLine()) != null) {
                        chc2151 = ch2151;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/16/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2152 = br.readLine()) != null) {
                        chc2152 = ch2152;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/16/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2153 = br.readLine()) != null) {
                        chc2153 = ch2153;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/16/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q215choices = {chc2150,chc2151,chc2152,chc2153};
                
                choiceShuffle(q215choices);

                optionA3.setText(q215choices[0]);
                optionB3.setText(q215choices[1]);
                optionC3.setText(q215choices[2]);
                optionD3.setText(q215choices[3]);
            }
            case 16 -> {
                String qsn216,ch2160,ch2161,ch2162,ch2163,crc;
                String chc2160 = null,chc2161 = null,chc2162 = null,chc2163 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/17/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn216 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn216);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/17/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2160 = br.readLine()) != null) {
                        chc2160 = ch2160;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/17/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2161 = br.readLine()) != null) {
                        chc2161 = ch2161;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/17/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2162 = br.readLine()) != null) {
                        chc2162 = ch2162;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/17/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2163 = br.readLine()) != null) {
                        chc2163 = ch2163;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/17/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q216choices = {chc2160,chc2161,chc2162,chc2163};
                
                choiceShuffle(q216choices);

                optionA3.setText(q216choices[0]);
                optionB3.setText(q216choices[1]);
                optionC3.setText(q216choices[2]);
                optionD3.setText(q216choices[3]);
            }
            case 17 -> {
                String qsn217,ch2170,ch2171,ch2172,ch2173,crc;
                String chc2170 = null,chc2171 = null,chc2172 = null,chc2173 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/18/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn217 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn217);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/18/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2170 = br.readLine()) != null) {
                        chc2170 = ch2170;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/18/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2171 = br.readLine()) != null) {
                        chc2171 = ch2171;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/18/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2172 = br.readLine()) != null) {
                        chc2172 = ch2172;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/18/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2173 = br.readLine()) != null) {
                        chc2173 = ch2173;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/18/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q217choices = {chc2170,chc2171,chc2172,chc2173};
                
                choiceShuffle(q217choices);

                optionA3.setText(q217choices[0]);
                optionB3.setText(q217choices[1]);
                optionC3.setText(q217choices[2]);
                optionD3.setText(q217choices[3]);
            }
            case 18 -> {
                String qsn218,ch2180,ch2181,ch2182,ch2183,crc;
                String chc2180 = null,chc2181 = null,chc2182 = null,chc2183 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/19/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn218 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn218);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/19/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2180 = br.readLine()) != null) {
                        chc2180 = ch2180;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/19/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2181 = br.readLine()) != null) {
                        chc2181 = ch2181;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/19/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2182 = br.readLine()) != null) {
                        chc2182 = ch2182;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/19/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2183 = br.readLine()) != null) {
                        chc2183 = ch2183;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/19/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q218choices = {chc2180,chc2181,chc2182,chc2183};
                
                choiceShuffle(q218choices);

                optionA3.setText(q218choices[0]);
                optionB3.setText(q218choices[1]);
                optionC3.setText(q218choices[2]);
                optionD3.setText(q218choices[3]);
            }
            case 19 -> {
                String qsn219,ch2190,ch2191,ch2192,ch2193,crc;
                String chc2190 = null,chc2191 = null,chc2192 = null,chc2193 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/20/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn219 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn219);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/20/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2190 = br.readLine()) != null) {
                        chc2190 = ch2190;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/20/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2191 = br.readLine()) != null) {
                        chc2191 = ch2191;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/20/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2192 = br.readLine()) != null) {
                        chc2192 = ch2192;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/20/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2193 = br.readLine()) != null) {
                        chc2193 = ch2193;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/20/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q219choices = {chc2190,chc2191,chc2192,chc2193};
                
                choiceShuffle(q219choices);

                optionA3.setText(q219choices[0]);
                optionB3.setText(q219choices[1]);
                optionC3.setText(q219choices[2]);
                optionD3.setText(q219choices[3]);
            }
            case 20 -> {
                String qsn220,ch2200,ch2201,ch2202,ch2203,crc;
                String chc2200 = null,chc2201 = null,chc2202 = null,chc2203 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/21/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn220 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn220);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/21/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2200 = br.readLine()) != null) {
                        chc2200 = ch2200;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/21/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2201 = br.readLine()) != null) {
                        chc2201 = ch2201;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/21/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2202 = br.readLine()) != null) {
                        chc2202 = ch2202;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/21/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2203 = br.readLine()) != null) {
                        chc2203 = ch2203;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/21/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q220choices = {chc2200,chc2201,chc2202,chc2203};
                
                choiceShuffle(q220choices);

                optionA3.setText(q220choices[0]);
                optionB3.setText(q220choices[1]);
                optionC3.setText(q220choices[2]);
                optionD3.setText(q220choices[3]);
            }
            case 21 -> {
                String qsn221,ch2210,ch2211,ch2212,ch2213,crc;
                String chc2210 = null,chc2211 = null,chc2212 = null,chc2213 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/22/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn221 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn221);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/22/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2210 = br.readLine()) != null) {
                        chc2210 = ch2210;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/22/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2211 = br.readLine()) != null) {
                        chc2211 = ch2211;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/22/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2212 = br.readLine()) != null) {
                        chc2212 = ch2212;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/22/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2213 = br.readLine()) != null) {
                        chc2213 = ch2213;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/22/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q221choices = {chc2210,chc2211,chc2212,chc2213};
                
                choiceShuffle(q221choices);

                optionA3.setText(q221choices[0]);
                optionB3.setText(q221choices[1]);
                optionC3.setText(q221choices[2]);
                optionD3.setText(q221choices[3]);
            }
            case 22 -> {
                String qsn222,ch2220,ch2221,ch2222,ch2223,crc;
                String chc2220 = null,chc2221 = null,chc2222 = null,chc2223 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/23/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn222 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn222);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/23/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2220 = br.readLine()) != null) {
                        chc2220 = ch2220;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/23/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2221 = br.readLine()) != null) {
                        chc2221 = ch2221;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/23/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2222 = br.readLine()) != null) {
                        chc2222 = ch2222;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/23/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2223 = br.readLine()) != null) {
                        chc2223 = ch2223;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/23/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q222choices = {chc2220,chc2221,chc2222,chc2223};
                
                choiceShuffle(q222choices);

                optionA3.setText(q222choices[0]);
                optionB3.setText(q222choices[1]);
                optionC3.setText(q222choices[2]);
                optionD3.setText(q222choices[3]);
            }
            case 23 -> {
                String qsn223,ch2230,ch2231,ch2232,ch2233,crc;
                String chc2230 = null,chc2231 = null,chc2232 = null,chc2233 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/24/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn223 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn223);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/24/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2230 = br.readLine()) != null) {
                        chc2230 = ch2230;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/24/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2231 = br.readLine()) != null) {
                        chc2231 = ch2231;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/24/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2232 = br.readLine()) != null) {
                        chc2232 = ch2232;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/24/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2233 = br.readLine()) != null) {
                        chc2233 = ch2233;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/24/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q223choices = {chc2230,chc2231,chc2232,chc2233};
                
                choiceShuffle(q223choices);

                optionA3.setText(q223choices[0]);
                optionB3.setText(q223choices[1]);
                optionC3.setText(q223choices[2]);
                optionD3.setText(q223choices[3]);
            }
            case 24 -> {
                String qsn224,ch2240,ch2241,ch2242,ch2243,crc;
                String chc2240 = null,chc2241 = null,chc2242 = null,chc2243 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/25/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn224 = br.readLine()) != null) {
                        questions3Text.setText(questions3Text.getText()+"\n" + qsn224);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/25/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2240 = br.readLine()) != null) {
                        chc2240 = ch2240;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/25/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2241 = br.readLine()) != null) {
                        chc2241 = ch2241;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/25/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2242 = br.readLine()) != null) {
                        chc2242 = ch2242;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/25/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch2243 = br.readLine()) != null) {
                        chc2243 = ch2243;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/1/25/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q224choices = {chc2240,chc2241,chc2242,chc2243};
                
                choiceShuffle(q224choices);

                optionA3.setText(q224choices[0]);
                optionB3.setText(q224choices[1]);
                optionC3.setText(q224choices[2]);
                optionD3.setText(q224choices[3]);
            }
        }
    }

    public void displayT3Question() throws FileNotFoundException, IOException {
        int a = theoRNG();
            switch(a) {
                case 0 -> {
                    String qsn30,ch300,ch301,ch302,ch303,crc;
                    String chc300 = null,chc301 = null,chc302 = null,chc303 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/1/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn30 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn30);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/1/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch300 = br.readLine()) != null) {
                            chc300 = ch300;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/1/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch301 = br.readLine()) != null) {
                            chc301 = ch301;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/1/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch302 = br.readLine()) != null) {
                            chc302 = ch302;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/1/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch303 = br.readLine()) != null) {
                            chc303 = ch303;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/1/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q30choices = {chc300,chc301,chc302,chc303};
                    choiceShuffle(q30choices);
                    optionA4.setText(q30choices[0]);
                    optionB4.setText(q30choices[1]);
                    optionC4.setText(q30choices[2]);
                    optionD4.setText(q30choices[3]);
                }
                case 1 -> {
                    String qsn31,ch310,ch311,ch312,ch313,crc;
                    String chc310 = null,chc311 = null,chc312 = null,chc313 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/2/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn31 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn31);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/2/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch310 = br.readLine()) != null) {
                            chc310 = ch310;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/2/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch311 = br.readLine()) != null) {
                            chc311 = ch311;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/2/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch312 = br.readLine()) != null) {
                            chc312 = ch312;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/2/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch313 = br.readLine()) != null) {
                            chc313 = ch313;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/2/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q31choices = {chc310,chc311,chc312,chc313};
                    choiceShuffle(q31choices);
                    optionA4.setText(q31choices[0]);
                    optionB4.setText(q31choices[1]);
                    optionC4.setText(q31choices[2]);
                    optionD4.setText(q31choices[3]);
                }
                case 2 -> {
                    String qsn32,ch320,ch321,ch322,ch323,crc;
                    String chc320 = null,chc321 = null,chc322 = null,chc323 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/3/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn32 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn32);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/3/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch320 = br.readLine()) != null) {
                            chc320 = ch320;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/3/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch321 = br.readLine()) != null) {
                            chc321 = ch321;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/3/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch322 = br.readLine()) != null) {
                            chc322 = ch322;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/3/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch323 = br.readLine()) != null) {
                            chc323 = ch323;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/3/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q32choices = {ch320,ch321,ch322,ch323};
                    choiceShuffle(q32choices);
                    optionA4.setText(q32choices[0]);
                    optionB4.setText(q32choices[1]);
                    optionC4.setText(q32choices[2]);
                    optionD4.setText(q32choices[3]);
                }
                case 3 -> {
                    String qsn33,ch330,ch331,ch332,ch333,crc;
                    String chc330 = null,chc331 = null,chc332 = null,chc333 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/4/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn33 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn33);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/4/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch330 = br.readLine()) != null) {
                            chc330 = ch330;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/4/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch331 = br.readLine()) != null) {
                            chc331 = ch331;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/4/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch332 = br.readLine()) != null) {
                            chc332 = ch332;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/4/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch333 = br.readLine()) != null) {
                            chc333 = ch333;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/4/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q33choices = {chc330,chc331,chc332,chc333};
                    choiceShuffle(q33choices);
                    optionA4.setText(q33choices[0]);
                    optionB4.setText(q33choices[1]);
                    optionC4.setText(q33choices[2]);
                    optionD4.setText(q33choices[3]);
                }
                case 4 -> {
                    String qsn34,ch340,ch341,ch342,ch343,crc;
                    String chc340 = null,chc341 = null,chc342 = null,chc343 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/5/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn34 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn34);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/5/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch340 = br.readLine()) != null) {
                            chc340 = ch340;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/5/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch341 = br.readLine()) != null) {
                            chc341 = ch341;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/5/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch342 = br.readLine()) != null) {
                            chc342 = ch342;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/5/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch343 = br.readLine()) != null) {
                            chc343 = ch343;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/5/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q34choices = {chc340,chc341,chc342,chc343};
                    choiceShuffle(q34choices);
                    optionA4.setText(q34choices[0]);
                    optionB4.setText(q34choices[1]);
                    optionC4.setText(q34choices[2]);
                    optionD4.setText(q34choices[3]);
                }
                case 5 -> {
                    String qsn35,ch350,ch351,ch352,ch353,crc;
                    String chc350 = null,chc351 = null,chc352 = null,chc353 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/6/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn35 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn35);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/6/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch350 = br.readLine()) != null) {
                            chc350 = ch350;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/6/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch351 = br.readLine()) != null) {
                            chc351 = ch351;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/6/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch352 = br.readLine()) != null) {
                            chc352 = ch352;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/6/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch353 = br.readLine()) != null) {
                            chc353 = ch353;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/6/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q35choices = {chc350,chc351,chc352,chc353};

                    choiceShuffle(q35choices);
                    optionA4.setText(q35choices[0]);
                    optionB4.setText(q35choices[1]);
                    optionC4.setText(q35choices[2]);
                    optionD4.setText(q35choices[3]);
                }
                case 6 -> {
                    String qsn36,ch360,ch361,ch362,ch363,crc;
                    String chc360 = null,chc361 = null,chc362 = null,chc363 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/7/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn36 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn36);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/7/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch360 = br.readLine()) != null) {
                            chc360 = ch360;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/7/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch361 = br.readLine()) != null) {
                            chc361 = ch361;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/7/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch362 = br.readLine()) != null) {
                            chc362 = ch362;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/7/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch363 = br.readLine()) != null) {
                            chc363 = ch363;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/7/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q36choices = {chc360,chc361,chc362,chc363};

                    choiceShuffle(q36choices);
                    optionA4.setText(q36choices[0]);
                    optionB4.setText(q36choices[1]);
                    optionC4.setText(q36choices[2]);
                    optionD4.setText(q36choices[3]);
                }
                case 7 -> {
                    String qsn37,ch370,ch371,ch372,ch373,crc;
                    String chc370 = null,chc371 = null,chc372 = null,chc373 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/8/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn37 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn37);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/8/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch370 = br.readLine()) != null) {
                            chc370 = ch370;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/8/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch371 = br.readLine()) != null) {
                            chc371 = ch371;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/8/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch372 = br.readLine()) != null) {
                            chc372 = ch372;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/8/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch373 = br.readLine()) != null) {
                            chc373 = ch373;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/8/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q37choices = {chc370,chc371,chc372,chc373};

                    choiceShuffle(q37choices);
                    optionA4.setText(q37choices[0]);
                    optionB4.setText(q37choices[1]);
                    optionC4.setText(q37choices[2]);
                    optionD4.setText(q37choices[3]);
                }
                case 8 -> {
                    String qsn38,ch380,ch381,ch382,ch383,crc;
                    String chc380 = null,chc381 = null,chc382 = null,chc383 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/9/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn38 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn38);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/9/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch380 = br.readLine()) != null) {
                            chc380 = ch380;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/9/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch381 = br.readLine()) != null) {
                            chc381 = ch381;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/1/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch382 = br.readLine()) != null) {
                            chc382 = ch382;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/9/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch383 = br.readLine()) != null) {
                            chc383 = ch383;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/9/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q38choices = {chc380,chc381,chc382,chc383};

                    choiceShuffle(q38choices);
                    optionA4.setText(q38choices[0]);
                    optionB4.setText(q38choices[1]);
                    optionC4.setText(q38choices[2]);
                    optionD4.setText(q38choices[3]);
                }
                case 9 -> {
                    String qsn39,ch390,ch391,ch392,ch393,crc;
                    String chc390 = null,chc391 = null,chc392 = null,chc393 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/10/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn39 = br.readLine()) != null) {
                            questions4Text.setText(questions4Text.getText()+"\n" + qsn39);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/10/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch390 = br.readLine()) != null) {
                            chc390 = ch390;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/10/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch391 = br.readLine()) != null) {
                            chc391 = ch391;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/10/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch392 = br.readLine()) != null) {
                            chc392 = ch392;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/10/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch393 = br.readLine()) != null) {
                            chc393 = ch393;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/3/10/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }
                    
                    String[] q39choices = {chc390,chc391,chc392,chc393};

                    choiceShuffle(q39choices);
                    optionA4.setText(q39choices[0]);
                    optionB4.setText(q39choices[1]);
                    optionC4.setText(q39choices[2]);
                    optionD4.setText(q39choices[3]);
                }
            }
    }
    
    public void displayT4Question() throws FileNotFoundException, IOException {
        int a = theoRNG();
            switch(a) {
                case 0 -> {
                    String qsn40,ch400,ch401,ch402,ch403,crc;
                    String chc400 = null,chc401 = null,chc402 = null,chc403 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/1/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn40 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn40);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/1/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch400 = br.readLine()) != null) {
                            chc400 = ch400;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/1/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch401 = br.readLine()) != null) {
                            chc401 = ch401;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/1/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch402 = br.readLine()) != null) {
                            chc402 = ch402;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/1/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch403 = br.readLine()) != null) {
                            chc403 = ch403;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/1/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q40choices = {chc400,chc401,chc402,chc403};

                    choiceShuffle(q40choices);
                    optionA5.setText(q40choices[0]);
                    optionB5.setText(q40choices[1]);
                    optionC5.setText(q40choices[2]);
                    optionD5.setText(q40choices[3]);
                }
                case 1 -> {
                    String qsn41,ch410,ch411,ch412,ch413,crc;
                    String chc410 = null,chc411 = null,chc412 = null,chc413 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/2/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn41 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn41);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/2/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch410 = br.readLine()) != null) {
                            chc410 = ch410;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/2/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch411 = br.readLine()) != null) {
                            chc411 = ch411;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/2/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch412 = br.readLine()) != null) {
                            chc412 = ch412;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/2/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch413 = br.readLine()) != null) {
                            chc413 = ch413;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/2/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q41choices = {chc410,chc411,chc412,chc413};

                    choiceShuffle(q41choices);
                    optionA5.setText(q41choices[0]);
                    optionB5.setText(q41choices[1]);
                    optionC5.setText(q41choices[2]);
                    optionD5.setText(q41choices[3]);
                }
                case 2 -> {
                    String qsn42,ch420,ch421,ch422,ch423,crc;
                    String chc420 = null,chc421 = null,chc422 = null,chc423 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/3/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn42 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn42);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/3/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch420 = br.readLine()) != null) {
                            chc420 = ch420;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/3/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch421 = br.readLine()) != null) {
                            chc421 = ch421;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/3/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch422 = br.readLine()) != null) {
                            chc422 = ch422;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/3/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch423 = br.readLine()) != null) {
                            chc423 = ch423;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/3/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q42choices = {chc420,chc421,chc422,chc423};

                    choiceShuffle(q42choices);
                    optionA5.setText(q42choices[0]);
                    optionB5.setText(q42choices[1]);
                    optionC5.setText(q42choices[2]);
                    optionD5.setText(q42choices[3]);
                }
                case 3 -> {
                    String qsn43,ch430,ch431,ch432,ch433,crc;
                    String chc430 = null,chc431 = null,chc432 = null,chc433 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/4/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn43 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn43);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/4/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch430 = br.readLine()) != null) {
                            chc430 = ch430;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/4/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch431 = br.readLine()) != null) {
                            chc431 = ch431;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/4/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch432 = br.readLine()) != null) {
                            chc432 = ch432;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/4/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch433 = br.readLine()) != null) {
                            chc433 = ch433;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/4/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q43choices = {chc430,chc431,chc432,chc433};

                    choiceShuffle(q43choices);
                    optionA5.setText(q43choices[0]);
                    optionB5.setText(q43choices[1]);
                    optionC5.setText(q43choices[2]);
                    optionD5.setText(q43choices[3]);
                }
                case 4 -> {
                    String qsn44,ch440,ch441,ch442,ch443,crc;
                    String chc440 = null,chc441 = null,chc442 = null,chc443 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/5/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn44 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn44);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/5/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch440 = br.readLine()) != null) {
                            chc440 = ch440;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/5/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch441 = br.readLine()) != null) {
                            chc441 = ch441;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/5/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch442 = br.readLine()) != null) {
                            chc442 = ch442;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/5/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch443 = br.readLine()) != null) {
                            chc443 = ch443;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/5/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q44choices = {chc440,chc441,chc442,chc443};

                    choiceShuffle(q44choices);
                    optionA5.setText(q44choices[0]);
                    optionB5.setText(q44choices[1]);
                    optionC5.setText(q44choices[2]);
                    optionD5.setText(q44choices[3]);
                }
                case 5 -> {
                    String qsn45,ch450,ch451,ch452,ch453,crc;
                    String chc450 = null,chc451 = null,chc452 = null,chc453 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/6/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn45 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn45);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/6/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch450 = br.readLine()) != null) {
                            chc450 = ch450;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/6/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch451 = br.readLine()) != null) {
                            chc451 = ch451;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/6/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch452 = br.readLine()) != null) {
                            chc452 = ch452;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/6/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch453 = br.readLine()) != null) {
                            chc453 = ch453;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/6/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q45choices = {chc450,chc451,chc452,chc453};

                    choiceShuffle(q45choices);
                    optionA5.setText(q45choices[0]);
                    optionB5.setText(q45choices[1]);
                    optionC5.setText(q45choices[2]);
                    optionD5.setText(q45choices[3]);
                }
                case 6 -> {
                    String qsn46,ch460,ch461,ch462,ch463,crc;
                    String chc460 = null,chc461 = null,chc462 = null,chc463 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/7/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn46 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn46);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/7/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch460 = br.readLine()) != null) {
                            chc460 = ch460;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/7/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch461 = br.readLine()) != null) {
                            chc461 = ch461;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/7/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch462 = br.readLine()) != null) {
                            chc462 = ch462;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/7/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch463 = br.readLine()) != null) {
                            chc463 = ch463;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/7/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q46choices = {chc460,chc461,chc462,chc463};

                    choiceShuffle(q46choices);
                    optionA5.setText(q46choices[0]);
                    optionB5.setText(q46choices[1]);
                    optionC5.setText(q46choices[2]);
                    optionD5.setText(q46choices[3]);
                }
                case 7 -> {
                    String qsn47,ch470,ch471,ch472,ch473,crc;
                    String chc470 = null,chc471 = null,chc472 = null,chc473 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/8/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn47 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn47);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/8/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch470 = br.readLine()) != null) {
                            chc470 = ch470;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/8/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch471 = br.readLine()) != null) {
                            chc471 = ch471;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/8/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch472 = br.readLine()) != null) {
                            chc472 = ch472;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/8/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch473 = br.readLine()) != null) {
                            chc473 = ch473;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/8/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q47choices = {chc470,chc471,chc472,chc473};

                    choiceShuffle(q47choices);
                    optionA5.setText(q47choices[0]);
                    optionB5.setText(q47choices[1]);
                    optionC5.setText(q47choices[2]);
                    optionD5.setText(q47choices[3]);
                }
                case 8 -> {
                    String qsn48,ch480,ch481,ch482,ch483,crc;
                    String chc480 = null,chc481 = null,chc482 = null,chc483 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/9/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn48 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn48);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/1/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch480 = br.readLine()) != null) {
                            chc480 = ch480;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/9/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch481 = br.readLine()) != null) {
                            chc481 = ch481;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/9/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch482 = br.readLine()) != null) {
                            chc482 = ch482;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/9/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch483 = br.readLine()) != null) {
                            chc483 = ch483;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/9/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q48choices = {chc480,chc481,chc482,chc483};

                    choiceShuffle(q48choices);
                    optionA5.setText(q48choices[0]);
                    optionB5.setText(q48choices[1]);
                    optionC5.setText(q48choices[2]);
                    optionD5.setText(q48choices[3]);
                }
                case 9 -> {
                    String qsn49,ch490,ch491,ch492,ch493,crc;
                    String chc490 = null,chc491 = null,chc492 = null,chc493 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/10/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn49 = br.readLine()) != null) {
                            questions5Text.setText(questions5Text.getText()+"\n" + qsn49);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/10/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch490 = br.readLine()) != null) {
                            chc490 = ch490;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/10/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch491 = br.readLine()) != null) {
                            chc491 = ch491;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/10/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch492 = br.readLine()) != null) {
                            chc492 = ch492;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/10/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch493 = br.readLine()) != null) {
                            chc493 = ch493;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/4/10/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q49choices = {chc490,chc491,chc492,chc493};

                    choiceShuffle(q49choices);
                    optionA5.setText(q49choices[0]);
                    optionB5.setText(q49choices[1]);
                    optionC5.setText(q49choices[2]);
                    optionD5.setText(q49choices[3]);
                }
            }
    }
    
    public void displayP2Question() throws FileNotFoundException, IOException {
        int a = theoRNG();
        switch(a) {
            case 0 -> {
                String qsn50,ch500,ch501,ch502,ch503,crc;
                    String chc500 = null,chc501 = null,chc502 = null,chc503 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/1/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn50 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn50);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/1/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch500 = br.readLine()) != null) {
                            chc500 = ch500;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/1/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch501 = br.readLine()) != null) {
                            chc501 = ch501;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/1/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch502 = br.readLine()) != null) {
                            chc502 = ch502;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/1/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch503 = br.readLine()) != null) {
                            chc503 = ch503;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/1/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q50choices = {chc500,chc501,chc502,chc503};
                
                choiceShuffle(q50choices);
                optionA6.setText(q50choices[0]);
                optionB6.setText(q50choices[1]);
                optionC6.setText(q50choices[2]);
                optionD6.setText(q50choices[3]);
            }
            case 1 -> {
                String qsn51,ch510,ch511,ch512,ch513,crc;
                    String chc510 = null,chc511 = null,chc512 = null,chc513 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/2/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn51 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn51);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/2/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch510 = br.readLine()) != null) {
                            chc510 = ch510;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/2/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch511 = br.readLine()) != null) {
                            chc511 = ch511;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/2/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch512 = br.readLine()) != null) {
                            chc512 = ch512;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/2/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch513 = br.readLine()) != null) {
                            chc513 = ch513;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/2/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q51choices = {chc510,chc511,chc512,chc513};
                
                choiceShuffle(q51choices);
                optionA6.setText(q51choices[0]);
                optionB6.setText(q51choices[1]);
                optionC6.setText(q51choices[2]);
                optionD6.setText(q51choices[3]);
            }
            case 2 -> {
                String qsn52,ch520,ch521,ch522,ch523,crc;
                    String chc520 = null,chc521 = null,chc522 = null,chc523 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/3/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn52 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn52);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/3/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch520 = br.readLine()) != null) {
                            chc520 = ch520;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/3/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch521 = br.readLine()) != null) {
                            chc521 = ch521;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/3/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch522 = br.readLine()) != null) {
                            chc522 = ch522;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/3/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch523 = br.readLine()) != null) {
                            chc523 = ch523;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/3/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q52choices = {chc520,chc521,chc522,chc523};
                
                choiceShuffle(q52choices);
                optionA6.setText(q52choices[0]);
                optionB6.setText(q52choices[1]);
                optionC6.setText(q52choices[2]);
                optionD6.setText(q52choices[3]);
            }
            case 3 -> {
                    String qsn53,ch530,ch531,ch532,ch533,crc;
                    String chc530 = null,chc531 = null,chc532 = null,chc533 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/4/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn53 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn53);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/4/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch530 = br.readLine()) != null) {
                            chc530 = ch530;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/4/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch531 = br.readLine()) != null) {
                            chc531 = ch531;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/4/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch532 = br.readLine()) != null) {
                            chc532 = ch532;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/4/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch533 = br.readLine()) != null) {
                            chc533 = ch533;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/4/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q53choices = {chc530,chc531,chc532,chc533};
                
                choiceShuffle(q53choices);
                optionA6.setText(q53choices[0]);
                optionB6.setText(q53choices[1]);
                optionC6.setText(q53choices[2]);
                optionD6.setText(q53choices[3]);
            }
            case 4 -> {
                String qsn54,ch540,ch541,ch542,ch543,crc;
                    String chc540 = null,chc541 = null,chc542 = null,chc543 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/5/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn54 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn54);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/5/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch540 = br.readLine()) != null) {
                            chc540 = ch540;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/5/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch541 = br.readLine()) != null) {
                            chc541 = ch541;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/5/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch542 = br.readLine()) != null) {
                            chc542 = ch542;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/5/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch543 = br.readLine()) != null) {
                            chc543 = ch543;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/5/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q54choices = {chc540,chc541,chc542,chc543};
                
                choiceShuffle(q54choices);
                optionA6.setText(q54choices[0]);
                optionB6.setText(q54choices[1]);
                optionC6.setText(q54choices[2]);
                optionD6.setText(q54choices[3]);
            }
            case 5 -> {
                String qsn55,ch550,ch551,ch552,ch553,crc;
                    String chc550 = null,chc551 = null,chc552 = null,chc553 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/6/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn55 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn55);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/6/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch550 = br.readLine()) != null) {
                            chc550 = ch550;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/6/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch551 = br.readLine()) != null) {
                            chc551 = ch551;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/6/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch552 = br.readLine()) != null) {
                            chc552 = ch552;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/6/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch553 = br.readLine()) != null) {
                            chc553 = ch553;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/6/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q55choices = {chc550,chc551,chc552,chc553};
                
                choiceShuffle(q55choices);
                optionA6.setText(q55choices[0]);
                optionB6.setText(q55choices[1]);
                optionC6.setText(q55choices[2]);
                optionD6.setText(q55choices[3]);
            }
            case 6 -> {
                String qsn56,ch560,ch561,ch562,ch563,crc;
                    String chc560 = null,chc561 = null,chc562 = null,chc563 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/7/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn56 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn56);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/7/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch560 = br.readLine()) != null) {
                            chc560 = ch560;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/7/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch561 = br.readLine()) != null) {
                            chc561 = ch561;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/7/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch562 = br.readLine()) != null) {
                            chc562 = ch562;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/7/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch563 = br.readLine()) != null) {
                            chc563 = ch563;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/7/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q56choices = {chc560,chc561,chc562,chc563};
                
                choiceShuffle(q56choices);
                optionA6.setText(q56choices[0]);
                optionB6.setText(q56choices[1]);
                optionC6.setText(q56choices[2]);
                optionD6.setText(q56choices[3]);
            }
            case 7 -> {
                String qsn57,ch570,ch571,ch572,ch573,crc;
                    String chc570 = null,chc571 = null,chc572 = null,chc573 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/8/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn57 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn57);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/8/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch570 = br.readLine()) != null) {
                            chc570 = ch570;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/8/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch571 = br.readLine()) != null) {
                            chc571 = ch571;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/8/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch572 = br.readLine()) != null) {
                            chc572 = ch572;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/8/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch573 = br.readLine()) != null) {
                            chc573 = ch573;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/8/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q57choices = {chc570,chc571,chc572,chc573};
                
                choiceShuffle(q57choices);
                optionA6.setText(q57choices[0]);
                optionB6.setText(q57choices[1]);
                optionC6.setText(q57choices[2]);
                optionD6.setText(q57choices[3]);
            }
            case 8 -> {
                String qsn58,ch580,ch581,ch582,ch583,crc;
                    String chc580 = null,chc581 = null,chc582 = null,chc583 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/9/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn58 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn58);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/9/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch580 = br.readLine()) != null) {
                            chc580 = ch580;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/9/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch581 = br.readLine()) != null) {
                            chc581 = ch581;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/9/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch582 = br.readLine()) != null) {
                            chc582 = ch582;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/9/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch583 = br.readLine()) != null) {
                            chc583 = ch583;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/9/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q58choices = {chc580,chc581,chc582,chc583};
                
                choiceShuffle(q58choices);
                optionA6.setText(q58choices[0]);
                optionB6.setText(q58choices[1]);
                optionC6.setText(q58choices[2]);
                optionD6.setText(q58choices[3]);
            }
            case 9 -> {
                String qsn59,ch590,ch591,ch592,ch593,crc;
                    String chc590 = null,chc591 = null,chc592 = null,chc593 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/10/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn59 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn59);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/10/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch590 = br.readLine()) != null) {
                            chc590 = ch590;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/10/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch591 = br.readLine()) != null) {
                            chc591 = ch591;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/10/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch592 = br.readLine()) != null) {
                            chc592 = ch592;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/10/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch593 = br.readLine()) != null) {
                            chc593 = ch593;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/2/10/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                String[] q59choices = {chc590,chc591,chc592,chc593};
                
                choiceShuffle(q59choices);
                optionA6.setText(q59choices[0]);
                optionB6.setText(q59choices[1]);
                optionC6.setText(q59choices[2]);
                optionD6.setText(q59choices[3]);
            }
        }
    }
    
    public void displayT5Question() throws FileNotFoundException, IOException {
        int a = theoRNG();
            switch(a) {
                case 0 -> {
                    String qsn60,ch600,ch601,ch602,ch603,crc;
                    String chc600 = null,chc601 = null,chc602 = null,chc603 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/1/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn60 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn60);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/1/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch600 = br.readLine()) != null) {
                            chc600 = ch600;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/1/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch601 = br.readLine()) != null) {
                            chc601 = ch601;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/1/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch602 = br.readLine()) != null) {
                            chc602 = ch602;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/1/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch603 = br.readLine()) != null) {
                            chc603 = ch603;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/1/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q60choices = {chc600,chc601,chc602,chc603};

                    choiceShuffle(q60choices);
                    optionA7.setText(q60choices[0]);
                    optionB7.setText(q60choices[1]);
                    optionC7.setText(q60choices[2]);
                    optionD7.setText(q60choices[3]);
                }
                case 1 -> {
                    String qsn61,ch610,ch611,ch612,ch613,crc;
                    String chc610 = null,chc611 = null,chc612 = null,chc613 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/2/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn61 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn61);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/2/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch610 = br.readLine()) != null) {
                            chc610 = ch610;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/2/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch611 = br.readLine()) != null) {
                            chc611 = ch611;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/2/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch612 = br.readLine()) != null) {
                            chc612 = ch612;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/2/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch613 = br.readLine()) != null) {
                            chc613 = ch613;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/2/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q61choices = {chc610,chc611,chc612,chc613};

                    choiceShuffle(q61choices);
                    optionA7.setText(q61choices[0]);
                    optionB7.setText(q61choices[1]);
                    optionC7.setText(q61choices[2]);
                    optionD7.setText(q61choices[3]);
                }
                case 2 -> {
                    String qsn62,ch620,ch621,ch622,ch623,crc;
                    String chc620 = null,chc621 = null,chc622 = null,chc623 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/3/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn62 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn62);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/3/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch620 = br.readLine()) != null) {
                            chc620 = ch620;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/3/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch621 = br.readLine()) != null) {
                            chc621 = ch621;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/3/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch622 = br.readLine()) != null) {
                            chc622 = ch622;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/3/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch623 = br.readLine()) != null) {
                            chc623 = ch623;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/3/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q62choices = {chc620,chc621,chc622,chc623};

                    choiceShuffle(q62choices);
                    optionA7.setText(q62choices[0]);
                    optionB7.setText(q62choices[1]);
                    optionC7.setText(q62choices[2]);
                    optionD7.setText(q62choices[3]);
                }
                case 3 -> {
                    String qsn63,ch630,ch631,ch632,ch633,crc;
                    String chc630 = null,chc631 = null,chc632 = null,chc633 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/4/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn63 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn63);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/4/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch630 = br.readLine()) != null) {
                            chc630 = ch630;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/4/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch631 = br.readLine()) != null) {
                            chc631 = ch631;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/4/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch632 = br.readLine()) != null) {
                            chc632 = ch632;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/4/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch633 = br.readLine()) != null) {
                            chc633 = ch633;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/4/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q63choices = {chc630,chc631,chc632,chc633};

                    choiceShuffle(q63choices);
                    optionA7.setText(q63choices[0]);
                    optionB7.setText(q63choices[1]);
                    optionC7.setText(q63choices[2]);
                    optionD7.setText(q63choices[3]);
                }
                case 4 -> {
                    String qsn64,ch640,ch641,ch642,ch643,crc;
                    String chc640 = null,chc641 = null,chc642 = null,chc643 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/5/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn64 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn64);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/5/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch640 = br.readLine()) != null) {
                            chc640 = ch640;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/5/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch641 = br.readLine()) != null) {
                            chc641 = ch641;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/5/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch642 = br.readLine()) != null) {
                            chc642 = ch642;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/5/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch643 = br.readLine()) != null) {
                            chc643 = ch643;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/5/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q64choices = {chc640,chc641,chc642,chc643};

                    choiceShuffle(q64choices);
                    optionA7.setText(q64choices[0]);
                    optionB7.setText(q64choices[1]);
                    optionC7.setText(q64choices[2]);
                    optionD7.setText(q64choices[3]);
                }
                case 5 -> {
                    String qsn65,ch650,ch651,ch652,ch653,crc;
                    String chc650 = null,chc651 = null,chc652 = null,chc653 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/6/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn65 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn65);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/6/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch650 = br.readLine()) != null) {
                            chc650 = ch650;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/6/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch651 = br.readLine()) != null) {
                            chc651 = ch651;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/6/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch652 = br.readLine()) != null) {
                            chc652 = ch652;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/6/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch653 = br.readLine()) != null) {
                            chc653 = ch653;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/6/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q65choices = {chc650,chc651,chc652,chc653};

                    choiceShuffle(q65choices);
                    optionA7.setText(q65choices[0]);
                    optionB7.setText(q65choices[1]);
                    optionC7.setText(q65choices[2]);
                    optionD7.setText(q65choices[3]);
                }
                case 6 -> {
                    String qsn66,ch660,ch661,ch662,ch663,crc;
                    String chc660 = null,chc661 = null,chc662 = null,chc663 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/7/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn66 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn66);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/7/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch660 = br.readLine()) != null) {
                            chc660 = ch660;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/7/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch661 = br.readLine()) != null) {
                            chc661 = ch661;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/7/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch662 = br.readLine()) != null) {
                            chc662 = ch662;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/7/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch663 = br.readLine()) != null) {
                            chc663 = ch663;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/7/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q66choices = {chc660,chc661,chc662,chc663};

                    choiceShuffle(q66choices);
                    optionA7.setText(q66choices[0]);
                    optionB7.setText(q66choices[1]);
                    optionC7.setText(q66choices[2]);
                    optionD7.setText(q66choices[3]);
                }
                case 7 -> {
                    String qsn67,ch670,ch671,ch672,ch673,crc;
                    String chc670 = null,chc671 = null,chc672 = null,chc673 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/8/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn67 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn67);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/8/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch670 = br.readLine()) != null) {
                            chc670 = ch670;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/8/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch671 = br.readLine()) != null) {
                            chc671 = ch671;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/8/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch672 = br.readLine()) != null) {
                            chc672 = ch672;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/8/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch673 = br.readLine()) != null) {
                            chc673 = ch673;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/8/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q67choices = {chc670,chc671,chc672,chc673};

                    choiceShuffle(q67choices);
                    optionA7.setText(q67choices[0]);
                    optionB7.setText(q67choices[1]);
                    optionC7.setText(q67choices[2]);
                    optionD7.setText(q67choices[3]);
                }
                case 8 -> {
                    String qsn68,ch680,ch681,ch682,ch683,crc;
                    String chc680 = null,chc681 = null,chc682 = null,chc683 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/9/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn68 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn68);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/9/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch680 = br.readLine()) != null) {
                            chc680 = ch680;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/9/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch681 = br.readLine()) != null) {
                            chc681 = ch681;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/9/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch682 = br.readLine()) != null) {
                            chc682 = ch682;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/9/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch683 = br.readLine()) != null) {
                            chc683 = ch683;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/9/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q68choices = {chc680,chc681,chc682,chc683};

                    choiceShuffle(q68choices);
                    optionA7.setText(q68choices[0]);
                    optionB7.setText(q68choices[1]);
                    optionC7.setText(q68choices[2]);
                    optionD7.setText(q68choices[3]);
                }
                case 9 -> {
                    String qsn69,ch690,ch691,ch692,ch693,crc;
                    String chc690 = null,chc691 = null,chc692 = null,chc693 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/10/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn69 = br.readLine()) != null) {
                            questions7Text.setText(questions7Text.getText()+"\n" + qsn69);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/10/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch690 = br.readLine()) != null) {
                            chc690 = ch690;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/10/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch691 = br.readLine()) != null) {
                            chc691 = ch691;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/10/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch692 = br.readLine()) != null) {
                            chc692 = ch692;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/10/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch693 = br.readLine()) != null) {
                            chc693 = ch693;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/5/10/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q69choices = {chc690,chc691,chc692,chc693};

                    choiceShuffle(q69choices);
                    optionA7.setText(q69choices[0]);
                    optionB7.setText(q69choices[1]);
                    optionC7.setText(q69choices[2]);
                    optionD7.setText(q69choices[3]);
                }
            }
    }
    
    public void displayT6Question() throws FileNotFoundException, IOException {
        int a = theoRNG();
            switch(a) {
                case 0 -> {
                    String qsn70,ch700,ch701,ch702,ch703,crc;
                    String chc700 = null,chc701 = null,chc702 = null,chc703 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/1/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn70 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn70);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/1/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch700 = br.readLine()) != null) {
                            chc700 = ch700;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/1/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch701 = br.readLine()) != null) {
                            chc701 = ch701;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/1/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch702 = br.readLine()) != null) {
                            chc702 = ch702;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/1/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch703 = br.readLine()) != null) {
                            chc703 = ch703;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/1/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q70choices = {chc700,chc701,chc702,chc703};

                    choiceShuffle(q70choices);
                    optionA8.setText(q70choices[0]);
                    optionB8.setText(q70choices[1]);
                    optionC8.setText(q70choices[2]);
                    optionD8.setText(q70choices[3]);
                }
                case 1 -> {
                    String qsn71,ch710,ch711,ch712,ch713,crc;
                    String chc710 = null,chc711 = null,chc712 = null,chc713 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/2/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn71 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn71);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/2/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch710 = br.readLine()) != null) {
                            chc710 = ch710;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/2/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch711 = br.readLine()) != null) {
                            chc711 = ch711;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/2/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch712 = br.readLine()) != null) {
                            chc712 = ch712;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/2/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch713 = br.readLine()) != null) {
                            chc713 = ch713;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/2/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q71choices = {chc710,chc711,chc712,chc713};

                    choiceShuffle(q71choices);
                    optionA8.setText(q71choices[0]);
                    optionB8.setText(q71choices[1]);
                    optionC8.setText(q71choices[2]);
                    optionD8.setText(q71choices[3]);
                }
                case 2 -> {
                    String qsn72,ch720,ch721,ch722,ch723,crc;
                    String chc720 = null,chc721 = null,chc722 = null,chc723 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/3/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn72 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn72);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/3/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch720 = br.readLine()) != null) {
                            chc720 = ch720;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/3/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch721 = br.readLine()) != null) {
                            chc721 = ch721;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/3/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch722 = br.readLine()) != null) {
                            chc722 = ch722;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/3/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch723 = br.readLine()) != null) {
                            chc723 = ch723;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/3/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q72choices = {chc720,chc721,chc722,chc723};

                    choiceShuffle(q72choices);
                    optionA8.setText(q72choices[0]);
                    optionB8.setText(q72choices[1]);
                    optionC8.setText(q72choices[2]);
                    optionD8.setText(q72choices[3]);
                }
                case 3 -> {
                    String qsn73,ch730,ch731,ch732,ch733,crc;
                    String chc730 = null,chc731 = null,chc732 = null,chc733 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/4/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn73 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn73);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/4/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch730 = br.readLine()) != null) {
                            chc730 = ch730;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/4/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch731 = br.readLine()) != null) {
                            chc731 = ch731;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/4/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch732 = br.readLine()) != null) {
                            chc732 = ch732;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/4/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch733 = br.readLine()) != null) {
                            chc733 = ch733;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/4/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q73choices = {chc730,chc731,chc732,chc733};

                    choiceShuffle(q73choices);
                    optionA8.setText(q73choices[0]);
                    optionB8.setText(q73choices[1]);
                    optionC8.setText(q73choices[2]);
                    optionD8.setText(q73choices[3]);
                }
                case 4 -> {
                    String qsn74,ch740,ch741,ch742,ch743,crc;
                    String chc740 = null,chc741 = null,chc742 = null,chc743 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/5/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn74 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn74);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/5/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch740 = br.readLine()) != null) {
                            chc740 = ch740;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/5/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch741 = br.readLine()) != null) {
                            chc741 = ch741;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/5/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch742 = br.readLine()) != null) {
                            chc742 = ch742;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/5/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch743 = br.readLine()) != null) {
                            chc743 = ch743;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/5/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q74choices = {chc740,chc741,chc742,chc743};

                    choiceShuffle(q74choices);
                    optionA8.setText(q74choices[0]);
                    optionB8.setText(q74choices[1]);
                    optionC8.setText(q74choices[2]);
                    optionD8.setText(q74choices[3]);
                }
                case 5 -> {
                    String qsn75,ch750,ch751,ch752,ch753,crc;
                    String chc750 = null,chc751 = null,chc752 = null,chc753 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/6/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn75 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn75);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/6/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch750 = br.readLine()) != null) {
                            chc750 = ch750;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/6/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch751 = br.readLine()) != null) {
                            chc751 = ch751;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/6/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch752 = br.readLine()) != null) {
                            chc752 = ch752;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/6/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch753 = br.readLine()) != null) {
                            chc753 = ch753;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/6/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q75choices = {chc750,chc751,chc752,chc753};

                    choiceShuffle(q75choices);
                    optionA8.setText(q75choices[0]);
                    optionB8.setText(q75choices[1]);
                    optionC8.setText(q75choices[2]);
                    optionD8.setText(q75choices[3]);
                }
                case 6 -> {
                    String qsn76,ch760,ch761,ch762,ch763,crc;
                    String chc760 = null,chc761 = null,chc762 = null,chc763 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/7/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn76 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn76);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/7/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch760 = br.readLine()) != null) {
                            chc760 = ch760;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/7/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch761 = br.readLine()) != null) {
                            chc761 = ch761;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/7/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch762 = br.readLine()) != null) {
                            chc762 = ch762;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/7/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch763 = br.readLine()) != null) {
                            chc763 = ch763;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/7/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q76choices = {chc760,chc761,chc762,chc763};

                    choiceShuffle(q76choices);
                    optionA8.setText(q76choices[0]);
                    optionB8.setText(q76choices[1]);
                    optionC8.setText(q76choices[2]);
                    optionD8.setText(q76choices[3]);
                }
                case 7 -> {
                    String qsn77,ch770,ch771,ch772,ch773,crc;
                    String chc770 = null,chc771 = null,chc772 = null,chc773 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/8/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn77 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn77);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/8/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch770 = br.readLine()) != null) {
                            chc770 = ch770;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/8/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch771 = br.readLine()) != null) {
                            chc771 = ch771;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/8/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch772 = br.readLine()) != null) {
                            chc772 = ch772;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/8/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch773 = br.readLine()) != null) {
                            chc773 = ch773;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/8/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q77choices = {chc770,chc771,chc772,chc773};

                    choiceShuffle(q77choices);
                    optionA8.setText(q77choices[0]);
                    optionB8.setText(q77choices[1]);
                    optionC8.setText(q77choices[2]);
                    optionD8.setText(q77choices[3]);
                }
                case 8 -> {
                    String qsn78,ch780,ch781,ch782,ch783,crc;
                    String chc780 = null,chc781 = null,chc782 = null,chc783 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/9/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn78 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn78);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/9/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch780 = br.readLine()) != null) {
                            chc780 = ch780;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/9/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch781 = br.readLine()) != null) {
                            chc781 = ch781;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/9/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch782 = br.readLine()) != null) {
                            chc782 = ch782;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/9/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch783 = br.readLine()) != null) {
                            chc783 = ch783;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/9/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q78choices = {chc780,chc781,chc782,chc783};

                    choiceShuffle(q78choices);
                    optionA8.setText(q78choices[0]);
                    optionB8.setText(q78choices[1]);
                    optionC8.setText(q78choices[2]);
                    optionD8.setText(q78choices[3]);
                }
                case 9 -> {
                    String qsn79,ch790,ch791,ch792,ch793,crc;
                    String chc790 = null,chc791 = null,chc792 = null,chc793 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/10/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn79 = br.readLine()) != null) {
                            questions8Text.setText(questions8Text.getText()+"\n" + qsn79);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/10/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch790 = br.readLine()) != null) {
                            chc790 = ch790;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/10/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch791 = br.readLine()) != null) {
                            chc791 = ch791;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/10/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch792 = br.readLine()) != null) {
                            chc792 = ch792;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/10/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch793 = br.readLine()) != null) {
                            chc793 = ch793;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/6/10/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q79choices = {chc790,chc791,chc792,chc793};

                    choiceShuffle(q79choices);
                    optionA8.setText(q79choices[0]);
                    optionB8.setText(q79choices[1]);
                    optionC8.setText(q79choices[2]);
                    optionD8.setText(q79choices[3]);
                }
            }
    }
    
    public void displayP3Question() throws FileNotFoundException, IOException {
        int a = progRNG();
        switch(a) {
            case 0 -> {
                String qsn80,ch800,ch801,ch802,ch803,crc;
                String chc800 = null,chc801 = null,chc802 = null,chc803 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/1/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn80 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn80);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/1/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch800 = br.readLine()) != null) {
                        chc800 = ch800;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/1/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch801 = br.readLine()) != null) {
                        chc801 = ch801;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/1/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch802 = br.readLine()) != null) {
                        chc802 = ch802;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/1/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch803 = br.readLine()) != null) {
                        chc803 = ch803;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/1/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }
                
                String[] q80choices = {chc800,chc801,chc802,chc803};
                choiceShuffle(q80choices);
                optionA9.setText(q80choices[0]);
                optionB9.setText(q80choices[1]);
                optionC9.setText(q80choices[2]);
                optionD9.setText(q80choices[3]);
            }
            case 1 -> {
                String qsn81,ch810,ch811,ch812,ch813,crc;
                String chc810 = null,chc811 = null,chc812 = null,chc813 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/2/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn81 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn81);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/2/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch810 = br.readLine()) != null) {
                        chc810 = ch810;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/2/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch811 = br.readLine()) != null) {
                        chc811 = ch811;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/2/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch812 = br.readLine()) != null) {
                        chc812 = ch812;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/2/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch813 = br.readLine()) != null) {
                        chc813 = ch813;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/2/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q81choices = {chc810,chc811,chc812,chc813};
                
                choiceShuffle(q81choices);
                optionA9.setText(q81choices[0]);
                optionB9.setText(q81choices[1]);
                optionC9.setText(q81choices[2]);
                optionD9.setText(q81choices[3]);
            }
            case 2 -> {
                String qsn82,ch820,ch821,ch822,ch823,crc;
                String chc820 = null,chc821 = null,chc822 = null,chc823 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/3/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn82 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn82);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/3/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch820 = br.readLine()) != null) {
                        chc820 = ch820;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/1/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch821 = br.readLine()) != null) {
                        chc821 = ch821;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/3/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch822 = br.readLine()) != null) {
                        chc822 = ch822;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/3/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch823 = br.readLine()) != null) {
                        chc823 = ch823;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/3/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q82choices = {chc820,chc821,chc822,chc823};
                choiceShuffle(q82choices);
                optionA9.setText(q82choices[0]);
                optionB9.setText(q82choices[1]);
                optionC9.setText(q82choices[2]);
                optionD9.setText(q82choices[3]);
            }
            case 3 -> {
                String qsn83,ch830,ch831,ch832,ch833,crc;
                String chc830 = null,chc831 = null,chc832 = null,chc833 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/4/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn83 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn83);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/4/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch830 = br.readLine()) != null) {
                        chc830 = ch830;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/4/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch831 = br.readLine()) != null) {
                        chc831 = ch831;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/4/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch832 = br.readLine()) != null) {
                        chc832 = ch832;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/4/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch833 = br.readLine()) != null) {
                        chc833 = ch833;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/4/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q83choices = {chc830,chc831,chc832,chc833};
                choiceShuffle(q83choices);
                optionA9.setText(q83choices[0]);
                optionB9.setText(q83choices[1]);
                optionC9.setText(q83choices[2]);
                optionD9.setText(q83choices[3]);
            }
            case 4 -> {
                String qsn84,ch840,ch841,ch842,ch843,crc;
                String chc840 = null,chc841 = null,chc842 = null,chc843 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/5/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn84 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn84);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/5/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch840 = br.readLine()) != null) {
                        chc840 = ch840;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/5/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch841 = br.readLine()) != null) {
                        chc841 = ch841;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/5/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch842 = br.readLine()) != null) {
                        chc842 = ch842;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/5/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch843 = br.readLine()) != null) {
                        chc843 = ch843;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/5/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q84choices = {chc840,chc841,chc842,chc843};
                choiceShuffle(q84choices);
                optionA9.setText(q84choices[0]);
                optionB9.setText(q84choices[1]);
                optionC9.setText(q84choices[2]);
                optionD9.setText(q84choices[3]);
            }
            case 5 -> {
                String qsn85,ch850,ch851,ch852,ch853,crc;
                String chc850 = null,chc851 = null,chc852 = null,chc853 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/6/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn85 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn85);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/6/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch850 = br.readLine()) != null) {
                        chc850 = ch850;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/6/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch851 = br.readLine()) != null) {
                        chc851 = ch851;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/6/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch852 = br.readLine()) != null) {
                        chc852 = ch852;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/6/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch853 = br.readLine()) != null) {
                        chc853 = ch853;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/6/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q85choices = {chc850,chc851,chc852,chc853};
                choiceShuffle(q85choices);
                optionA9.setText(q85choices[0]);
                optionB9.setText(q85choices[1]);
                optionC9.setText(q85choices[2]);
                optionD9.setText(q85choices[3]);
            }
            case 6 -> {
                String qsn86,ch860,ch861,ch862,ch863,crc;
                String chc860 = null,chc861 = null,chc862 = null,chc863 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/7/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn86 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn86);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/7/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch860 = br.readLine()) != null) {
                        chc860 = ch860;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/7/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch861 = br.readLine()) != null) {
                        chc861 = ch861;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/7/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch862 = br.readLine()) != null) {
                        chc862 = ch862;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/7/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch863 = br.readLine()) != null) {
                        chc863 = ch863;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/7/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q86choices = {chc860,chc861,chc862,chc863};
                choiceShuffle(q86choices);
                optionA9.setText(q86choices[0]);
                optionB9.setText(q86choices[1]);
                optionC9.setText(q86choices[2]);
                optionD9.setText(q86choices[3]);
            }
            case 7 -> {
                String qsn87,ch870,ch871,ch872,ch873,crc;
                String chc870 = null,chc871 = null,chc872 = null,chc873 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/8/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn87 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn87);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/8/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch870 = br.readLine()) != null) {
                        chc870 = ch870;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/8/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch871 = br.readLine()) != null) {
                        chc871 = ch871;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/8/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch872 = br.readLine()) != null) {
                        chc872 = ch872;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/8/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch873 = br.readLine()) != null) {
                        chc873 = ch873;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/8/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q87choices = {chc870,chc871,chc872,chc873};
                choiceShuffle(q87choices);
                optionA9.setText(q87choices[0]);
                optionB9.setText(q87choices[1]);
                optionC9.setText(q87choices[2]);
                optionD9.setText(q87choices[3]);
            }
            case 8 -> {
                String qsn88,ch880,ch881,ch882,ch883,crc;
                String chc880 = null,chc881 = null,chc882 = null,chc883 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/9/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn88 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn88);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/9/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch880 = br.readLine()) != null) {
                        chc880 = ch880;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/9/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch881 = br.readLine()) != null) {
                        chc881 = ch881;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/9/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch882 = br.readLine()) != null) {
                        chc882 = ch882;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/9/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch883 = br.readLine()) != null) {
                        chc883 = ch883;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/9/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q88choices = {chc880,chc881,chc882,chc883};
                choiceShuffle(q88choices);
                optionA9.setText(q88choices[0]);
                optionB9.setText(q88choices[1]);
                optionC9.setText(q88choices[2]);
                optionD9.setText(q88choices[3]);
            }
            case 9 -> {
                String qsn89,ch890,ch891,ch892,ch893,crc;
                String chc890 = null,chc891 = null,chc892 = null,chc893 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/10/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn89 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn89);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/10/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch890 = br.readLine()) != null) {
                        chc890 = ch890;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/10/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch891 = br.readLine()) != null) {
                        chc891 = ch891;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/10/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch892 = br.readLine()) != null) {
                        chc892 = ch892;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/10/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch893 = br.readLine()) != null) {
                        chc893 = ch893;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/10/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q89choices = {chc890,chc891,chc892,chc893};
                choiceShuffle(q89choices);
                optionA9.setText(q89choices[0]);
                optionB9.setText(q89choices[1]);
                optionC9.setText(q89choices[2]);
                optionD9.setText(q89choices[3]);
            }
            case 10 -> {
                String qsn810,ch8100,ch8101,ch8102,ch8103,crc;
                String chc8100 = null,chc8101 = null,chc8102 = null,chc8103 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/11/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn810 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn810);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/11/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8100 = br.readLine()) != null) {
                        chc8100 = ch8100;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/11/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8101 = br.readLine()) != null) {
                        chc8101 = ch8101;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/11/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8102 = br.readLine()) != null) {
                        chc8102 = ch8102;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/11/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8103 = br.readLine()) != null) {
                        chc8103 = ch8103;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/11/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q810choices = {chc8100,chc8101,chc8102,chc8103};
                choiceShuffle(q810choices);
                optionA9.setText(q810choices[0]);
                optionB9.setText(q810choices[1]);
                optionC9.setText(q810choices[2]);
                optionD9.setText(q810choices[3]);
            }
            case 11 -> {
                String qsn811,ch8110,ch8111,ch8112,ch8113,crc;
                String chc8110 = null,chc8111 = null,chc8112 = null,chc8113 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/12/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn811 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn811);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/12/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8110 = br.readLine()) != null) {
                        chc8110 = ch8110;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/12/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8111 = br.readLine()) != null) {
                        chc8111 = ch8111;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/12/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8112 = br.readLine()) != null) {
                        chc8112 = ch8112;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/12/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8113 = br.readLine()) != null) {
                        chc8113 = ch8113;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/12/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q811choices = {chc8110,chc8111,chc8112,chc8113};
                choiceShuffle(q811choices);
                optionA9.setText(q811choices[0]);
                optionB9.setText(q811choices[1]);
                optionC9.setText(q811choices[2]);
                optionD9.setText(q811choices[3]);
            }
            case 12-> {
                String qsn812,ch8120,ch8121,ch8122,ch8123,crc;
                String chc8120 = null,chc8121 = null,chc8122 = null,chc8123 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/13/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn812 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn812);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/13/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8120 = br.readLine()) != null) {
                        chc8120 = ch8120;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/13/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8121 = br.readLine()) != null) {
                        chc8121 = ch8121;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/13/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8122 = br.readLine()) != null) {
                        chc8122 = ch8122;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/13/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8123 = br.readLine()) != null) {
                        chc8123 = ch8123;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/13/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q812choices = {chc8120,chc8121,chc8122,chc8123};
                choiceShuffle(q812choices);
                optionA9.setText(q812choices[0]);
                optionB9.setText(q812choices[1]);
                optionC9.setText(q812choices[2]);
                optionD9.setText(q812choices[3]);
            }
            case 13 -> {
                String qsn813,ch8130,ch8131,ch8132,ch8133,crc;
                String chc8130 = null,chc8131 = null,chc8132 = null,chc8133 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/14/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn813 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn813);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/14/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8130 = br.readLine()) != null) {
                        chc8130 = ch8130;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/14/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8131 = br.readLine()) != null) {
                        chc8131 = ch8131;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/14/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8132 = br.readLine()) != null) {
                        chc8132 = ch8132;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/14/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8133 = br.readLine()) != null) {
                        chc8133 = ch8133;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/14/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q813choices = {chc8130,chc8131,chc8132,chc8133};
                choiceShuffle(q813choices);
                optionA9.setText(q813choices[0]);
                optionB9.setText(q813choices[1]);
                optionC9.setText(q813choices[2]);
                optionD9.setText(q813choices[3]);
            }
            case 14 -> {
                String qsn814,ch8140,ch8141,ch8142,ch8143,crc;
                String chc8140 = null,chc8141 = null,chc8142 = null,chc8143 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/15/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn814 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn814);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/15/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8140 = br.readLine()) != null) {
                        chc8140 = ch8140;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/15/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8141 = br.readLine()) != null) {
                        chc8141 = ch8141;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/15/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8142 = br.readLine()) != null) {
                        chc8142 = ch8142;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/15/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8143 = br.readLine()) != null) {
                        chc8143 = ch8143;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/15/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q814choices = {chc8140,chc8141,chc8142,chc8143};
                choiceShuffle(q814choices);
                optionA9.setText(q814choices[0]);
                optionB9.setText(q814choices[1]);
                optionC9.setText(q814choices[2]);
                optionD9.setText(q814choices[3]);
            }
            case 15 -> {
                String qsn815,ch8150,ch8151,ch8152,ch8153,crc;
                String chc8150 = null,chc8151 = null,chc8152 = null,chc8153 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/16/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn815 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn815);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/16/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8150 = br.readLine()) != null) {
                        chc8150 = ch8150;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/16/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8151 = br.readLine()) != null) {
                        chc8151 = ch8151;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/16/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8152 = br.readLine()) != null) {
                        chc8152 = ch8152;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/16/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8153 = br.readLine()) != null) {
                        chc8153 = ch8153;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/16/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q815choices = {chc8150,chc8151,chc8152,chc8153};
                choiceShuffle(q815choices);
                optionA9.setText(q815choices[0]);
                optionB9.setText(q815choices[1]);
                optionC9.setText(q815choices[2]);
                optionD9.setText(q815choices[3]);
            }
            case 16 -> {
                String qsn816,ch8160,ch8161,ch8162,ch8163,crc;
                String chc8160 = null,chc8161 = null,chc8162 = null,chc8163 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/17/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn816 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn816);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/17/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8160 = br.readLine()) != null) {
                        chc8160 = ch8160;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/17/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8161 = br.readLine()) != null) {
                        chc8161 = ch8161;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/17/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8162 = br.readLine()) != null) {
                        chc8162 = ch8162;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/17/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8163 = br.readLine()) != null) {
                        chc8163 = ch8163;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/17/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q816choices = {chc8160,chc8161,chc8162,chc8163};
                choiceShuffle(q816choices);
                optionA9.setText(q816choices[0]);
                optionB9.setText(q816choices[1]);
                optionC9.setText(q816choices[2]);
                optionD9.setText(q816choices[3]);
            }
            case 17 -> {
                String qsn817,ch8170,ch8171,ch8172,ch8173,crc;
                String chc8170 = null,chc8171 = null,chc8172 = null,chc8173 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/18/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn817 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn817);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/18/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8170 = br.readLine()) != null) {
                        chc8170 = ch8170;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/18/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8171 = br.readLine()) != null) {
                        chc8171 = ch8171;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/18/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8172 = br.readLine()) != null) {
                        chc8172 = ch8172;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/18/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8173 = br.readLine()) != null) {
                        chc8173 = ch8173;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/18/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q817choices = {chc8170,chc8171,chc8172,chc8173};
                choiceShuffle(q817choices);;
                optionA9.setText(q817choices[0]);
                optionB9.setText(q817choices[1]);
                optionC9.setText(q817choices[2]);
                optionD9.setText(q817choices[3]);
            }
            case 18 -> {
                String qsn818,ch8180,ch8181,ch8182,ch8183,crc;
                String chc8180 = null,chc8181 = null,chc8182 = null,chc8183 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/19/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn818 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn818);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/19/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8180 = br.readLine()) != null) {
                        chc8180 = ch8180;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/19/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8181 = br.readLine()) != null) {
                        chc8181 = ch8181;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/19/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8182 = br.readLine()) != null) {
                        chc8182 = ch8182;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/19/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8183 = br.readLine()) != null) {
                        chc8183 = ch8183;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/19/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q818choices = {chc8180,chc8181,chc8182,chc8183};
                choiceShuffle(q818choices);
                optionA9.setText(q818choices[0]);
                optionB9.setText(q818choices[1]);
                optionC9.setText(q818choices[2]);
                optionD9.setText(q818choices[3]);
            }
            case 19 -> {
                String qsn819,ch8190,ch8191,ch8192,ch8193,crc;
                String chc8190 = null,chc8191 = null,chc8192 = null,chc8193 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/20/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn819 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn819);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/20/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8190 = br.readLine()) != null) {
                        chc8190 = ch8190;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/20/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8191 = br.readLine()) != null) {
                        chc8191 = ch8191;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/20/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8192 = br.readLine()) != null) {
                        chc8192 = ch8192;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/20/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8193 = br.readLine()) != null) {
                        chc8193 = ch8193;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/20/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q819choices = {chc8190,chc8191,chc8192,chc8193};
                choiceShuffle(q819choices);
                optionA9.setText(q819choices[0]);
                optionB9.setText(q819choices[1]);
                optionC9.setText(q819choices[2]);
                optionD9.setText(q819choices[3]);
            }
            case 20 -> {
                String qsn820,ch8200,ch8201,ch8202,ch8203,crc;
                String chc8200 = null,chc8201 = null,chc8202 = null,chc8203 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/21/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn820 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn820);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/21/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8200 = br.readLine()) != null) {
                        chc8200 = ch8200;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/21/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8201 = br.readLine()) != null) {
                        chc8201 = ch8201;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/21/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8202 = br.readLine()) != null) {
                        chc8202 = ch8202;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/21/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8203 = br.readLine()) != null) {
                        chc8203 = ch8203;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/21/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q820choices = {chc8200,chc8201,chc8202,chc8203};
                choiceShuffle(q820choices);
                optionA9.setText(q820choices[0]);
                optionB9.setText(q820choices[1]);
                optionC9.setText(q820choices[2]);
                optionD9.setText(q820choices[3]);
            }
            case 21 -> {
                String qsn821,ch8210,ch8211,ch8212,ch8213,crc;
                String chc8210 = null,chc8211 = null,chc8212 = null,chc8213 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/22/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn821 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn821);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/22/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8210 = br.readLine()) != null) {
                        chc8210 = ch8210;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/22/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8211 = br.readLine()) != null) {
                        chc8211 = ch8211;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/22/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8212 = br.readLine()) != null) {
                        chc8212 = ch8212;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/22/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8213 = br.readLine()) != null) {
                        chc8213 = ch8213;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/22/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q821choices = {chc8210,chc8211,chc8212,chc8213};
                choiceShuffle(q821choices);
                optionA9.setText(q821choices[0]);
                optionB9.setText(q821choices[1]);
                optionC9.setText(q821choices[2]);
                optionD9.setText(q821choices[3]);
            }
            case 22 -> {
                String qsn822,ch8220,ch8221,ch8222,ch8223,crc;
                String chc8220 = null,chc8221 = null,chc8222 = null,chc8223 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/23/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn822 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn822);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/23/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8220 = br.readLine()) != null) {
                        chc8220 = ch8220;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/23/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8221 = br.readLine()) != null) {
                        chc8221 = ch8221;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/23/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8222 = br.readLine()) != null) {
                        chc8222 = ch8222;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/23/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8223 = br.readLine()) != null) {
                        chc8223 = ch8223;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/23/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q822choices = {chc8220,chc8221,chc8222,chc8223};
                choiceShuffle(q822choices);
                optionA9.setText(q822choices[0]);
                optionB9.setText(q822choices[1]);
                optionC9.setText(q822choices[2]);
                optionD9.setText(q822choices[3]);
            }
            case 23 -> {
                String qsn823,ch8230,ch8231,ch8232,ch8233,crc;
                String chc8230 = null,chc8231 = null,chc8232 = null,chc8233 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/24/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn823 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn823);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/24/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8230 = br.readLine()) != null) {
                        chc8230 = ch8230;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/24/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8231 = br.readLine()) != null) {
                        chc8231 = ch8231;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/24/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8232 = br.readLine()) != null) {
                        chc8232 = ch8232;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/24/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8233 = br.readLine()) != null) {
                        chc8233 = ch8233;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/24/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q823choices = {chc8230,chc8231,chc8232,chc8233};
                choiceShuffle(q823choices);
                optionA9.setText(q823choices[0]);
                optionB9.setText(q823choices[1]);
                optionC9.setText(q823choices[2]);
                optionD9.setText(q823choices[3]);
            }
            case 24 -> {
                String qsn824,ch8240,ch8241,ch8242,ch8243,crc;
                String chc8240 = null,chc8241 = null,chc8242 = null,chc8243 = null;
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/25/Question.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((qsn824 = br.readLine()) != null) {
                        questions9Text.setText(questions9Text.getText()+"\n" + qsn824);
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/25/Choice1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8240 = br.readLine()) != null) {
                        chc8240 = ch8240;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/25/Choice2.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8241 = br.readLine()) != null) {
                        chc8241 = ch8241;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/25/Choice3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8242 = br.readLine()) != null) {
                        chc8242 = ch8242;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/25/Choice4.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((ch8243 = br.readLine()) != null) {
                        chc8243 = ch8243;
                    } 
                }
                
                try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/3/25/Answer.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    while ((crc = br.readLine()) != null) {
                        correct = crc;
                    } 
                }

                String[] q824choices = {chc8240,chc8241,chc8242,chc8243};
                choiceShuffle(q824choices);
                optionA9.setText(q824choices[0]);
                optionB9.setText(q824choices[1]);
                optionC9.setText(q824choices[2]);
                optionD9.setText(q824choices[3]);
            }
        }
    }
    
    public void displayT7Question() throws FileNotFoundException, IOException {
        int a = theoRNG();
            switch(a) {
                case 0 -> {
                    String qsn90,ch900,ch901,ch902,ch903,crc;
                    String chc900 = null,chc901 = null,chc902 = null,chc903 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/1/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn90 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn90);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/1/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch900 = br.readLine()) != null) {
                            chc900 = ch900;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/1/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch901 = br.readLine()) != null) {
                            chc901 = ch901;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/1/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch902 = br.readLine()) != null) {
                            chc902 = ch902;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/1/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch903 = br.readLine()) != null) {
                            chc903 = ch903;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/1/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }
                    
                    String[] q90choices = {chc900,chc901,chc902,chc903};
                    choiceShuffle(q90choices);
                    optionA10.setText(q90choices[0]);
                    optionB10.setText(q90choices[1]);
                    optionC10.setText(q90choices[2]);
                    optionD10.setText(q90choices[3]);
                }
                case 1 -> {
                    String qsn91,ch910,ch911,ch912,ch913,crc;
                    String chc910 = null,chc911 = null,chc912 = null,chc913 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/2/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn91 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn91);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/2/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch910 = br.readLine()) != null) {
                            chc910 = ch910;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/2/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch911 = br.readLine()) != null) {
                            chc911 = ch911;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/2/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch912 = br.readLine()) != null) {
                            chc912 = ch912;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/2/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch913 = br.readLine()) != null) {
                            chc913 = ch913;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/2/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q91choices = {chc910,chc911,chc912,chc913};
                    choiceShuffle(q91choices);
                    optionA10.setText(q91choices[0]);
                    optionB10.setText(q91choices[1]);
                    optionC10.setText(q91choices[2]);
                    optionD10.setText(q91choices[3]);
                }
                case 2 -> {
                    String qsn92,ch920,ch921,ch922,ch923,crc;
                    String chc920 = null,chc921 = null,chc922 = null,chc923 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/3/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn92 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn92);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/3/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch920 = br.readLine()) != null) {
                            chc920 = ch920;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/3/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch921 = br.readLine()) != null) {
                            chc921 = ch921;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/3/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch922 = br.readLine()) != null) {
                            chc922 = ch922;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/3/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch923 = br.readLine()) != null) {
                            chc923 = ch923;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/3/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q92choices = {chc920,chc921,chc922,chc923};
                    choiceShuffle(q92choices);
                    optionA10.setText(q92choices[0]);
                    optionB10.setText(q92choices[1]);
                    optionC10.setText(q92choices[2]);
                    optionD10.setText(q92choices[3]);
                }
                case 3 -> {
                    String qsn93,ch930,ch931,ch932,ch933,crc;
                    String chc930 = null,chc931 = null,chc932 = null,chc933 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/4/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn93 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn93);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/4/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch930 = br.readLine()) != null) {
                            chc930 = ch930;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/4/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch931 = br.readLine()) != null) {
                            chc931 = ch931;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/4/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch932 = br.readLine()) != null) {
                            chc932 = ch932;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/4/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch933 = br.readLine()) != null) {
                            chc933 = ch933;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/4/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q93choices = {chc930,chc931,chc932,chc933};
                    choiceShuffle(q93choices);
                    optionA10.setText(q93choices[0]);
                    optionB10.setText(q93choices[1]);
                    optionC10.setText(q93choices[2]);
                    optionD10.setText(q93choices[3]);
                }
                case 4 -> {
                    String qsn94,ch940,ch941,ch942,ch943,crc;
                    String chc940 = null,chc941 = null,chc942 = null,chc943 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/5/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn94 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn94);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/5/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch940 = br.readLine()) != null) {
                            chc940 = ch940;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/5/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch941 = br.readLine()) != null) {
                            chc941 = ch941;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/5/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch942 = br.readLine()) != null) {
                            chc942 = ch942;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/5/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch943 = br.readLine()) != null) {
                            chc943 = ch943;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/5/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q94choices = {chc940,chc941,chc942,chc943};
                    choiceShuffle(q94choices);
                    optionA10.setText(q94choices[0]);
                    optionB10.setText(q94choices[1]);
                    optionC10.setText(q94choices[2]);
                    optionD10.setText(q94choices[3]);
                }
                case 5 -> {
                    String qsn95,ch950,ch951,ch952,ch953,crc;
                    String chc950 = null,chc951 = null,chc952 = null,chc953 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/6/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn95 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn95);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/6/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch950 = br.readLine()) != null) {
                            chc950 = ch950;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/6/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch951 = br.readLine()) != null) {
                            chc951 = ch951;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/6/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch952 = br.readLine()) != null) {
                            chc952 = ch952;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/6/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch953 = br.readLine()) != null) {
                            chc953 = ch953;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/6/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q95choices = {chc950,chc951,chc952,chc953};
                    choiceShuffle(q95choices);
                    optionA10.setText(q95choices[0]);
                    optionB10.setText(q95choices[1]);
                    optionC10.setText(q95choices[2]);
                    optionD10.setText(q95choices[3]);
                }
                case 6 -> {
                    String qsn96,ch960,ch961,ch962,ch963,crc;
                    String chc960 = null,chc961 = null,chc962 = null,chc963 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/7/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn96 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn96);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/7/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch960 = br.readLine()) != null) {
                            chc960 = ch960;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/7/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch961 = br.readLine()) != null) {
                            chc961 = ch961;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/7/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch962 = br.readLine()) != null) {
                            chc962 = ch962;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/7/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch963 = br.readLine()) != null) {
                            chc963 = ch963;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/7/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q96choices = {chc960,chc961,chc962,chc963};
                    choiceShuffle(q96choices);
                    optionA10.setText(q96choices[0]);
                    optionB10.setText(q96choices[1]);
                    optionC10.setText(q96choices[2]);
                    optionD10.setText(q96choices[3]);
                }
                case 7 -> {
                    String qsn97,ch970,ch971,ch972,ch973,crc;
                    String chc970 = null,chc971 = null,chc972 = null,chc973 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/8/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn97 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn97);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/8/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch970 = br.readLine()) != null) {
                            chc970 = ch970;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/8/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch971 = br.readLine()) != null) {
                            chc971 = ch971;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/8/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch972 = br.readLine()) != null) {
                            chc972 = ch972;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/8/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch973 = br.readLine()) != null) {
                            chc973 = ch973;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/8/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q97choices = {chc970,chc971,chc972,chc973};
                    choiceShuffle(q97choices);
                    optionA10.setText(q97choices[0]);
                    optionB10.setText(q97choices[1]);
                    optionC10.setText(q97choices[2]);
                    optionD10.setText(q97choices[3]);
                }
                case 8 -> {
                    String qsn98,ch980,ch981,ch982,ch983,crc;
                    String chc980 = null,chc981 = null,chc982 = null,chc983 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/9/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn98 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn98);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/9/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch980 = br.readLine()) != null) {
                            chc980 = ch980;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/9/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch981 = br.readLine()) != null) {
                            chc981 = ch981;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/9/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch982 = br.readLine()) != null) {
                            chc982 = ch982;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/9/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch983 = br.readLine()) != null) {
                            chc983 = ch983;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/9/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q98choices = {chc980,chc981,chc982,chc983};
                    choiceShuffle(q98choices);
                    optionA10.setText(q98choices[0]);
                    optionB10.setText(q98choices[1]);
                    optionC10.setText(q98choices[2]);
                    optionD10.setText(q98choices[3]);
                }
                case 9 -> {
                    String qsn99,ch990,ch991,ch992,ch993,crc;
                    String chc990 = null,chc991 = null,chc992 = null,chc993 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/10/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn99 = br.readLine()) != null) {
                            questions10Text.setText(questions10Text.getText()+"\n" + qsn99);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/10/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch990 = br.readLine()) != null) {
                            chc990 = ch990;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/10/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch991 = br.readLine()) != null) {
                            chc991 = ch991;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/10/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch992 = br.readLine()) != null) {
                            chc992 = ch992;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/10/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch993 = br.readLine()) != null) {
                            chc993 = ch993;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "TheoreticalQ/7/10/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q99choices = {chc990,chc991,chc992,chc993};
                    choiceShuffle(q99choices);
                    optionA10.setText(q99choices[0]);
                    optionB10.setText(q99choices[1]);
                    optionC10.setText(q99choices[2]);
                    optionD10.setText(q99choices[3]);
                }
            }
    }
    
    public void displayP4Question() throws FileNotFoundException, IOException {
        int a = theoRNG();
            switch(a) {
                case 0 -> {
                    String qsn100,ch1000,ch1001,ch1002,ch1003,crc;
                    String chc1000 = null,chc1001 = null,chc1002 = null,chc1003 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/1/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn100 = br.readLine()) != null) {
                            questions11Text.setText(questions11Text.getText()+"\n" + qsn100);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/1/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1000 = br.readLine()) != null) {
                            chc1000 = ch1000;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/1/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1001 = br.readLine()) != null) {
                            chc1001 = ch1001;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/1/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1002 = br.readLine()) != null) {
                            chc1002 = ch1002;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/1/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1003 = br.readLine()) != null) {
                            chc1003 = ch1003;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/1/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q100choices = {chc1000,chc1001,chc1002,chc1003};
                    choiceShuffle(q100choices);
                    optionA11.setText(q100choices[0]);
                    optionB11.setText(q100choices[1]);
                    optionC11.setText(q100choices[2]);
                    optionD11.setText(q100choices[3]);
                } 
                case 1 -> {
                    String qsn101,ch1010,ch1011,ch1012,ch1013,crc;
                    String chc1010 = null,chc1011 = null,chc1012 = null,chc1013 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/2/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn101 = br.readLine()) != null) {
                            questions11Text.setText(questions11Text.getText()+"\n" + qsn101);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/2/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1010 = br.readLine()) != null) {
                            chc1010 = ch1010;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/2/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1011 = br.readLine()) != null) {
                            chc1011 = ch1011;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/2/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1012 = br.readLine()) != null) {
                            chc1012 = ch1012;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/2/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1013 = br.readLine()) != null) {
                            chc1013 = ch1013;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/2/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q101choices = {chc1010,chc1011,chc1012,chc1013};
                    choiceShuffle(q101choices);
                    optionA11.setText(q101choices[0]);
                    optionB11.setText(q101choices[1]);
                    optionC11.setText(q101choices[2]);
                    optionD11.setText(q101choices[3]);
                }
                case 2 -> {
                    String qsn102,ch1020,ch1021,ch1022,ch1023,crc;
                    String chc1020 = null,chc1021 = null,chc1022 = null,chc1023 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/3/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn102 = br.readLine()) != null) {
                            questions11Text.setText(questions11Text.getText()+"\n" + qsn102);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/3/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1020 = br.readLine()) != null) {
                            chc1020 = ch1020;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/3/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1021 = br.readLine()) != null) {
                            chc1021 = ch1021;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/3/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1022 = br.readLine()) != null) {
                            chc1022 = ch1022;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/3/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1023 = br.readLine()) != null) {
                            chc1023 = ch1023;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/3/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q102choices = {chc1020,chc1021,chc1022,chc1023};
                    choiceShuffle(q102choices);
                    optionA11.setText(q102choices[0]);
                    optionB11.setText(q102choices[1]);
                    optionC11.setText(q102choices[2]);
                    optionD11.setText(q102choices[3]);
                }
                case 3 -> {
                    String qsn103,ch1030,ch1031,ch1032,ch1033,crc;
                    String chc1030 = null,chc1031 = null,chc1032 = null,chc1033 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/4/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn103 = br.readLine()) != null) {
                            questions11Text.setText(questions11Text.getText()+"\n" + qsn103);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/4/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1030 = br.readLine()) != null) {
                            chc1030 = ch1030;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/4/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1031 = br.readLine()) != null) {
                            chc1031 = ch1031;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/4/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1032 = br.readLine()) != null) {
                            chc1032 = ch1032;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/4/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1033 = br.readLine()) != null) {
                            chc1033 = ch1033;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/4/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q103choices = {chc1030,chc1031,chc1032,chc1033};
                    choiceShuffle(q103choices);
                    optionA11.setText(q103choices[0]);
                    optionB11.setText(q103choices[1]);
                    optionC11.setText(q103choices[2]);
                    optionD11.setText(q103choices[3]);
                }
                case 4 -> {
                    String qsn104,ch1040,ch1041,ch1042,ch1043,crc;
                    String chc1040 = null,chc1041 = null,chc1042 = null,chc1043 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/5/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn104 = br.readLine()) != null) {
                            questions11Text.setText(questions11Text.getText()+"\n" + qsn104);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/5/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1040 = br.readLine()) != null) {
                            chc1040 = ch1040;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/5/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1041 = br.readLine()) != null) {
                            chc1041 = ch1041;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/5/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1042 = br.readLine()) != null) {
                            chc1042 = ch1042;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/5/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1043 = br.readLine()) != null) {
                            chc1043 = ch1043;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/5/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q104choices = {chc1040,chc1041,chc1042,chc1043};
                    choiceShuffle(q104choices);
                    optionA11.setText(q104choices[0]);
                    optionB11.setText(q104choices[1]);
                    optionC11.setText(q104choices[2]);
                    optionD11.setText(q104choices[3]);
                }
                case 5 -> {
                    String qsn105,ch1050,ch1051,ch1052,ch1053,crc;
                    String chc1050 = null,chc1051 = null,chc1052 = null,chc1053 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/6/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn105 = br.readLine()) != null) {
                            questions6Text.setText(questions6Text.getText()+"\n" + qsn105);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/6/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1050 = br.readLine()) != null) {
                            chc1050 = ch1050;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/6/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1051 = br.readLine()) != null) {
                            chc1051 = ch1051;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/6/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1052 = br.readLine()) != null) {
                            chc1052 = ch1052;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/6/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1053 = br.readLine()) != null) {
                            chc1053 = ch1053;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/6/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q105choices = {chc1050,chc1051,chc1052,chc1053};
                    choiceShuffle(q105choices);
                    optionA11.setText(q105choices[0]);
                    optionB11.setText(q105choices[1]);
                    optionC11.setText(q105choices[2]);
                    optionD11.setText(q105choices[3]);
                }
                case 6 -> {
                    String qsn106,ch1060,ch1061,ch1062,ch1063,crc;
                    String chc1060 = null,chc1061 = null,chc1062 = null,chc1063 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/7/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn106 = br.readLine()) != null) {
                            questions11Text.setText(questions11Text.getText()+"\n" + qsn106);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/7/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1060 = br.readLine()) != null) {
                            chc1060 = ch1060;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/7/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1061 = br.readLine()) != null) {
                            chc1061 = ch1061;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/7/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1062 = br.readLine()) != null) {
                            chc1062 = ch1062;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/7/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1063 = br.readLine()) != null) {
                            chc1063 = ch1063;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/7/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q106choices = {chc1060,chc1061,chc1062,chc1063};
                    choiceShuffle(q106choices);
                    optionA11.setText(q106choices[0]);
                    optionB11.setText(q106choices[1]);
                    optionC11.setText(q106choices[2]);
                    optionD11.setText(q106choices[3]);
                }
                case 7 -> {
                    String qsn107,ch1070,ch1071,ch1072,ch1073,crc;
                    String chc1070 = null,chc1071 = null,chc1072 = null,chc1073 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/8/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn107 = br.readLine()) != null) {
                            questions11Text.setText(questions11Text.getText()+"\n" + qsn107);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/8/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1070 = br.readLine()) != null) {
                            chc1070 = ch1070;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/8/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1071 = br.readLine()) != null) {
                            chc1071 = ch1071;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/8/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1072 = br.readLine()) != null) {
                            chc1072 = ch1072;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/8/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1073 = br.readLine()) != null) {
                            chc1073 = ch1073;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/8/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q107choices = {chc1070,chc1071,chc1072,chc1073};
                    choiceShuffle(q107choices);
                    optionA11.setText(q107choices[0]);
                    optionB11.setText(q107choices[1]);
                    optionC11.setText(q107choices[2]);
                    optionD11.setText(q107choices[3]);
                }
                case 8 -> {
                    String qsn108,ch1080,ch1081,ch1082,ch1083,crc;
                    String chc1080 = null,chc1081 = null,chc1082 = null,chc1083 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/9/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn108 = br.readLine()) != null) {
                            questions11Text.setText(questions11Text.getText()+"\n" + qsn108);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/9/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1080 = br.readLine()) != null) {
                            chc1080 = ch1080;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/9/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1081 = br.readLine()) != null) {
                            chc1081 = ch1081;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/9/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1082 = br.readLine()) != null) {
                            chc1082 = ch1082;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/9/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1083 = br.readLine()) != null) {
                            chc1083 = ch1083;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/9/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q108choices = {chc1080,chc1081,chc1082,chc1083};
                    choiceShuffle(q108choices);
                    optionA11.setText(q108choices[0]);
                    optionB11.setText(q108choices[1]);
                    optionC11.setText(q108choices[2]);
                    optionD11.setText(q108choices[3]);
                }
                case 9 -> {
                    String qsn109,ch1090,ch1091,ch1092,ch1093,crc;
                    String chc1090 = null,chc1091 = null,chc1092 = null,chc1093 = null;
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/10/Question.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((qsn109 = br.readLine()) != null) {
                            questions11Text.setText(questions11Text.getText()+"\n" + qsn109);
                        }
                    }
                
                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/10/Choice1.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1090 = br.readLine()) != null) {
                            chc1090 = ch1090;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/10/Choice2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1091 = br.readLine()) != null) {
                            chc1091 = ch1091;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/10/Choice3.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1092 = br.readLine()) != null) {
                            chc1092 = ch1092;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/10/Choice4.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((ch1093 = br.readLine()) != null) {
                            chc1093 = ch1093;
                        } 
                    }

                    try (InputStream in = getClass().getResourceAsStream("/" + "ProgrammingQ/4/10/Answer.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                        while ((crc = br.readLine()) != null) {
                            correct = crc;
                        } 
                    }

                    String[] q109choices = {chc1090,chc1091,chc1092,chc1093};
                    choiceShuffle(q109choices);
                    optionA11.setText(q109choices[0]);
                    optionB11.setText(q109choices[1]);
                    optionC11.setText(q109choices[2]);
                    optionD11.setText(q109choices[3]);
                }
            }
    }
    
    public void panel2Start() throws FileNotFoundException, IOException{
        try {
            displayT2Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer2.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(theoretical2Panel);
        mainPanel.repaint();
        mainPanel.revalidate(); 
    }
    
    public void panel3Start() throws FileNotFoundException, IOException{
        try {
            displayP1Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer3.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(code1Panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void panel4Start(){
        try {
            displayT3Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer4.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(theoretical3Panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void panel5Start(){
        try {
            displayT4Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer5.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(theoretical4Panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void panel6Start(){
        try {
            displayP2Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer6.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(code2Panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void panel7Start(){
        try {
            displayT5Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer7.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(theoretical5Panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void panel8Start(){
        try {
            displayT6Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer8.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(theoretical6Panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void panel9Start(){
        try {
            displayP3Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer9.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(code3Panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void panel10Start(){
        try {
            displayT7Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer10.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(theoretical7Panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void panel11Start(){
        try {
            displayP4Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        timer11.start();
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(code4Panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void panelResultsStart(){
        scoreField.setText(Integer.toString(totalScore));
        mainPanel.removeAll();
        mainPanel.add(resultsPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
        
    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        // TODO add your handling code here:

        mainPanel.removeAll();
        mainPanel.add(aboutPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        pause.setRepeats(false);
        pause.start();

        try {
            displayT1Question();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_startGameButtonActionPerformed

    private void instructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionsButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(howToPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_instructionsButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void homeFinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeFinishButtonActionPerformed
        // TODO add your handling code here:
        totalScore=0;
        index++;
        mainPanel.removeAll();
        mainPanel.add(startMenuPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_homeFinishButtonActionPerformed

    private void finishExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_finishExitButtonActionPerformed

    private void scoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreFieldActionPerformed

    private void returntoMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returntoMenuButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(startMenuPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_returntoMenuButtonActionPerformed

    private void secondsLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeftActionPerformed

    private void choiceA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA1ActionPerformed
        // TODO add your handling code here:
        timer1.stop();
        
        if(evt.getSource() == choiceA1){
            answer = optionA1.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        
        try {
            panel2Start();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choiceA1ActionPerformed

    private void choiceB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB1ActionPerformed
        // TODO add your handling code here:
        timer1.stop();
        
        if(evt.getSource() == choiceB1){
            answer = optionB1.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        try {
            panel2Start();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choiceB1ActionPerformed

    private void choiceC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC1ActionPerformed
        // TODO add your handling code here:
        timer1.stop();
        
        if(evt.getSource() == choiceC1){
            answer = optionC1.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        try {
            panel2Start();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choiceC1ActionPerformed

    private void choiceD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD1ActionPerformed
        // TODO add your handling code here:
        timer1.stop();
        
        if(evt.getSource() == choiceD1){
            answer = optionD1.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        try {
            panel2Start();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choiceD1ActionPerformed

    private void secondsLeft1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft1ActionPerformed

    private void choiceA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA2ActionPerformed
        // TODO add your handling code here:
        timer2.stop();
        if(evt.getSource() == choiceA2){
            answer = optionA2.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        try {
            panel3Start();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choiceA2ActionPerformed

    private void choiceB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB2ActionPerformed
        // TODO add your handling code here:
        timer2.stop();
        if(evt.getSource() == choiceB2){
            answer = optionB2.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        try {
            panel3Start();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choiceB2ActionPerformed

    private void choiceC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC2ActionPerformed
        // TODO add your handling code here:
        timer2.stop();
        if(evt.getSource() == choiceC2){
            answer = optionC2.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        try {
            panel3Start();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choiceC2ActionPerformed

    private void choiceD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD2ActionPerformed
        // TODO add your handling code here:
        timer2.stop();
        if(evt.getSource() == choiceD2){
            answer = optionD2.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        try {
            panel3Start();
        } catch (IOException ex) {
            Logger.getLogger(QuizGameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_choiceD2ActionPerformed

    private void secondsLeft2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft2ActionPerformed

    private void choiceA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA3ActionPerformed
        // TODO add your handling code here:
        timer3.stop();
        if(evt.getSource() == choiceA3){
            answer = optionA3.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel4Start();
    }//GEN-LAST:event_choiceA3ActionPerformed

    private void choiceB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB3ActionPerformed
        // TODO add your handling code here:
        timer3.stop();
        if(evt.getSource() == choiceB3){
            answer = optionB3.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel4Start();
    }//GEN-LAST:event_choiceB3ActionPerformed

    private void choiceC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC3ActionPerformed
        // TODO add your handling code here:
        timer3.stop();
        if(evt.getSource() == choiceC3){
            answer = optionC3.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel4Start();
    }//GEN-LAST:event_choiceC3ActionPerformed

    private void choiceD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD3ActionPerformed
        // TODO add your handling code here:
        timer3.stop();
        if(evt.getSource() == choiceD3){
            answer = optionD3.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel4Start();
    }//GEN-LAST:event_choiceD3ActionPerformed

    private void secondsLeft3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft3ActionPerformed

    private void choiceA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA4ActionPerformed
        // TODO add your handling code here:
        timer4.stop();
        if(evt.getSource() == choiceA4){
            answer = optionA4.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel5Start();
    }//GEN-LAST:event_choiceA4ActionPerformed

    private void choiceB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB4ActionPerformed
        // TODO add your handling code here:
        timer4.stop();
        if(evt.getSource() == choiceB4){
            answer = optionB4.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel5Start();
    }//GEN-LAST:event_choiceB4ActionPerformed

    private void choiceC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC4ActionPerformed
        // TODO add your handling code here:
        timer4.stop();
        if(evt.getSource() == choiceC4){
            answer = optionC4.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel5Start();
    }//GEN-LAST:event_choiceC4ActionPerformed

    private void choiceD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD4ActionPerformed
        // TODO add your handling code here:
        timer4.stop();
        if(evt.getSource() == choiceD4){
            answer = optionD4.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel5Start();
    }//GEN-LAST:event_choiceD4ActionPerformed

    private void secondsLeft4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft4ActionPerformed

    private void choiceA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA5ActionPerformed
        // TODO add your handling code here:
        timer5.stop();
        if(evt.getSource() == choiceA5){
            answer = optionA5.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel6Start();
    }//GEN-LAST:event_choiceA5ActionPerformed

    private void choiceB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB5ActionPerformed
        // TODO add your handling code here:
        timer5.stop();
        if(evt.getSource() == choiceB5){
            answer = optionB5.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel6Start();
    }//GEN-LAST:event_choiceB5ActionPerformed

    private void choiceC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC5ActionPerformed
        // TODO add your handling code here:
        timer5.stop();
        if(evt.getSource() == choiceC5){
            answer = optionC5.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel6Start();
    }//GEN-LAST:event_choiceC5ActionPerformed

    private void choiceD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD5ActionPerformed
        // TODO add your handling code here:
        timer5.stop();
        if(evt.getSource() == choiceD5){
            answer = optionD5.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel6Start();
    }//GEN-LAST:event_choiceD5ActionPerformed

    private void secondsLeft5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft5ActionPerformed

    private void choiceA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA6ActionPerformed
        // TODO add your handling code here:
        timer6.stop();
        if(evt.getSource() == choiceA6){
            answer = optionA6.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel7Start();
    }//GEN-LAST:event_choiceA6ActionPerformed

    private void choiceB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB6ActionPerformed
        // TODO add your handling code here:
        timer6.stop();
        if(evt.getSource() == choiceB6){
            answer = optionB6.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel7Start();
    }//GEN-LAST:event_choiceB6ActionPerformed

    private void choiceC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC6ActionPerformed
        // TODO add your handling code here:
        timer6.stop();
        if(evt.getSource() == choiceC6){
            answer = optionC6.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel7Start();
    }//GEN-LAST:event_choiceC6ActionPerformed

    private void choiceD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD6ActionPerformed
        // TODO add your handling code here:
        timer6.stop();
        if(evt.getSource() == choiceD6){
            answer = optionD6.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel7Start();
    }//GEN-LAST:event_choiceD6ActionPerformed

    private void secondsLeft6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft6ActionPerformed

    private void choiceA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA7ActionPerformed
        // TODO add your handling code here:
        timer7.stop();
        if(evt.getSource() == choiceA7){
            answer = optionA7.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel8Start();
    }//GEN-LAST:event_choiceA7ActionPerformed

    private void choiceB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB7ActionPerformed
        // TODO add your handling code here:
        timer7.stop();
        if(evt.getSource() == choiceB7){
            answer = optionB7.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel8Start();
    }//GEN-LAST:event_choiceB7ActionPerformed

    private void choiceC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC7ActionPerformed
        // TODO add your handling code here:
        timer7.stop();
        if(evt.getSource() == choiceC7){
            answer = optionC7.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
       panel8Start();
    }//GEN-LAST:event_choiceC7ActionPerformed

    private void choiceD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD7ActionPerformed
        // TODO add your handling code here:
        timer7.stop();
        if(evt.getSource() == choiceD7){
            answer = optionD7.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel8Start();
    }//GEN-LAST:event_choiceD7ActionPerformed

    private void secondsLeft7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft7ActionPerformed

    private void choiceA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA8ActionPerformed
        // TODO add your handling code here:
        timer8.stop();
        if(evt.getSource() == choiceA8){
            answer = optionA8.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel9Start();
    }//GEN-LAST:event_choiceA8ActionPerformed

    private void choiceB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB8ActionPerformed
        // TODO add your handling code here:
        timer8.stop();
        if(evt.getSource() == choiceB8){
            answer = optionB8.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel9Start();
    }//GEN-LAST:event_choiceB8ActionPerformed

    private void choiceC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC8ActionPerformed
        // TODO add your handling code here:
        timer8.stop();
        if(evt.getSource() == choiceC8){
            answer = optionC8.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel9Start();
    }//GEN-LAST:event_choiceC8ActionPerformed

    private void choiceD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD8ActionPerformed
        // TODO add your handling code here:
        timer8.stop();
        if(evt.getSource() == choiceD8){
            answer = optionD8.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel9Start();
    }//GEN-LAST:event_choiceD8ActionPerformed

    private void secondsLeft8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft8ActionPerformed

    private void choiceA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA9ActionPerformed
        // TODO add your handling code here:
        timer9.stop();
        if(evt.getSource() == choiceA9){
            answer = optionA9.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel10Start();
    }//GEN-LAST:event_choiceA9ActionPerformed

    private void choiceB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB9ActionPerformed
        // TODO add your handling code here:
        timer9.stop();
        if(evt.getSource() == choiceB9){
            answer = optionB9.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel10Start();
    }//GEN-LAST:event_choiceB9ActionPerformed

    private void choiceC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC9ActionPerformed
        // TODO add your handling code here:
        timer9.stop();
        if(evt.getSource() == choiceC9){
            answer = optionC9.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel10Start();
    }//GEN-LAST:event_choiceC9ActionPerformed

    private void choiceD9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD9ActionPerformed
        // TODO add your handling code here:
        timer9.stop();
        if(evt.getSource() == choiceD9){
            answer = optionD9.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel10Start();
    }//GEN-LAST:event_choiceD9ActionPerformed

    private void secondsLeft9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft9ActionPerformed

    private void choiceA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA10ActionPerformed
        // TODO add your handling code here:
        timer10.stop();
        if(evt.getSource() == choiceA10){
            answer = optionA10.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel11Start();
    }//GEN-LAST:event_choiceA10ActionPerformed

    private void choiceB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB10ActionPerformed
        // TODO add your handling code here:
        timer10.stop();
        if(evt.getSource() == choiceB10){
            answer = optionB10.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel11Start();
    }//GEN-LAST:event_choiceB10ActionPerformed

    private void choiceC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC10ActionPerformed
        // TODO add your handling code here:
        timer10.stop();
        if(evt.getSource() == choiceC10){
            answer = optionC10.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel11Start();
    }//GEN-LAST:event_choiceC10ActionPerformed

    private void choiceD10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD10ActionPerformed
        // TODO add your handling code here:
        timer10.stop();
        if(evt.getSource() == choiceD10){
            answer = optionD10.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panel11Start();
    }//GEN-LAST:event_choiceD10ActionPerformed

    private void secondsLeft10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsLeft10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsLeft10ActionPerformed

    private void choiceA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceA11ActionPerformed
        // TODO add your handling code here:
        timer10.stop();
        if(evt.getSource() == choiceA11){
            answer = optionA11.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panelResultsStart();
    }//GEN-LAST:event_choiceA11ActionPerformed

    private void choiceB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceB11ActionPerformed
        // TODO add your handling code here:
        timer11.stop();
        if(evt.getSource() == choiceB11){
            answer = optionB11.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panelResultsStart();
    }//GEN-LAST:event_choiceB11ActionPerformed

    private void choiceC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceC11ActionPerformed
        // TODO add your handling code here:
        timer11.stop();
        if(evt.getSource() == choiceC11){
            answer = optionC11.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panelResultsStart();
    }//GEN-LAST:event_choiceC11ActionPerformed

    private void choiceD11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceD11ActionPerformed
        // TODO add your handling code here:
        timer11.stop();
        if(evt.getSource() == choiceD11){
            answer = optionD11.getText();
            if(answer.equals(correct)){
                totalScore++;
            }
        }
        panelResultsStart();
    }//GEN-LAST:event_choiceD11ActionPerformed

    public static void main(String args[])throws UnsupportedAudioFileException, IOException, LineUnavailableException, IOException{
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        BackgroundMusic bgmTrial = new BackgroundMusic();
        bgmTrial.playMusic();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizGameUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JButton choiceA1;
    private javax.swing.JButton choiceA10;
    private javax.swing.JButton choiceA11;
    private javax.swing.JButton choiceA2;
    private javax.swing.JButton choiceA3;
    private javax.swing.JButton choiceA4;
    private javax.swing.JButton choiceA5;
    private javax.swing.JButton choiceA6;
    private javax.swing.JButton choiceA7;
    private javax.swing.JButton choiceA8;
    private javax.swing.JButton choiceA9;
    private javax.swing.JButton choiceB1;
    private javax.swing.JButton choiceB10;
    private javax.swing.JButton choiceB11;
    private javax.swing.JButton choiceB2;
    private javax.swing.JButton choiceB3;
    private javax.swing.JButton choiceB4;
    private javax.swing.JButton choiceB5;
    private javax.swing.JButton choiceB6;
    private javax.swing.JButton choiceB7;
    private javax.swing.JButton choiceB8;
    private javax.swing.JButton choiceB9;
    private javax.swing.JButton choiceC1;
    private javax.swing.JButton choiceC10;
    private javax.swing.JButton choiceC11;
    private javax.swing.JButton choiceC2;
    private javax.swing.JButton choiceC3;
    private javax.swing.JButton choiceC4;
    private javax.swing.JButton choiceC5;
    private javax.swing.JButton choiceC6;
    private javax.swing.JButton choiceC7;
    private javax.swing.JButton choiceC8;
    private javax.swing.JButton choiceC9;
    private javax.swing.JButton choiceD1;
    private javax.swing.JButton choiceD10;
    private javax.swing.JButton choiceD11;
    private javax.swing.JButton choiceD2;
    private javax.swing.JButton choiceD3;
    private javax.swing.JButton choiceD4;
    private javax.swing.JButton choiceD5;
    private javax.swing.JButton choiceD6;
    private javax.swing.JButton choiceD7;
    private javax.swing.JButton choiceD8;
    private javax.swing.JButton choiceD9;
    private javax.swing.JPanel code1Panel;
    private javax.swing.JPanel code2Panel;
    private javax.swing.JPanel code3Panel;
    private javax.swing.JPanel code4Panel;
    private javax.swing.JButton finishExitButton;
    private javax.swing.JButton homeFinishButton;
    private javax.swing.JTextArea howTo;
    private javax.swing.JPanel howToPanel;
    private javax.swing.JButton instructionsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JPanel mainPanel;
    public javax.swing.JTextArea optionA1;
    public javax.swing.JTextArea optionA10;
    public javax.swing.JTextArea optionA11;
    public javax.swing.JTextArea optionA2;
    public javax.swing.JTextArea optionA3;
    public javax.swing.JTextArea optionA4;
    public javax.swing.JTextArea optionA5;
    public javax.swing.JTextArea optionA6;
    public javax.swing.JTextArea optionA7;
    public javax.swing.JTextArea optionA8;
    public javax.swing.JTextArea optionA9;
    public javax.swing.JTextArea optionB1;
    public javax.swing.JTextArea optionB10;
    public javax.swing.JTextArea optionB11;
    public javax.swing.JTextArea optionB2;
    public javax.swing.JTextArea optionB3;
    public javax.swing.JTextArea optionB4;
    public javax.swing.JTextArea optionB5;
    public javax.swing.JTextArea optionB6;
    public javax.swing.JTextArea optionB7;
    public javax.swing.JTextArea optionB8;
    public javax.swing.JTextArea optionB9;
    public javax.swing.JTextArea optionC1;
    public javax.swing.JTextArea optionC10;
    public javax.swing.JTextArea optionC11;
    public javax.swing.JTextArea optionC2;
    public javax.swing.JTextArea optionC3;
    public javax.swing.JTextArea optionC4;
    public javax.swing.JTextArea optionC5;
    public javax.swing.JTextArea optionC6;
    public javax.swing.JTextArea optionC7;
    public javax.swing.JTextArea optionC8;
    public javax.swing.JTextArea optionC9;
    public javax.swing.JTextArea optionD1;
    public javax.swing.JTextArea optionD10;
    public javax.swing.JTextArea optionD11;
    public javax.swing.JTextArea optionD2;
    public javax.swing.JTextArea optionD3;
    public javax.swing.JTextArea optionD4;
    public javax.swing.JTextArea optionD5;
    public javax.swing.JTextArea optionD6;
    public javax.swing.JTextArea optionD7;
    public javax.swing.JTextArea optionD8;
    public javax.swing.JTextArea optionD9;
    public javax.swing.JTextArea questions10Text;
    public javax.swing.JTextArea questions11Text;
    public javax.swing.JTextArea questions1Text;
    public javax.swing.JTextArea questions2Text;
    public javax.swing.JTextArea questions3Text;
    public javax.swing.JTextArea questions4Text;
    public javax.swing.JTextArea questions5Text;
    public javax.swing.JTextArea questions6Text;
    public javax.swing.JTextArea questions7Text;
    public javax.swing.JTextArea questions8Text;
    public javax.swing.JTextArea questions9Text;
    private javax.swing.JButton quitButton;
    public javax.swing.JPanel resultsPanel;
    private javax.swing.JButton returntoMenuButton;
    public javax.swing.JTextField scoreField;
    private javax.swing.JTextField secondsLeft;
    private javax.swing.JTextField secondsLeft1;
    private javax.swing.JTextField secondsLeft10;
    private javax.swing.JTextField secondsLeft2;
    private javax.swing.JTextField secondsLeft3;
    private javax.swing.JTextField secondsLeft4;
    private javax.swing.JTextField secondsLeft5;
    private javax.swing.JTextField secondsLeft6;
    private javax.swing.JTextField secondsLeft7;
    private javax.swing.JTextField secondsLeft8;
    private javax.swing.JTextField secondsLeft9;
    private javax.swing.JButton startGameButton;
    private javax.swing.JPanel startMenuPanel;
    private javax.swing.JPanel theoretical1Panel;
    private javax.swing.JPanel theoretical2Panel;
    private javax.swing.JPanel theoretical3Panel;
    private javax.swing.JPanel theoretical4Panel;
    private javax.swing.JPanel theoretical5Panel;
    private javax.swing.JPanel theoretical6Panel;
    private javax.swing.JPanel theoretical7Panel;
    // End of variables declaration//GEN-END:variables
}