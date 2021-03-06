import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by jacobmenke on 4/15/16.
 */
public class RomanCalculator extends JFrame implements ActionListener {

    private JLabel roman1Int;
    private JLabel roman2Int;
    private JLabel result;

    private JTextField roman1;
    private JTextField roman2;
    private JTextField romanResult;

    private JButton ones;
    private JButton fives;
    private JButton tens;
    private JButton fifties;
    private JButton hundred;
    private JButton fiveHundred;
    private JButton thousand;
    private JButton clear;
    private JButton subtract;
    private JButton addition;
    private JButton divide;
    private JButton modulus;
    private JButton multiply;
    private JButton equals;

    private JPanel inputPanel;
    private JPanel buttonPanel;

    String inputFirstTextField = "";
    String inputSecondTextField = "";

    char oper;
    boolean firstTextFieldSelected = true;
    boolean secondTextFieldSelected = false;
    Roman newRoman = new Roman();

    public RomanCalculator() {
        super("Roman Calculator"); //title of window
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);

        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(2, 1)); // 2 rows 1 column
        add(biggerPanel, BorderLayout.CENTER);

        /**
         * add text boxes and labels to top panel
         */
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2)); //3 rows 2 columns
        biggerPanel.add(inputPanel);

        roman1 = new JTextField("Roman1");
        inputPanel.add(roman1);
        roman1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                firstTextFieldSelected = true;
                secondTextFieldSelected = false;
            }

            @Override
            public void focusLost(FocusEvent e) {


            }
        });
        roman1Int = new JLabel("Integer 1");
        inputPanel.add(roman1Int);

        roman2 = new JTextField("Roman2");
        roman2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                firstTextFieldSelected = false;
                secondTextFieldSelected = true;
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        inputPanel.add(roman2);
        roman2Int = new JLabel("Integer 2");
        inputPanel.add(roman2Int);

        romanResult = new JTextField("Result");
        inputPanel.add(romanResult);
        romanResult.setEditable(false);

        result = new JLabel("Integer 3");
        inputPanel.add(result);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4)); // 4 row 4 columns
        biggerPanel.add(buttonPanel);

        /**
         * add buttons to bottom panel
         */


        ones = new JButton("I");
        ones.addActionListener(this);
        buttonPanel.add(ones);
        fives = new JButton("V");
        fives.addActionListener(this);
        buttonPanel.add(fives);
        tens = new JButton("X");
        tens.addActionListener(this);
        buttonPanel.add(tens);
        fifties = new JButton("L");
        fifties.addActionListener(this);
        buttonPanel.add(fifties);
        hundred = new JButton("C");
        hundred.addActionListener(this);
        buttonPanel.add(hundred);
        fiveHundred = new JButton("X");
        fiveHundred.addActionListener(this);
        buttonPanel.add(fiveHundred);
        thousand = new JButton("M");
        thousand.addActionListener(this);
        buttonPanel.add(thousand);
        clear = new JButton("CE");
        clear.addActionListener(this);
        buttonPanel.add(clear);
        subtract = new JButton("-");
        subtract.addActionListener(this);
        buttonPanel.add(subtract);
        addition = new JButton("+");
        addition.addActionListener(this);
        buttonPanel.add(addition);
        divide = new JButton("/");
        divide.addActionListener(this);
        buttonPanel.add(divide);
        modulus = new JButton("%");
        modulus.addActionListener(this);
        buttonPanel.add(modulus);
        multiply = new JButton("*");
        multiply.addActionListener(this);
        buttonPanel.add(multiply);
        equals = new JButton("=");
        equals.addActionListener(this);
        buttonPanel.add(equals);


    }


    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        if (firstTextFieldSelected) {
            if (buttonString.equals("I")) {
                inputFirstTextField += "I";
                newRoman.displayRoman(roman1,inputFirstTextField);
            }
            if (buttonString.equals("V")) {
                inputFirstTextField += "V";
                newRoman.displayRoman(roman1,inputFirstTextField);
            }
            if (buttonString.equals("X")) {
                inputFirstTextField += "X";
                newRoman.displayRoman(roman1,inputFirstTextField);
            }
            if (buttonString.equals("L")) {
                inputFirstTextField += "L";
                newRoman.displayRoman(roman1,inputFirstTextField);
            }
            if (buttonString.equals("C")) {
                inputFirstTextField += "C";
                newRoman.displayRoman(roman1,inputFirstTextField);
            }
            if (buttonString.equals("D")) {
                inputFirstTextField += "D";
                newRoman.displayRoman(roman1,inputFirstTextField);
            }
            if (buttonString.equals("M")) {
                inputFirstTextField += "M";
                newRoman.displayRoman(roman1,inputFirstTextField);
            }
        } else if (secondTextFieldSelected) {
            if (buttonString.equals("I")) {
                inputSecondTextField += "I";
                newRoman.displayRoman(roman2,inputSecondTextField);
            }
            if (buttonString.equals("V")) {
                inputSecondTextField += "V";
                newRoman.displayRoman(roman2,inputSecondTextField);
            }
            if (buttonString.equals("X")) {
                inputSecondTextField += "X";
                newRoman.displayRoman(roman2,inputSecondTextField);
            }
            if (buttonString.equals("L")) {
                inputSecondTextField += "L";
                newRoman.displayRoman(roman2,inputSecondTextField);
            }
            if (buttonString.equals("C")) {
                inputSecondTextField += "C";
                newRoman.displayRoman(roman2,inputSecondTextField);
            }
            if (buttonString.equals("D")) {
                inputSecondTextField += "D";
                newRoman.displayRoman(roman2,inputSecondTextField);
            }
            if (buttonString.equals("M")) {
                inputSecondTextField += "M";
                newRoman.displayRoman(roman2,inputSecondTextField);
            }

        }

        if (buttonString.equals("-")) {
            oper = '-';
        }

        if (buttonString.equals("+")) {
            oper = '+';
        }
        if (buttonString.equals("/")) {
            oper = '/';
        }

        if (buttonString.equals("%")) {
            oper = '%';
        }

        if (buttonString.equals("*")) {
            oper = '*';
        }

        if (buttonString.equals("CE")) {
            inputFirstTextField = "";
            roman1.setText("");
            roman2.setText("");
            result.setText("");
            roman1Int.setText("");
            roman2Int.setText("");
            romanResult.setText("");
            inputFirstTextField = "";
            inputSecondTextField = "";
        }

        if (buttonString.equals("=")) {
            inputFirstTextField = roman1.getText();
            inputSecondTextField = roman2.getText();

            int firstInt = newRoman.getRoman(inputFirstTextField);
            int secondInt = newRoman.getRoman(inputSecondTextField);
            int calculatedInt;

            roman1Int.setText("" + firstInt);
            roman2Int.setText("" + secondInt);
            calculatedInt = newRoman.calc_Romans(firstInt, secondInt, oper);

            if (calculatedInt < 0){
                JOptionPane.showMessageDialog(null,"Negative results not allowed");

            }

            else {
                result.setText("" + calculatedInt);

                newRoman.displayRoman(romanResult, newRoman.setRoman(calculatedInt));
            }
        }

    }

    public static void main(String[] args) {

        RomanCalculator gui = new RomanCalculator();
        Roman newRoman = new Roman();
        gui.setSize(400, 400);
        gui.setVisible(true);


    }


}
