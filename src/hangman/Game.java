
package hangman;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Game extends javax.swing.JFrame {
    
    int num;
    int wrong = 0;
    
    String question[] = {"He Is A Java Professor In TJ","Short Name Of Tehran Jonob","It Is A Programming Language","It Is A game","A Programming Group","He Builds This Game","A Country","A Religion","A FootBall Player","A FootBall Player"};
    String word[] = {"Mirabi","TJ","Java","HangMan","Decoder","JR.Y","Iran","Islam","Messi","Ronaldo"};
    
    public JTextField text(int n){
        JTextField tex[] = {t0,t1,t2,t3,t4,t5,t6,t7,t8};
                return tex[n];
    }
    public JLabel label(int n){
        JLabel lab[] = {f0,f1,f2,f3,f4};
                return lab[n];
    }
    
    public void check(char c){
        int ch = 0;
        for(int i = 0 ; i < word[num-1].length() ; i++){
            if (word[num-1].toUpperCase().charAt(i) == c){
                text(i).setText(String.valueOf(c));
                ch++;
            }
        }if (ch == 0){
            if (wrong == 5){
                JOptionPane.showMessageDialog(null, "You Lose!");
            }else{
                label(wrong).setForeground(Color.red);
                wrong++;
            }
        }
        String s = "";
        for(int i = 0 ; i < word[num-1].length() ; i++){
            s = s + text(i).getText();
        }
        if (s.equalsIgnoreCase(word[num-1].toUpperCase())){
            JOptionPane.showMessageDialog(null, "you won!");
    }
    }
        
    public Game() {
        initComponents();
    }
    
    
    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        J = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        K = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        Q = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        U = new javax.swing.JLabel();
        V = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        Y = new javax.swing.JLabel();
        Z = new javax.swing.JLabel();
        que = new javax.swing.JTextField();
        f0 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        t0 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        Start = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hang Man", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        A.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A.setText("A");
        A.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AMouseMoved(evt);
            }
        });
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AMouseExited(evt);
            }
        });

        B.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setText("B");
        B.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BMouseMoved(evt);
            }
        });
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BMouseExited(evt);
            }
        });

        D.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D.setText("D");
        D.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DMouseMoved(evt);
            }
        });
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DMouseExited(evt);
            }
        });

        C.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.setText("C");
        C.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CMouseMoved(evt);
            }
        });
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CMouseExited(evt);
            }
        });

        E.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        E.setForeground(new java.awt.Color(255, 255, 255));
        E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E.setText("E");
        E.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EMouseMoved(evt);
            }
        });
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EMouseExited(evt);
            }
        });

        F.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        F.setForeground(new java.awt.Color(255, 255, 255));
        F.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F.setText("F");
        F.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FMouseMoved(evt);
            }
        });
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FMouseExited(evt);
            }
        });

        G.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        G.setForeground(new java.awt.Color(255, 255, 255));
        G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G.setText("G");
        G.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                GMouseMoved(evt);
            }
        });
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GMouseExited(evt);
            }
        });

        I.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        I.setForeground(new java.awt.Color(255, 255, 255));
        I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I.setText("I");
        I.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                IMouseMoved(evt);
            }
        });
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IMouseExited(evt);
            }
        });

        J.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        J.setForeground(new java.awt.Color(255, 255, 255));
        J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J.setText("J");
        J.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JMouseMoved(evt);
            }
        });
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JMouseExited(evt);
            }
        });

        H.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        H.setForeground(new java.awt.Color(255, 255, 255));
        H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H.setText("H");
        H.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HMouseMoved(evt);
            }
        });
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HMouseExited(evt);
            }
        });

        L.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L.setForeground(new java.awt.Color(255, 255, 255));
        L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L.setText("L");
        L.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LMouseMoved(evt);
            }
        });
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LMouseExited(evt);
            }
        });

        M.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        M.setForeground(new java.awt.Color(255, 255, 255));
        M.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M.setText("M");
        M.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MMouseMoved(evt);
            }
        });
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MMouseExited(evt);
            }
        });

        K.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        K.setForeground(new java.awt.Color(255, 255, 255));
        K.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        K.setText("K");
        K.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                KMouseMoved(evt);
            }
        });
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KMouseExited(evt);
            }
        });

        O.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        O.setForeground(new java.awt.Color(255, 255, 255));
        O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        O.setText("O");
        O.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                OMouseMoved(evt);
            }
        });
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OMouseExited(evt);
            }
        });

        P.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        P.setForeground(new java.awt.Color(255, 255, 255));
        P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P.setText("P");
        P.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PMouseMoved(evt);
            }
        });
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PMouseExited(evt);
            }
        });

        N.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        N.setForeground(new java.awt.Color(255, 255, 255));
        N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N.setText("N");
        N.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NMouseMoved(evt);
            }
        });
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NMouseExited(evt);
            }
        });

        R.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        R.setForeground(new java.awt.Color(255, 255, 255));
        R.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R.setText("R");
        R.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RMouseMoved(evt);
            }
        });
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RMouseExited(evt);
            }
        });

        S.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        S.setForeground(new java.awt.Color(255, 255, 255));
        S.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        S.setText("S");
        S.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SMouseMoved(evt);
            }
        });
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SMouseExited(evt);
            }
        });

        Q.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Q.setForeground(new java.awt.Color(255, 255, 255));
        Q.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Q.setText("Q");
        Q.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                QMouseMoved(evt);
            }
        });
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QMouseExited(evt);
            }
        });

        T.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        T.setForeground(new java.awt.Color(255, 255, 255));
        T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T.setText("T");
        T.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TMouseMoved(evt);
            }
        });
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TMouseExited(evt);
            }
        });

        U.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        U.setForeground(new java.awt.Color(255, 255, 255));
        U.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U.setText("U");
        U.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UMouseMoved(evt);
            }
        });
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UMouseExited(evt);
            }
        });

        V.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        V.setForeground(new java.awt.Color(255, 255, 255));
        V.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        V.setText("V");
        V.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                VMouseMoved(evt);
            }
        });
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VMouseExited(evt);
            }
        });

        W.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        W.setForeground(new java.awt.Color(255, 255, 255));
        W.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        W.setText("W");
        W.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                WMouseMoved(evt);
            }
        });
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WMouseExited(evt);
            }
        });

        X.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");
        X.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                XMouseMoved(evt);
            }
        });
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XMouseExited(evt);
            }
        });

        Y.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Y.setForeground(new java.awt.Color(255, 255, 255));
        Y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Y.setText("Y");
        Y.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                YMouseMoved(evt);
            }
        });
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YMouseExited(evt);
            }
        });

        Z.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Z.setForeground(new java.awt.Color(255, 255, 255));
        Z.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Z.setText("Z");
        Z.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ZMouseMoved(evt);
            }
        });
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ZMouseExited(evt);
            }
        });

        que.setEditable(false);
        que.setBackground(new java.awt.Color(51, 51, 51));
        que.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        que.setForeground(new java.awt.Color(255, 255, 255));
        que.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        f0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        f0.setForeground(new java.awt.Color(255, 255, 255));
        f0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f0.setText("O");

        f1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        f1.setForeground(new java.awt.Color(255, 255, 255));
        f1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f1.setText("O");

        f2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        f2.setForeground(new java.awt.Color(255, 255, 255));
        f2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f2.setText("O");

        f3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        f3.setForeground(new java.awt.Color(255, 255, 255));
        f3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f3.setText("O");

        f4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        f4.setForeground(new java.awt.Color(255, 255, 255));
        f4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f4.setText("O");

        t0.setEditable(false);
        t0.setBackground(new java.awt.Color(51, 51, 51));
        t0.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t0.setForeground(new java.awt.Color(255, 255, 255));
        t0.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t1.setEditable(false);
        t1.setBackground(new java.awt.Color(51, 51, 51));
        t1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(51, 51, 51));
        t2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t3.setEditable(false);
        t3.setBackground(new java.awt.Color(51, 51, 51));
        t3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t4.setEditable(false);
        t4.setBackground(new java.awt.Color(51, 51, 51));
        t4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t5.setEditable(false);
        t5.setBackground(new java.awt.Color(51, 51, 51));
        t5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t6.setEditable(false);
        t6.setBackground(new java.awt.Color(51, 51, 51));
        t6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t6.setForeground(new java.awt.Color(255, 255, 255));
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t8.setEditable(false);
        t8.setBackground(new java.awt.Color(51, 51, 51));
        t8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t8.setForeground(new java.awt.Color(255, 255, 255));
        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t7.setEditable(false);
        t7.setBackground(new java.awt.Color(51, 51, 51));
        t7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t7.setForeground(new java.awt.Color(255, 255, 255));
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Start.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Start.setForeground(new java.awt.Color(51, 204, 0));
        Start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Start.setText("Start");
        Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("De.Coder();");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("JR.Y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(N)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(O)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Q)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(S)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(T)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(U)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(V)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(W)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(X)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Y)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Z))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(A)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(I)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(J)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(K)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(L)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(f0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addComponent(que, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(que, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(t7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t0, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A)
                    .addComponent(B)
                    .addComponent(D)
                    .addComponent(C)
                    .addComponent(E)
                    .addComponent(F)
                    .addComponent(G)
                    .addComponent(I)
                    .addComponent(J)
                    .addComponent(H)
                    .addComponent(L)
                    .addComponent(M)
                    .addComponent(K))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(O)
                    .addComponent(P)
                    .addComponent(N)
                    .addComponent(R)
                    .addComponent(S)
                    .addComponent(Q)
                    .addComponent(T)
                    .addComponent(U)
                    .addComponent(V)
                    .addComponent(W)
                    .addComponent(X)
                    .addComponent(Y)
                    .addComponent(Z))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseMoved
        A.setForeground(Color.GREEN);
    }//GEN-LAST:event_AMouseMoved

    private void AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseExited
        A.setForeground(Color.WHITE);
    }//GEN-LAST:event_AMouseExited

    private void BMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseMoved
        B.setForeground(Color.GREEN);
    }//GEN-LAST:event_BMouseMoved

    private void BMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseExited
        B.setForeground(Color.WHITE);
    }//GEN-LAST:event_BMouseExited

    private void CMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseMoved
        C.setForeground(Color.GREEN);
    }//GEN-LAST:event_CMouseMoved

    private void CMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseExited
        C.setForeground(Color.WHITE);
    }//GEN-LAST:event_CMouseExited

    private void DMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseMoved
        D.setForeground(Color.GREEN);
    }//GEN-LAST:event_DMouseMoved

    private void DMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseExited
        D.setForeground(Color.WHITE);
    }//GEN-LAST:event_DMouseExited

    private void EMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseMoved
        E.setForeground(Color.GREEN);
    }//GEN-LAST:event_EMouseMoved

    private void EMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseExited
        E.setForeground(Color.WHITE);
    }//GEN-LAST:event_EMouseExited

    private void FMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseMoved
        F.setForeground(Color.GREEN);
    }//GEN-LAST:event_FMouseMoved

    private void FMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseExited
         F.setForeground(Color.WHITE);
    }//GEN-LAST:event_FMouseExited

    private void GMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseMoved
         G.setForeground(Color.GREEN);
    }//GEN-LAST:event_GMouseMoved

    private void GMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseExited
        G.setForeground(Color.WHITE);
    }//GEN-LAST:event_GMouseExited

    private void HMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseMoved
        H.setForeground(Color.GREEN);
    }//GEN-LAST:event_HMouseMoved

    private void HMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseExited
        H.setForeground(Color.WHITE);
    }//GEN-LAST:event_HMouseExited

    private void IMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseMoved
        I.setForeground(Color.GREEN);
    }//GEN-LAST:event_IMouseMoved

    private void IMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseExited
        I.setForeground(Color.WHITE);
    }//GEN-LAST:event_IMouseExited

    private void JMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseMoved
        J.setForeground(Color.GREEN);
    }//GEN-LAST:event_JMouseMoved

    private void JMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseExited
        J.setForeground(Color.WHITE);
    }//GEN-LAST:event_JMouseExited

    private void KMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseMoved
        K.setForeground(Color.GREEN);
    }//GEN-LAST:event_KMouseMoved

    private void KMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseExited
        K.setForeground(Color.WHITE);
    }//GEN-LAST:event_KMouseExited

    private void LMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseMoved
        L.setForeground(Color.GREEN);
    }//GEN-LAST:event_LMouseMoved

    private void LMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseExited
        L.setForeground(Color.WHITE);
    }//GEN-LAST:event_LMouseExited

    private void MMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseMoved
        M.setForeground(Color.GREEN);
    }//GEN-LAST:event_MMouseMoved

    private void MMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseExited
        M.setForeground(Color.WHITE);
    }//GEN-LAST:event_MMouseExited

    private void NMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseMoved
        N.setForeground(Color.GREEN);
    }//GEN-LAST:event_NMouseMoved

    private void NMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseExited
        N.setForeground(Color.WHITE);
    }//GEN-LAST:event_NMouseExited

    private void OMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseMoved
        O.setForeground(Color.GREEN);
    }//GEN-LAST:event_OMouseMoved

    private void OMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseExited
        O.setForeground(Color.WHITE);
    }//GEN-LAST:event_OMouseExited

    private void PMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseMoved
        P.setForeground(Color.GREEN);
    }//GEN-LAST:event_PMouseMoved

    private void PMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseExited
        P.setForeground(Color.WHITE);
    }//GEN-LAST:event_PMouseExited

    private void QMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseMoved
        Q.setForeground(Color.GREEN);
    }//GEN-LAST:event_QMouseMoved

    private void QMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseExited
        Q.setForeground(Color.WHITE);
    }//GEN-LAST:event_QMouseExited

    private void RMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseMoved
        R.setForeground(Color.GREEN);
    }//GEN-LAST:event_RMouseMoved

    private void RMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseExited
        R.setForeground(Color.WHITE);
    }//GEN-LAST:event_RMouseExited

    private void SMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseMoved
        S.setForeground(Color.GREEN);
    }//GEN-LAST:event_SMouseMoved

    private void SMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseExited
        S.setForeground(Color.WHITE);
    }//GEN-LAST:event_SMouseExited

    private void TMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseMoved
        T.setForeground(Color.GREEN);
    }//GEN-LAST:event_TMouseMoved

    private void TMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseExited
        T.setForeground(Color.WHITE);
    }//GEN-LAST:event_TMouseExited

    private void UMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseMoved
        U.setForeground(Color.GREEN);
    }//GEN-LAST:event_UMouseMoved

    private void UMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseExited
        U.setForeground(Color.WHITE);
    }//GEN-LAST:event_UMouseExited

    private void VMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseMoved
        V.setForeground(Color.GREEN);
    }//GEN-LAST:event_VMouseMoved

    private void VMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseExited
        V.setForeground(Color.WHITE);
    }//GEN-LAST:event_VMouseExited

    private void WMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseMoved
        W.setForeground(Color.GREEN);
    }//GEN-LAST:event_WMouseMoved

    private void WMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseExited
        W.setForeground(Color.WHITE);
    }//GEN-LAST:event_WMouseExited

    private void XMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseMoved
        X.setForeground(Color.GREEN);
    }//GEN-LAST:event_XMouseMoved

    private void XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseExited
        X.setForeground(Color.WHITE);
    }//GEN-LAST:event_XMouseExited

    private void YMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseMoved
        Y.setForeground(Color.GREEN);
    }//GEN-LAST:event_YMouseMoved

    private void YMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseExited
        Y.setForeground(Color.WHITE);
    }//GEN-LAST:event_YMouseExited

    private void ZMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseMoved
        Z.setForeground(Color.GREEN);
    }//GEN-LAST:event_ZMouseMoved

    private void ZMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseExited
        Z.setForeground(Color.WHITE);
    }//GEN-LAST:event_ZMouseExited

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        check('A');
    }//GEN-LAST:event_AMouseClicked

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
        check('B');
    }//GEN-LAST:event_BMouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
       check('C');
    }//GEN-LAST:event_CMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
        check('D');
    }//GEN-LAST:event_DMouseClicked

    private void EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseClicked
        check('E');
    }//GEN-LAST:event_EMouseClicked

    private void FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseClicked
        check('F');
    }//GEN-LAST:event_FMouseClicked

    private void GMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseClicked
        check('G');
    }//GEN-LAST:event_GMouseClicked

    private void HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseClicked
        check('H');
    }//GEN-LAST:event_HMouseClicked

    private void IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseClicked
        check('I');
    }//GEN-LAST:event_IMouseClicked

    private void JMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseClicked
        check('J');
    }//GEN-LAST:event_JMouseClicked

    private void KMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseClicked
        check('K');
    }//GEN-LAST:event_KMouseClicked

    private void LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseClicked
        check('L');
    }//GEN-LAST:event_LMouseClicked

    private void MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseClicked
        check('M');
    }//GEN-LAST:event_MMouseClicked

    private void NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseClicked
        check('N');
    }//GEN-LAST:event_NMouseClicked

    private void OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseClicked
        check('O');
    }//GEN-LAST:event_OMouseClicked

    private void PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseClicked
        check('P');
    }//GEN-LAST:event_PMouseClicked

    private void QMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseClicked
        check('Q');
    }//GEN-LAST:event_QMouseClicked

    private void RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseClicked
        check('R');
    }//GEN-LAST:event_RMouseClicked

    private void SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseClicked
        check('S');
    }//GEN-LAST:event_SMouseClicked

    private void TMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseClicked
        check('T');
    }//GEN-LAST:event_TMouseClicked

    private void UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseClicked
        check('U');
    }//GEN-LAST:event_UMouseClicked

    private void VMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseEntered

    }//GEN-LAST:event_VMouseEntered

    private void VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseClicked
        check('V');
    }//GEN-LAST:event_VMouseClicked

    private void WMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseClicked
        check('W');
    }//GEN-LAST:event_WMouseClicked

    private void XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_XMouseEntered

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        check('X');
    }//GEN-LAST:event_XMouseClicked

    private void YMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseClicked
        check('Y');
    }//GEN-LAST:event_YMouseClicked

    private void ZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseClicked
        check('Z');
    }//GEN-LAST:event_ZMouseClicked

    private void StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseClicked
        wrong = 0;
        for(int i = 0 ; i < 5 ; i++){
            label(i).setForeground(Color.WHITE);
        }
            Random ran = new Random();
                int y = ran.nextInt(10)+1;  
            num = y;
        que.setText(question[num-1]);
        for (int i = 0 ; i<9 ; i++){
            if (i < word[num-1].length()){
            text(i).setBackground(Color.GREEN);
            text(i).setText(null);
            }else{
                text(i).setBackground(Color.BLACK);
                text(i).setText(null);
            }
        }
    }//GEN-LAST:event_StartMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
             
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel G;
    private javax.swing.JLabel H;
    private javax.swing.JLabel I;
    private javax.swing.JLabel J;
    private javax.swing.JLabel K;
    private javax.swing.JLabel L;
    private javax.swing.JLabel M;
    private javax.swing.JLabel N;
    private javax.swing.JLabel O;
    private javax.swing.JLabel P;
    private javax.swing.JLabel Q;
    private javax.swing.JLabel R;
    private javax.swing.JLabel S;
    private javax.swing.JLabel Start;
    private javax.swing.JLabel T;
    private javax.swing.JLabel U;
    private javax.swing.JLabel V;
    private javax.swing.JLabel W;
    private javax.swing.JLabel X;
    private javax.swing.JLabel Y;
    private javax.swing.JLabel Z;
    private javax.swing.JLabel f0;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField que;
    private javax.swing.JTextField t0;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    // End of variables declaration//GEN-END:variables
}
