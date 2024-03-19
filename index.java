import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;


//       class Number # 01

class login extends JFrame implements ActionListener {
 

    JButton back,rules;
    JTextField tfname;

    public login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/quiz.jpg"));
        JLabel image =new JLabel(i1);
        image.setBounds(15, 10, 600, 400);
        add(image);

        JLabel heading = new JLabel("Hello..! This  is  Quiz  Platform");
        heading.setBounds(650, 60,340,50);
         heading.setFont(new Font("Mongolian Baiti", Font.BOLD , 25));
         heading.setForeground(Color.black);
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150,300 ,20);
         name.setFont(new Font("c", Font.BOLD , 16));
         name.setForeground(Color.BLUE);
        add(name);

         tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

         rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.blue);
        rules.setForeground(Color.ORANGE);
        rules.addActionListener(this);
        add(rules);

         back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.blue);
        back.setForeground(Color.ORANGE);
        back.addActionListener(this);
        add(back);
      
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ev){
       if(ev.getSource()== rules){

       String name = tfname.getText();
    setVisible(false);

    //       class 02  object here:
       new Rules(name);
       }
       else if (ev.getSource()==back){
        setVisible(false);
       }
    }

    //       class Number # 02

    class Rules extends JFrame implements ActionListener{

        String name;
        JButton back,start;
   
        Rules(String name){
           
           getContentPane().setBackground(Color.WHITE);
           setLayout(null);
   
           JLabel heading = new JLabel(" Welcome " +name );
           heading.setBounds(50, 20,700,30);
            heading.setFont(new Font("Viner Hand ITC", Font.BOLD , 25));
            heading.setForeground(Color.BLUE);
           add(heading);

           JLabel rule = new JLabel( );
           rule.setBounds(20, 90,900,350);
            rule.setFont(new Font("Tahoma", Font.PLAIN , 18));
            
            rule.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
            );
           add(rule);

            back = new JButton("Back");
           back.setBounds(915, 500, 100, 30);
           back.setBackground(Color.GRAY);
           back.setForeground(Color.blue);
           back.addActionListener(this);
           add(back);

              start = new JButton("Start");
           start.setBounds(400, 500, 100, 30);
           start.setBackground(Color.blue);
           start.setForeground(Color.RED);
           start.addActionListener(this);
        add(start);

    
   
           setSize(800,650);
           setLocation(350,100);
           setVisible(true);
       }
       public void actionPerformed(ActionEvent ev){
        if(ev.getSource()==start){
            setVisible(false);
           new Quiz(name);
        } else{
            setVisible(false);
        }
       }
   }

   //       class Number # 03

   

 class Quiz  extends JFrame implements ActionListener{
    
    String questions[][] = new String[10][5];
    String answers[][]= new String[10][2];
    String userans[][] = new String[10][1]; 
 
    JLabel qno,qno1;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupOptions;
    JButton next,lifeline,Submit;
 
    public static int timer =15;
    public static int ans_given=0;
    public static int count=0;
    public static int score=0;
 
    String name;
 
     Quiz(String name){
         this.name=name;
 
         setBounds(50, 0, 1440, 550);
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
 
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/quiz3.jpg"));
         JLabel image =new JLabel(i1);
         image.setBounds(0, 0, 550, 300);
         add(image);
 
          qno = new JLabel();
         qno.setBounds(100, 390, 50, 30);
         qno.setFont(new Font("Mongolian Baiti", Font.BOLD , 24));
         add(qno);
 
          qno1 = new JLabel();
         qno1.setBounds(133, 390, 900, 30);
         qno1.setFont(new Font("Mongolian Baiti", Font.BOLD , 24));
         add(qno1);
 
         questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
         questions[0][1] = "JVM";
         questions[0][2] = "JDB";
         questions[0][3] = "JDK";
         questions[0][4] = "JRE";
 
         questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
         questions[1][1] = "int";
         questions[1][2] = "Object";
         questions[1][3] = "long";
         questions[1][4] = "void";
 
         questions[2][0] = "Which package contains the Random class?";
         questions[2][1] = "java.util package";
         questions[2][2] = "java.lang package";
         questions[2][3] = "java.awt package";
         questions[2][4] = "java.io package";
 
         questions[3][0] = "An interface with no fields or methods is known as?";
         questions[3][1] = "Runnable Interface";
         questions[3][2] = "Abstract Interface";
         questions[3][3] = "Marker Interface";
         questions[3][4] = "CharSequence Interface";
 
         questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
         questions[4][1] = "Stack";
         questions[4][2] = "String memory";
         questions[4][3] = "Random storage space";
         questions[4][4] = "Heap memory";
 
         questions[5][0] = "Which of the following is a marker interface?";
         questions[5][1] = "Runnable interface";
         questions[5][2] = "Remote interface";
         questions[5][3] = "Readable interface";
         questions[5][4] = "Result interface";
 
         questions[6][0] = "Which keyword is used for accessing the features of a package?";
         questions[6][1] = "import";
         questions[6][2] = "package";
         questions[6][3] = "extends";
         questions[6][4] = "export";
 
         questions[7][0] = "In java, jar stands for?";
         questions[7][1] = "Java Archive Runner";
         questions[7][2] = "Java Archive";
         questions[7][3] = "Java Application Resource";
         questions[7][4] = "Java Application Runner";
 
         questions[8][0] = "Which of the following is a mutable class in java?";
         questions[8][1] = "java.lang.StringBuilder";
         questions[8][2] = "java.lang.Short";
         questions[8][3] = "java.lang.Byte";
         questions[8][4] = "java.lang.String";
 
         questions[9][0] = "Which of the following option leads to the portability and security of Java?";
         questions[9][1] = "Bytecode is executed by JVM";
         questions[9][2] = "The applet makes the Java code secure and portable";
         questions[9][3] = "Use of exception handling";
         questions[9][4] = "Dynamic binding between objects";
 
         answers[0][1] = "JDB";
         answers[1][1] = "int";
         answers[2][1] = "java.util package";
         answers[3][1] = "Marker Interface";
         answers[4][1] = "Heap memory";
         answers[5][1] = "Remote interface";
         answers[6][1] = "import";
         answers[7][1] = "Java Archive";
         answers[8][1] = "java.lang.StringBuilder";
         answers[9][1] = "Bytecode is executed by JVM";
 
          opt1 = new JRadioButton();
         opt1.setBounds(150, 430  , 700, 30);
         opt1.setBackground(Color.WHITE);
         opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
         add(opt1);
 
          opt2 = new JRadioButton();
         opt2.setBounds(150, 460, 700, 30);
         opt2.setBackground(Color.WHITE);
         opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
         add(opt2);
 
          opt3 = new JRadioButton();
         opt3.setBounds(150, 490, 700, 30);
         opt3.setBackground(Color.WHITE);
         opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
         add(opt3);
 
          opt4 = new JRadioButton();
         opt4.setBounds(150, 520, 700, 30);
         opt4.setBackground(Color.WHITE);
         opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
         add(opt4);
 
          groupOptions = new ButtonGroup();
         groupOptions.add(opt1);
         groupOptions.add(opt2);
         groupOptions.add(opt3);
         groupOptions.add(opt4);
 
          next = new JButton("Next");
         next.setBounds(1110,450,200,40);
         next.setFont(new Font("Tahoma",Font.PLAIN, 22));
         next.setBackground(new Color(30,144,200));
         next.setForeground(Color.WHITE);
         next.addActionListener(this);
         add(next);
 
          lifeline = new JButton("50,50 Life line");
         lifeline.setBounds(1110,510,200,40);
         lifeline.setFont(new Font("Tahoma",Font.PLAIN, 22));
         lifeline.setBackground(new Color(30,144,200));
         next.setForeground(Color.WHITE);
         lifeline.addActionListener(this);
         add(lifeline);
 
          Submit = new JButton("Submit");
         Submit.setBounds(1110,570,200,40);
         Submit.setFont(new Font("Tahoma",Font.PLAIN, 22));
         Submit.setBackground(new Color(30,144,200));
         Submit.setForeground(Color.WHITE);
         Submit.setEnabled(false);
         Submit.addActionListener(this);
         add(Submit);
 
         Start(count);
 
         setVisible(true);
 
     }
 
     @Override
     public void actionPerformed(ActionEvent e) {
      
      // first button logics -- next:
         if(e.getSource()==next){
         repaint();
         opt1.setEnabled(true);
         opt2.setEnabled(true);
         opt3.setEnabled(true);
         opt4.setEnabled(true);
 
        ans_given =1;
 
        if(groupOptions.getSelection()==null){
         userans[count][0]="";
        } else{
            userans[count][0]=groupOptions.getSelection().getActionCommand();
        }
        if(count==8){
         next.setEnabled(false);
         Submit.setEnabled(true);
        }
          count++;
          Start(count); 
 
 
          // Second button logics -- lifeline :
       } else if(e.getSource()==lifeline){
 
            if(count==2|| count==4 || count==6 || count==8 || count ==9){
             opt2.setEnabled(false);
             opt3.setEnabled(true);
            }
            else{
             opt1.setEnabled(false);
             opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
 
            // Third Button logics-- Submit:
       }else if (e.getSource()==Submit){
         ans_given=1;
 
         if(groupOptions.getSelection()==null){
             userans[count][0]="";
            } else{
                userans[count][0]=groupOptions.getSelection().getActionCommand();
            }
 
            for(int i=0;i<userans.length; i++){
             if(userans[i][0].equals(answers[i][1])){
                 score +=10;
             }
         
            else{
             score +=0;
            }
     }
     setVisible(false);
    
     new Score(name, score);
 
       }
     }
 
     public void paint(Graphics g){
         super.paint(g);
 
         String time = "Time left" +"- " + timer  + " seconds";
         g.setColor(Color.RED);
         g.setFont(new Font("Tohoma", Font.BOLD,22));
 
        if (timer>0){
         g.drawString(time,1100,350);
        }
        else{
         g.drawString("Times up!", 1100, 350);
        }
        timer--;
 
        try{
         Thread.sleep(1000);
         repaint();
        }catch(Exception e){
         e.printStackTrace();
        }
 
      if(ans_given==1){
         ans_given=0;
         timer=15;
      }else if (timer<0) {
         timer =15;
 
         opt1.setEnabled(true);
         opt2.setEnabled(true);
         opt3.setEnabled(true);
         opt4.setEnabled(true);
 
         if(count==8){
             next.setEnabled(false);
             Submit.setEnabled(true);
         }
 
             if(count==9){ //submit button
 
                 if(groupOptions.getSelection()==null){
                     userans[count][0]="";
                    } else{
                        userans[count][0]=groupOptions.getSelection().getActionCommand();
                    }
 
                    for(int i=0;i<userans.length; i++){
                     if(userans[i][0].equals(answers[i][1])){
                         score +=10;
                     }
                 
                    else{
                     score +=0;
                    }
             }
             setVisible(false);

             new Score(name, score);
             // Score object:
             }
         
 
 else{        // next button
         if(groupOptions.getSelection()==null){
          userans[count][0]="";
         } else{
             userans[count][0]=groupOptions.getSelection().getActionCommand();
         }
         count++;
         Start(count);
      }
     }
 
     }
 
     public void Start(int count){
         qno.setText(""+(count+1) +". ");
         qno1.setText(questions[count][0]);
 
         opt1.setText(questions[count][1]);
         opt1.setActionCommand(questions[count][1]);
 
         opt2.setText(questions[count][2]);
         opt2.setActionCommand(questions[count][2]);
 
         opt3.setText(questions[count][3]);
         opt3.setActionCommand(questions[count][3]);
 
         opt4.setText(questions[count][4]);
         opt4.setActionCommand(questions[count][4]);
 
         groupOptions.clearSelection();
     }
    } 


    // Class.... # 04

    class Score extends JFrame implements ActionListener{

      public   Score(String name , int score){
              
            setBounds(600, 150, 750, 550);
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
 
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.jpg"));
         Image i2 =i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         
         JLabel image =new JLabel(i3);
         image.setBounds(0, 200, 300, 250);
         add(image);
 
         JLabel heading = new JLabel("Thankyew " +name );
         heading.setBounds(45, 30, 700, 30);
         heading.setFont(new Font("Mongolian Baiti", Font.BOLD , 26));
         add(heading);

         JLabel lscore = new JLabel("Your score is " +score );
         lscore.setBounds(350, 200, 300, 30);
         lscore.setFont(new Font("Tohoma ", Font.BOLD , 26));
         add(lscore);

         JButton Submit = new JButton("Play Again");
         Submit.setBounds(380,270,120,40);
         //Submit.setFont(new Font("Tahoma",Font.PLAIN, 22));
         Submit.setBackground(new Color(30,144,200));
         Submit.setForeground(Color.WHITE);
    
         Submit.addActionListener(this);
         add(Submit);

         setVisible(true);

        }
        public void actionPerformed(ActionEvent e){

            setVisible(false);
            new login();

        }
    } 
}

    
   public class Project_01{
    public static void main(String [] args){
        new login();
       // new Rules();
       //new Quiz();
      // new Score();

    }
    
}
