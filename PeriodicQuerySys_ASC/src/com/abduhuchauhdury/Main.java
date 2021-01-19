package com.abduhuchauhdury;

import java.util.Arrays;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {
        
        public static boolean isNumeric(final String str) {
                
                if (str == null || str.length() == 0) {
                        return false;
                        
                }
                
                return str.chars().allMatch(Character::isDigit);
                
        }
        
        public static boolean isStr(String name) {
                
                return name.matches("[a-zA-Z]+");
                
        }
        
        @SuppressWarnings("ConstantConditions")
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
                String entry;
                int atomicNumber = 0;
                String symbol;
                int errors = 0;
                String [] periodicArray = new String[] {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co","Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"};
                char block = ' ';

                System.out.println("\nPeriodic Table Query System vBETAr3 | By Abduhu S. Chauhdury\n***********************************************************");
                System.out.println("sys# Enter /help for more information. Enter /exit to terminate the session.\n\n");
                
                System.out.println("*                                                                   *");
                System.out.println("*   *                                           *   *   *   *   *   *");
                System.out.println("*   *                                           *   *   *   *   *   *");
                System.out.println("*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                System.out.println("*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                System.out.println("*   *       *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                System.out.println("*   *       *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                System.out.println("\n            *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                System.out.println("            *   *   *   *   *   *   *   *   *   *   *   *   *   *   *\n\n");
                
                while(true) {
                        int period = 0;
                        int group = 0;
                        int electrons1 = 0;
                        int electrons2 = 0;
                        int electrons3 = 0;
                        int electrons4 = 0;
                        int electrons5 = 0;
                        int electrons6 = 0;
                        int electrons7 = 0;
                        int shells;
                        int valence = 0;
                        int charge = 0;
                        int ionicValence;
        
                        System.out.print("sci$ Enter an atomic number, symbol, or command: ");
                        entry = scan.nextLine();
                        System.out.println();
        
                        if (isNumeric(entry)) {
                                if (Integer.parseInt(entry) <= 118 && Integer.parseInt(entry) >= 1)
                                        atomicNumber = Integer.parseInt(entry);
                                else {
                                        System.out.println("sys# " + entry + " is NOT a valid atomic number, symbol or command.\n");
                                        errors++;
                                }
                        }
                        
                        else if (entry.equals("/help")) {
                                System.out.println("sys# Welcome to the Periodic Table Query System.");
                                System.out.println("sys# Enter the atomic number or symbol below to initiate an inquiry.");
                                System.out.println("sys# The system shall yield a result including the number, symbol, mass, name,\nlocation (period and group), energy levels, shells, and block.");
                                System.out.println("sys# Available commands are: \n/help\n/sysdump\n/errst\n/exit\n/list-all\n/table-art\n/compound-beta\n");
                        }
                        
                        else if (entry.equals("/sysdump")) {
                                LocalDateTime now = LocalDateTime.now();
                                System.out.println("sys# Periodic Table Query System vBETAr3 | Developed By Abduhu S. Chauhdury");
                                System.out.println("sys# Table Data List Revision v4 | Compiled By Abduhu S. Chauhdury");
                                System.out.println("sys# Current Time: " + dtf.format(now));
                                System.out.println("sys# Total Input Errors (Reset by /exit or /errst): " + errors + "\n");
                        }

                        else if (entry.equals("/table-art")) {
                                System.out.println("*                                                                   *");
                                System.out.println("*   *                                           *   *   *   *   *   *");
                                System.out.println("*   *                                           *   *   *   *   *   *");
                                System.out.println("*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                                System.out.println("*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                                System.out.println("*   *       *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                                System.out.println("*   *       *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                                System.out.println("\n            *   *   *   *   *   *   *   *   *   *   *   *   *   *   *");
                                System.out.println("            *   *   *   *   *   *   *   *   *   *   *   *   *   *   *\n");
                        }

                        else if (entry.equals("/errst")) {
                                errors = 0;
                                System.out.println("sys# Error Counter Cleared\n");
                        }
                        
                        else if (entry.equals("/exit")) {
                                System.out.println("Exiting!");
                                System.exit(errors);
                        }
                        
                        else if (entry.equals("/list-all")) {
                                for (int x = 1; x <= 118; x++) {
                                        switch (x) {
                                                case 1 -> System.out.println("#1 | H | Hydrogen | 1.008" + "\n");
                                                case 2 -> System.out.println("#2 | He | Helium | 4.003" + "\n");
                                                case 3 -> System.out.println("#3 | Li | Lithium | 6.940" + "\n");
                                                case 4 -> System.out.println("#4 | Be | Beryllium | 9.012" + "\n");
                                                case 5 -> System.out.println("#5 | B | Boron | 10.810" + "\n");
                                                case 6 -> System.out.println("#6 | C | Carbon | 12.011" + "\n");
                                                case 7 -> System.out.println("#7 | N | Nitrogen | 14.007" + "\n");
                                                case 8 -> System.out.println("#8 | O | Oxygen | 15.999" + "\n");
                                                case 9 -> System.out.println("#9 | F | Fluorine | 18.998" + "\n");
                                                case 10 -> System.out.println("#10 | Ne | Neon | 20.180" + "\n");
                                                case 11 -> System.out.println("#11 | Na | Sodium | 22.990" + "\n");
                                                case 12 -> System.out.println("#12 | Mg | Magnesium | 24.305" + "\n");
                                                case 13 -> System.out.println("#13 | Al | Aluminium | 26.982" + "\n");
                                                case 14 -> System.out.println("#14 | Si | Silicon | 28.085" + "\n");
                                                case 15 -> System.out.println("#15 | P | Phosphorus | 30.974" + "\n");
                                                case 16 -> System.out.println("#16 | S | Sulfur | 32.06" + "\n");
                                                case 17 -> System.out.println("#17 | Cl | Chlorine | 35.45" + "\n");
                                                case 18 -> System.out.println("#18 | Ar | Argon | 39.948" + "\n");
                                                case 19 -> System.out.println("#19 | K | Potassium | 39.098" + "\n");
                                                case 20 -> System.out.println("#20 | Ca | Calcium | 40.078" + "\n");
                                                case 21 -> System.out.println("#21 | Sc | Scandium | 44.956" + "\n");
                                                case 22 -> System.out.println("#22 | Ti | Titanium | 47.867" + "\n");
                                                case 23 -> System.out.println("#23 | V | Vanadium | 50.942" + "\n");
                                                case 24 -> System.out.println("#24 | Cr | Chromium | 51.996" + "\n");
                                                case 25 -> System.out.println("#25 | Mn | Manganese | 54.938" + "\n");
                                                case 26 -> System.out.println("#26 | Fe | Iron | 55.845" + "\n");
                                                case 27 -> System.out.println("#27 | Co | Cobalt | 58.933" + "\n");
                                                case 28 -> System.out.println("#28 | Ni | Nickel | 58.693" + "\n");
                                                case 29 -> System.out.println("#29 | Cu | Copper | 63.546" + "\n");
                                                case 30 -> System.out.println("#30 | Zn | Zinc | 65.38" + "\n");
                                                case 31 -> System.out.println("#31 | Ga | Gallium | 69.723" + "\n");
                                                case 32 -> System.out.println("#32 | Ge | Germanium | 72.63" + "\n");
                                                case 33 -> System.out.println("#33 | As | Arsenic | 74.922" + "\n");
                                                case 34 -> System.out.println("#34 | Se | Selenium | 78.971" + "\n");
                                                case 35 -> System.out.println("#35 | Br | Bromine | 79.904" + "\n");
                                                case 36 -> System.out.println("#36 | Kr | Krypton | 83.798" + "\n");
                                                case 37 -> System.out.println("#37 | Rb | Rubidium | 85.468" + "\n");
                                                case 38 -> System.out.println("#38 | Sr | Strontium | 87.62" + "\n");
                                                case 39 -> System.out.println("#39 | Y | Yttrium | 88.906" + "\n");
                                                case 40 -> System.out.println("#40 | Zr | Zirconium | 91.224" + "\n");
                                                case 41 -> System.out.println("#41 | Nb | Niobium | 92.906" + "\n");
                                                case 42 -> System.out.println("#42 | Mo | Molybdenum | 95.95" + "\n");
                                                case 43 -> System.out.println("#43 | Tc | Technetium | 98" + "\n");
                                                case 44 -> System.out.println("#44 | Ru | Ruthenium | 101.07" + "\n");
                                                case 45 -> System.out.println("#45 | Rh | Rhodium | 102.91" + "\n");
                                                case 46 -> System.out.println("#46 | Pd | Palladium | 106.42" + "\n");
                                                case 47 -> System.out.println("#47 | Ag | Silver | 107.87" + "\n");
                                                case 48 -> System.out.println("#48 | Cd | Cadmium | 112.41" + "\n");
                                                case 49 -> System.out.println("#49 | In | Indium | 114.82" + "\n");
                                                case 50 -> System.out.println("#50 | Sn | Tin | 118.71" + "\n");
                                                case 51 -> System.out.println("#51 | Sb | Antimony | 121.76" + "\n");
                                                case 52 -> System.out.println("#52 | Te | Tellurium | 127.6" + "\n");
                                                case 53 -> System.out.println("#53 | I | Iodine | 126.9" + "\n");
                                                case 54 -> System.out.println("#54 | Xe | Xenon | 131.29" + "\n");
                                                case 55 -> System.out.println("#55 | Cs | Caesium | 132.91" + "\n");
                                                case 56 -> System.out.println("#56 | Ba | Barium | 137.33" + "\n");
                                                case 57 -> System.out.println("#57 | La | Lanthanum | 138.91" + "\n");
                                                case 58 -> System.out.println("#58 | Ce | Cerium | 140.12" + "\n");
                                                case 59 -> System.out.println("#59 | Pr | Praseodymium | 140.91" + "\n");
                                                case 60 -> System.out.println("#60 | Nd | Neodymium | 144.24" + "\n");
                                                case 61 -> System.out.println("#61 | Pm | Promethium | 145" + "\n");
                                                case 62 -> System.out.println("#62 | Sm | Samarium | 150.36" + "\n");
                                                case 63 -> System.out.println("#63 | Eu | Europium | 151.96" + "\n");
                                                case 64 -> System.out.println("#64 | Gd | Gadolinium | 157.25" + "\n");
                                                case 65 -> System.out.println("#65 | Tb | Terbium | 158.93" + "\n");
                                                case 66 -> System.out.println("#66 | Dy | Dysprosium | 162.5" + "\n");
                                                case 67 -> System.out.println("#67 | Ho | Holmium | 164.93" + "\n");
                                                case 68 -> System.out.println("#68 | Er | Erbium | 167.26" + "\n");
                                                case 69 -> System.out.println("#69 | Tm | Thulium | 168.93" + "\n");
                                                case 70 -> System.out.println("#70 | Yb | Ytterbium | 173.05" + "\n");
                                                case 71 -> System.out.println("#71 | Lu | Lutetium | 174.97" + "\n");
                                                case 72 -> System.out.println("#72 | Hf | Hafnium | 178.49" + "\n");
                                                case 73 -> System.out.println("#73 | Ta | Tantalum | 180.95" + "\n");
                                                case 74 -> System.out.println("#74 | W | Tungsten/Wolfram | 183.84" + "\n");
                                                case 75 -> System.out.println("#75 | Re | Rhenium | 186.21" + "\n");
                                                case 76 -> System.out.println("#76 | Os | Osmium | 190.23" + "\n");
                                                case 77 -> System.out.println("#77 | Ir | Iridium | 192.22" + "\n");
                                                case 78 -> System.out.println("#78 | Pt | Platinum | 195.08" + "\n");
                                                case 79 -> System.out.println("#79 | Au | Gold | 196.97" + "\n");
                                                case 80 -> System.out.println("#80 | Hg | Mercury | 200.59" + "\n");
                                                case 81 -> System.out.println("#81 | Tl | Thallium | 204.38" + "\n");
                                                case 82 -> System.out.println("#82 | Pb | Lead | 207.2" + "\n");
                                                case 83 -> System.out.println("#83 | Bi | Bismuth | 208.98" + "\n");
                                                case 84 -> System.out.println("#84 | Po | Polonium | 209" + "\n");
                                                case 85 -> System.out.println("#85 | At | Astatine | 210" + "\n");
                                                case 86 -> System.out.println("#86 | Rn | Radon | 222" + "\n");
                                                case 87 -> System.out.println("#87 | Fr | Francium | 223" + "\n");
                                                case 88 -> System.out.println("#88 | Ra | Radium | 226" + "\n");
                                                case 89 -> System.out.println("#89 | Ac | Actinium | 227" + "\n");
                                                case 90 -> System.out.println("#90 | Th | Thorium | 232.04" + "\n");
                                                case 91 -> System.out.println("#91 | Pa | Protactinium | 231.04" + "\n");
                                                case 92 -> System.out.println("#92 | U | Uranium | 238.03" + "\n");
                                                case 93 -> System.out.println("#93 | Np | Neptunium | 237" + "\n");
                                                case 94 -> System.out.println("#94 | Pu | Plutonium | 244" + "\n");
                                                case 95 -> System.out.println("#95 | Am | Americium | 243" + "\n");
                                                case 96 -> System.out.println("#96 | Cm | Curium | 247" + "\n");
                                                case 97 -> System.out.println("#97 | Bk | Berkelium | 247" + "\n");
                                                case 98 -> System.out.println("#98 | Cf | Californium | 251" + "\n");
                                                case 99 -> System.out.println("#99 | Es | Einsteinium | 252" + "\n");
                                                case 100 -> System.out.println("#100 | Fm | Fermium | 257" + "\n");
                                                case 101 -> System.out.println("#101 | Md | Mendelevium | 258" + "\n");
                                                case 102 -> System.out.println("#102 | No | Nobelium | 259" + "\n");
                                                case 103 -> System.out.println("#103 | Lr | Lawrencium | 266" + "\n");
                                                case 104 -> System.out.println("#104 | Rf | Rutherfordium | 267" + "\n");
                                                case 105 -> System.out.println("#105 | Db | Dubnium | 268" + "\n");
                                                case 106 -> System.out.println("#106 | Sg | Seaborgium | 269" + "\n");
                                                case 107 -> System.out.println("#107 | Bh | Bohrium | 270" + "\n");
                                                case 108 -> System.out.println("#108 | Hs | Hassium | 277" + "\n");
                                                case 109 -> System.out.println("#109 | Mt | Meitnerium | 278" + "\n");
                                                case 110 -> System.out.println("#110 | Ds | Darmstadtium | 281" + "\n");
                                                case 111 -> System.out.println("#111 | Rg | Roentgenium | 282" + "\n");
                                                case 112 -> System.out.println("#112 | Cn | Copernicium | 285" + "\n");
                                                case 113 -> System.out.println("#113 | Nh | Nihonium | 286" + "\n");
                                                case 114 -> System.out.println("#114 | Fl | Flerovium | 289" + "\n");
                                                case 115 -> System.out.println("#115 | Mc | Moscovium | 290" + "\n");
                                                case 116 -> System.out.println("#116 | Lv | Livermorium | 293" + "\n");
                                                case 117 -> System.out.println("#117 | Ts | Tennessine | 294" + "\n");
                                                case 118 -> System.out.println("#118 | Og | Oganesson | 294" + "\n");
                                        }
                                }
                        }
                        
                        else {
                                if (isStr(entry) && entry.length() <= 2) {
                                        symbol = entry;
                                        if (Arrays.asList(periodicArray).contains(symbol)) {
                                                for (int i = 0; i < periodicArray.length; i++) {
                                                        if (periodicArray[i].equals(symbol))
                                                                atomicNumber = i + 1;
                                                }
                                        }
                                        else {
                                                System.out.println("sys# " + entry + " is NOT a valid atomic number, symbol or command.\n");
                                                errors++;
                                        }
                                }
                                else {
                                        System.out.println("sys# " + entry + " is NOT a valid atomic number, symbol or command.\n");
                                        errors++;
                                }
                        }
        
                        if(atomicNumber <= 118 && atomicNumber >= 1) {
        
                                switch (atomicNumber) {
                                        case 1 -> System.out.println("#1 | H | Hydrogen | 1.008" + "\n");
                                        case 2 -> System.out.println("#2 | He | Helium | 4.003" + "\n");
                                        case 3 -> System.out.println("#3 | Li | Lithium | 6.940" + "\n");
                                        case 4 -> System.out.println("#4 | Be | Beryllium | 9.012" + "\n");
                                        case 5 -> System.out.println("#5 | B | Boron | 10.810" + "\n");
                                        case 6 -> System.out.println("#6 | C | Carbon | 12.011" + "\n");
                                        case 7 -> System.out.println("#7 | N | Nitrogen | 14.007" + "\n");
                                        case 8 -> System.out.println("#8 | O | Oxygen | 15.999" + "\n");
                                        case 9 -> System.out.println("#9 | F | Fluorine | 18.998" + "\n");
                                        case 10 -> System.out.println("#10 | Ne | Neon | 20.180" + "\n");
                                        case 11 -> System.out.println("#11 | Na | Sodium | 22.990" + "\n");
                                        case 12 -> System.out.println("#12 | Mg | Magnesium | 24.305" + "\n");
                                        case 13 -> System.out.println("#13 | Al | Aluminium | 26.982" + "\n");
                                        case 14 -> System.out.println("#14 | Si | Silicon | 28.085" + "\n");
                                        case 15 -> System.out.println("#15 | P | Phosphorus | 30.974" + "\n");
                                        case 16 -> System.out.println("#16 | S | Sulfur | 32.06" + "\n");
                                        case 17 -> System.out.println("#17 | Cl | Chlorine | 35.45" + "\n");
                                        case 18 -> System.out.println("#18 | Ar | Argon | 39.948" + "\n");
                                        case 19 -> System.out.println("#19 | K | Potassium | 39.098" + "\n");
                                        case 20 -> System.out.println("#20 | Ca | Calcium | 40.078" + "\n");
                                        case 21 -> System.out.println("#21 | Sc | Scandium | 44.956" + "\n");
                                        case 22 -> System.out.println("#22 | Ti | Titanium | 47.867" + "\n");
                                        case 23 -> System.out.println("#23 | V | Vanadium | 50.942" + "\n");
                                        case 24 -> System.out.println("#24 | Cr | Chromium | 51.996" + "\n");
                                        case 25 -> System.out.println("#25 | Mn | Manganese | 54.938" + "\n");
                                        case 26 -> System.out.println("#26 | Fe | Iron | 55.845" + "\n");
                                        case 27 -> System.out.println("#27 | Co | Cobalt | 58.933" + "\n");
                                        case 28 -> System.out.println("#28 | Ni | Nickel | 58.693" + "\n");
                                        case 29 -> System.out.println("#29 | Cu | Copper | 63.546" + "\n");
                                        case 30 -> System.out.println("#30 | Zn | Zinc | 65.38" + "\n");
                                        case 31 -> System.out.println("#31 | Ga | Gallium | 69.723" + "\n");
                                        case 32 -> System.out.println("#32 | Ge | Germanium | 72.63" + "\n");
                                        case 33 -> System.out.println("#33 | As | Arsenic | 74.922" + "\n");
                                        case 34 -> System.out.println("#34 | Se | Selenium | 78.971" + "\n");
                                        case 35 -> System.out.println("#35 | Br | Bromine | 79.904" + "\n");
                                        case 36 -> System.out.println("#36 | Kr | Krypton | 83.798" + "\n");
                                        case 37 -> System.out.println("#37 | Rb | Rubidium | 85.468" + "\n");
                                        case 38 -> System.out.println("#38 | Sr | Strontium | 87.62" + "\n");
                                        case 39 -> System.out.println("#39 | Y | Yttrium | 88.906" + "\n");
                                        case 40 -> System.out.println("#40 | Zr | Zirconium | 91.224" + "\n");
                                        case 41 -> System.out.println("#41 | Nb | Niobium | 92.906" + "\n");
                                        case 42 -> System.out.println("#42 | Mo | Molybdenum | 95.95" + "\n");
                                        case 43 -> System.out.println("#43 | Tc | Technetium | 98" + "\n");
                                        case 44 -> System.out.println("#44 | Ru | Ruthenium | 101.07" + "\n");
                                        case 45 -> System.out.println("#45 | Rh | Rhodium | 102.91" + "\n");
                                        case 46 -> System.out.println("#46 | Pd | Palladium | 106.42" + "\n");
                                        case 47 -> System.out.println("#47 | Ag | Silver | 107.87" + "\n");
                                        case 48 -> System.out.println("#48 | Cd | Cadmium | 112.41" + "\n");
                                        case 49 -> System.out.println("#49 | In | Indium | 114.82" + "\n");
                                        case 50 -> System.out.println("#50 | Sn | Tin | 118.71" + "\n");
                                        case 51 -> System.out.println("#51 | Sb | Antimony | 121.76" + "\n");
                                        case 52 -> System.out.println("#52 | Te | Tellurium | 127.6" + "\n");
                                        case 53 -> System.out.println("#53 | I | Iodine | 126.9" + "\n");
                                        case 54 -> System.out.println("#54 | Xe | Xenon | 131.29" + "\n");
                                        case 55 -> System.out.println("#55 | Cs | Caesium | 132.91" + "\n");
                                        case 56 -> System.out.println("#56 | Ba | Barium | 137.33" + "\n");
                                        case 57 -> System.out.println("#57 | La | Lanthanum | 138.91" + "\n");
                                        case 58 -> System.out.println("#58 | Ce | Cerium | 140.12" + "\n");
                                        case 59 -> System.out.println("#59 | Pr | Praseodymium | 140.91" + "\n");
                                        case 60 -> System.out.println("#60 | Nd | Neodymium | 144.24" + "\n");
                                        case 61 -> System.out.println("#61 | Pm | Promethium | 145" + "\n");
                                        case 62 -> System.out.println("#62 | Sm | Samarium | 150.36" + "\n");
                                        case 63 -> System.out.println("#63 | Eu | Europium | 151.96" + "\n");
                                        case 64 -> System.out.println("#64 | Gd | Gadolinium | 157.25" + "\n");
                                        case 65 -> System.out.println("#65 | Tb | Terbium | 158.93" + "\n");
                                        case 66 -> System.out.println("#66 | Dy | Dysprosium | 162.5" + "\n");
                                        case 67 -> System.out.println("#67 | Ho | Holmium | 164.93" + "\n");
                                        case 68 -> System.out.println("#68 | Er | Erbium | 167.26" + "\n");
                                        case 69 -> System.out.println("#69 | Tm | Thulium | 168.93" + "\n");
                                        case 70 -> System.out.println("#70 | Yb | Ytterbium | 173.05" + "\n");
                                        case 71 -> System.out.println("#71 | Lu | Lutetium | 174.97" + "\n");
                                        case 72 -> System.out.println("#72 | Hf | Hafnium | 178.49" + "\n");
                                        case 73 -> System.out.println("#73 | Ta | Tantalum | 180.95" + "\n");
                                        case 74 -> System.out.println("#74 | W | Tungsten/Wolfram | 183.84" + "\n");
                                        case 75 -> System.out.println("#75 | Re | Rhenium | 186.21" + "\n");
                                        case 76 -> System.out.println("#76 | Os | Osmium | 190.23" + "\n");
                                        case 77 -> System.out.println("#77 | Ir | Iridium | 192.22" + "\n");
                                        case 78 -> System.out.println("#78 | Pt | Platinum | 195.08" + "\n");
                                        case 79 -> System.out.println("#79 | Au | Gold | 196.97" + "\n");
                                        case 80 -> System.out.println("#80 | Hg | Mercury | 200.59" + "\n");
                                        case 81 -> System.out.println("#81 | Tl | Thallium | 204.38" + "\n");
                                        case 82 -> System.out.println("#82 | Pb | Lead | 207.2" + "\n");
                                        case 83 -> System.out.println("#83 | Bi | Bismuth | 208.98" + "\n");
                                        case 84 -> System.out.println("#84 | Po | Polonium | 209" + "\n");
                                        case 85 -> System.out.println("#85 | At | Astatine | 210" + "\n");
                                        case 86 -> System.out.println("#86 | Rn | Radon | 222" + "\n");
                                        case 87 -> System.out.println("#87 | Fr | Francium | 223" + "\n");
                                        case 88 -> System.out.println("#88 | Ra | Radium | 226" + "\n");
                                        case 89 -> System.out.println("#89 | Ac | Actinium | 227" + "\n");
                                        case 90 -> System.out.println("#90 | Th | Thorium | 232.04" + "\n");
                                        case 91 -> System.out.println("#91 | Pa | Protactinium | 231.04" + "\n");
                                        case 92 -> System.out.println("#92 | U | Uranium | 238.03" + "\n");
                                        case 93 -> System.out.println("#93 | Np | Neptunium | 237" + "\n");
                                        case 94 -> System.out.println("#94 | Pu | Plutonium | 244" + "\n");
                                        case 95 -> System.out.println("#95 | Am | Americium | 243" + "\n");
                                        case 96 -> System.out.println("#96 | Cm | Curium | 247" + "\n");
                                        case 97 -> System.out.println("#97 | Bk | Berkelium | 247" + "\n");
                                        case 98 -> System.out.println("#98 | Cf | Californium | 251" + "\n");
                                        case 99 -> System.out.println("#99 | Es | Einsteinium | 252" + "\n");
                                        case 100 -> System.out.println("#100 | Fm | Fermium | 257" + "\n");
                                        case 101 -> System.out.println("#101 | Md | Mendelevium | 258" + "\n");
                                        case 102 -> System.out.println("#102 | No | Nobelium | 259" + "\n");
                                        case 103 -> System.out.println("#103 | Lr | Lawrencium | 266" + "\n");
                                        case 104 -> System.out.println("#104 | Rf | Rutherfordium | 267" + "\n");
                                        case 105 -> System.out.println("#105 | Db | Dubnium | 268" + "\n");
                                        case 106 -> System.out.println("#106 | Sg | Seaborgium | 269" + "\n");
                                        case 107 -> System.out.println("#107 | Bh | Bohrium | 270" + "\n");
                                        case 108 -> System.out.println("#108 | Hs | Hassium | 277" + "\n");
                                        case 109 -> System.out.println("#109 | Mt | Meitnerium | 278" + "\n");
                                        case 110 -> System.out.println("#110 | Ds | Darmstadtium | 281" + "\n");
                                        case 111 -> System.out.println("#111 | Rg | Roentgenium | 282" + "\n");
                                        case 112 -> System.out.println("#112 | Cn | Copernicium | 285" + "\n");
                                        case 113 -> System.out.println("#113 | Nh | Nihonium | 286" + "\n");
                                        case 114 -> System.out.println("#114 | Fl | Flerovium | 289" + "\n");
                                        case 115 -> System.out.println("#115 | Mc | Moscovium | 290" + "\n");
                                        case 116 -> System.out.println("#116 | Lv | Livermorium | 293" + "\n");
                                        case 117 -> System.out.println("#117 | Ts | Tennessine | 294" + "\n");
                                        case 118 -> System.out.println("#118 | Og | Oganesson | 294" + "\n");
                                }
        
                                if (atomicNumber == 3 || atomicNumber == 11 || atomicNumber == 19 || atomicNumber == 37 || atomicNumber == 55 || atomicNumber == 87) {
                                        block = 's';
                                        System.out.println("Alkali Metal");
                                }
                                if (atomicNumber == 4 || atomicNumber == 12 || atomicNumber == 20 || atomicNumber == 38 || atomicNumber == 56 || atomicNumber == 88) {
                                        block = 's';
                                        System.out.println("Alkaline Earth Metal");
                                }
                                if (atomicNumber >= 57 && atomicNumber <= 71) {
                                        block = 'f';
                                        System.out.println("Lanthanoid/Lanthanide (Inner-Transition)");
                                }
                                if (atomicNumber >= 89 && atomicNumber <= 103) {
                                        block = 'f';
                                        System.out.println("Actinoid/Actinide (Inner-Transition)");
                                }
                                if ((atomicNumber >= 21 && atomicNumber <= 30) || (atomicNumber >= 39 && atomicNumber <= 48) || (atomicNumber >= 72 && atomicNumber <= 80) || (atomicNumber >= 104 && atomicNumber <= 108)) {
                                        block = 'd';
                                        System.out.println("Transition Metal");
                                }
                                if (atomicNumber == 13 || atomicNumber == 31 || atomicNumber == 49 || atomicNumber == 50 || (atomicNumber >= 81 && atomicNumber <= 84)) {
                                        block = 'p';
                                        System.out.println("Post-Transition Metal");
                                }
                                if (atomicNumber == 5 || atomicNumber == 14 || atomicNumber == 32 || atomicNumber == 33 || atomicNumber == 51 || atomicNumber == 52) {
                                        block = 'p';
                                        System.out.println("Metalloid");
                                }
                                if (atomicNumber == 85) {
                                        block = 'p';
                                        System.out.println("Metalloid (Halogen)");
                                }
                                if (atomicNumber == 6 || atomicNumber == 7 || atomicNumber == 8 || atomicNumber == 15 || atomicNumber == 16 || atomicNumber == 34 || atomicNumber == 1) {
                                        block = 'p';
                                        System.out.println("Non-Metal (Non-Halogen)");
                                }
                                if (atomicNumber == 9 || atomicNumber == 17 || atomicNumber == 35 || atomicNumber == 53) {
                                        block = 'p';
                                        System.out.println("Non-Metal (Halogen)");
                                }
                                if (atomicNumber == 2) {
                                        block = 's';
                                        System.out.println("Noble Gas");
                                }
                                if (atomicNumber == 10 || atomicNumber == 18 || atomicNumber == 36 || atomicNumber == 54 || atomicNumber == 86) {
                                        block = 'p';
                                        System.out.println("Noble Gas");
                                }
                                if (atomicNumber >= 109 && atomicNumber <= 112) {
                                        block = 'd';
                                        System.out.println("Transactinide");
                                }
                                if (atomicNumber >= 113 && atomicNumber <= 118) {
                                        block = 'p';
                                        System.out.println("Transactinide");
                                }
        
                                if (atomicNumber > 0) {
                                        System.out.println();
                                }
        
                                if (atomicNumber <= 118 && atomicNumber >= 1) {
                                        if ((block == 's' && atomicNumber % 2 == 1) || atomicNumber == 1)
                                                group = 1;
                                        if (block == 's' && atomicNumber % 2 == 0 && atomicNumber != 2)
                                                group = 2;
                                        if (atomicNumber == 39 || atomicNumber == 21)
                                                group = 3;
                                        if (atomicNumber == 22 || atomicNumber == 40 || atomicNumber == 72 || atomicNumber == 104)
                                                group = 4;
                                        if (atomicNumber == 23 || atomicNumber == 41 || atomicNumber == 73 || atomicNumber == 105)
                                                group = 5;
                                        if (atomicNumber == 24 || atomicNumber == 42 || atomicNumber == 74 || atomicNumber == 106)
                                                group = 6;
                                        if (atomicNumber == 25 || atomicNumber == 43 || atomicNumber == 75 || atomicNumber == 107)
                                                group = 7;
                                        if (atomicNumber == 26 || atomicNumber == 44 || atomicNumber == 76 || atomicNumber == 108)
                                                group = 8;
                                        if (atomicNumber == 27 || atomicNumber == 45 || atomicNumber == 77 || atomicNumber == 109)
                                                group = 9;
                                        if (atomicNumber == 28 || atomicNumber == 46 || atomicNumber == 78 || atomicNumber == 110)
                                                group = 10;
                                        if (atomicNumber == 29 || atomicNumber == 47 || atomicNumber == 79 || atomicNumber == 111)
                                                group = 11;
                                        if (atomicNumber == 30 || atomicNumber == 48 || atomicNumber == 80 || atomicNumber == 112)
                                                group = 12;
                                        if (atomicNumber == 5 || atomicNumber == 13 || atomicNumber == 31 || atomicNumber == 49 | atomicNumber == 81 || atomicNumber == 113)
                                                group = 13;
                                        if (atomicNumber == 6 || atomicNumber == 14 || atomicNumber == 32 || atomicNumber == 50 | atomicNumber == 82 || atomicNumber == 114)
                                                group = 14;
                                        if (atomicNumber == 7 || atomicNumber == 15 || atomicNumber == 33 || atomicNumber == 51 | atomicNumber == 83 || atomicNumber == 115)
                                                group = 15;
                                        if (atomicNumber == 8 || atomicNumber == 16 || atomicNumber == 34 || atomicNumber == 52 | atomicNumber == 84 || atomicNumber == 116)
                                                group = 16;
                                        if (atomicNumber == 9 || atomicNumber == 17 || atomicNumber == 35 || atomicNumber == 53 | atomicNumber == 85 || atomicNumber == 117)
                                                group = 17;
                                        if (atomicNumber == 2 || atomicNumber == 10 || atomicNumber == 18 || atomicNumber == 36 || atomicNumber == 54 | atomicNumber == 86 || atomicNumber == 118)
                                                group = 18;
                
                                        for (int y = 0; y < atomicNumber; y++) {
                                                if (atomicNumber <= 2) {
                                                        electrons1++;
                                                        period = 1;
                                                }
                                                if (atomicNumber >= 3 && atomicNumber <= 10) {
                                                        if (electrons2 < 8 && electrons1 == 2)
                                                                electrons2++;
                                                        if (electrons1 < 2)
                                                                electrons1++;
                                                        period = 2;
                                                }
                                                if (atomicNumber >= 11 && atomicNumber <= 18) {
                                                        if (electrons3 < 8 && electrons2 == 8)
                                                                electrons3++;
                                                        if (electrons2 < 8 && electrons1 == 2)
                                                                electrons2++;
                                                        if (electrons1 < 2)
                                                                electrons1++;
                                                        period = 3;
                                                }
                                                if (atomicNumber >= 19 && atomicNumber <= 36) {
                                                        if (electrons4 < 8 && electrons3 == 18)
                                                                electrons4++;
                                                        if (y == 29 && electrons3 == 18 && electrons4 == 1)
                                                                electrons4++;
                                                        if (y == 28 && electrons3 == 16) {
                                                                electrons4--;
                                                                electrons3 += 2;
                                                        }
                                                        if (electrons4 == 2 && electrons3 < 16 && electrons3 >= 13)
                                                                electrons3++;
                                                        if (y == 24 && electrons3 == 13 && electrons4 == 1)
                                                                electrons4++;
                                                        if (y == 23 && electrons3 == 11) {
                                                                electrons4--;
                                                                electrons3 += 2;
                                                        }
                                                        if (electrons4 == 2 && electrons3 < 11)
                                                                electrons3++;
                                                        if (electrons4 < 2 && electrons3 == 8)
                                                                electrons4++;
                                                        if (electrons3 < 8 && electrons2 == 8)
                                                                electrons3++;
                                                        if (electrons2 < 8 && electrons1 == 2)
                                                                electrons2++;
                                                        if (electrons1 < 2)
                                                                electrons1++;
                                                        period = 4;
                                                }
                                                if (atomicNumber >= 37 && atomicNumber <= 54) {
                                                        if (y > 45 && electrons4 == 18 && electrons5 < 8)
                                                                electrons5++;
                                                        if (y == 45 && electrons4 == 16) {
                                                                electrons5--;
                                                                electrons4 += 2;
                                                        }
                                                        if (y == 44 && electrons4 == 15 && electrons5 == 1)
                                                                electrons4++;
                                                        if (y == 43 && electrons4 == 13) {
                                                                electrons5--;
                                                                electrons4 += 2;
                                                        }
                                                        if (y == 42 && electrons4 == 13 && electrons5 == 1)
                                                                electrons5++;
                                                        if (y == 41 && electrons4 == 12 && electrons5 == 1)
                                                                electrons4++;
                                                        if (y == 40 && electrons4 == 10) {
                                                                electrons5--;
                                                                electrons4 += 2;
                                                        }
                                                        if (electrons5 == 2 && electrons4 < 10)
                                                                electrons4++;
                                                        if (electrons5 < 2 && electrons4 == 8)
                                                                electrons5++;
                                                        if (electrons4 < 8 && electrons3 == 18)
                                                                electrons4++;
                                                        if (y == 29 && electrons3 == 18 && electrons4 == 1)
                                                                electrons4++;
                                                        if (y == 28 && electrons3 == 16) {
                                                                electrons4--;
                                                                electrons3 += 2;
                                                        }
                                                        if (electrons4 == 2 && electrons3 < 16 && electrons3 >= 13)
                                                                electrons3++;
                                                        if (y == 24 && electrons3 == 13 && electrons4 == 1)
                                                                electrons4++;
                                                        if (y == 23 && electrons3 == 11) {
                                                                electrons4--;
                                                                electrons3 += 2;
                                                        }
                                                        if (electrons4 == 2 && electrons3 < 11)
                                                                electrons3++;
                                                        if (electrons4 < 2 && electrons3 == 8)
                                                                electrons4++;
                                                        if (electrons3 < 8 && electrons2 == 8)
                                                                electrons3++;
                                                        if (electrons2 < 8 && electrons1 == 2)
                                                                electrons2++;
                                                        if (electrons1 < 2)
                                                                electrons1++;
                                                        period = 5;
                                                }
                                                if (atomicNumber >= 55 && atomicNumber <= 86) {
                                                        if (electrons5 == 18 && electrons6 < 8)
                                                                electrons6++;
                                                        if (electrons6 == 1 && y == 78)
                                                                electrons5++;
                                                        if (electrons5 == 15 && y == 77) {
                                                                electrons5 += 2;
                                                                electrons6--;
                                                        }
                                                        if (electrons4 == 32 && electrons5 < 15)
                                                                electrons5++;
                                                        if (electrons4 < 32 && electrons4 >= 27)
                                                                electrons4++;
                                                        if (y == 64 && electrons5 == 9) {
                                                                electrons4 += 2;
                                                                electrons5--;
                                                        }
                                                        if (y == 63 && electrons4 == 25)
                                                                electrons5++;
                                                        if (electrons4 < 25 && electrons4 >= 21)
                                                                electrons4++;
                                                        if (y == 58 && electrons6 == 2) {
                                                                electrons4 += 2;
                                                                electrons5--;
                                                        }
                                                        if (y == 57 && electrons6 == 2)
                                                                electrons4++;
                                                        if (y == 56 && electrons6 == 2)
                                                                electrons5++;
                                                        if (electrons6 < 2 && electrons5 == 8)
                                                                electrons6++;
                                                        if (y > 45 && electrons4 == 18 && electrons5 < 8)
                                                                electrons5++;
                                                        if (y == 45 && electrons4 == 16) {
                                                                electrons5--;
                                                                electrons4 += 2;
                                                        }
                                                        if (y == 44 && electrons4 == 15 && electrons5 == 1)
                                                                electrons4++;
                                                        if (y == 43 && electrons4 == 13) {
                                                                electrons5--;
                                                                electrons4 += 2;
                                                        }
                                                        if (y == 42 && electrons4 == 13 && electrons5 == 1)
                                                                electrons5++;
                                                        if (y == 41 && electrons4 == 12 && electrons5 == 1)
                                                                electrons4++;
                                                        if (y == 40 && electrons4 == 10) {
                                                                electrons5--;
                                                                electrons4 += 2;
                                                        }
                                                        if (electrons5 == 2 && electrons4 < 10)
                                                                electrons4++;
                                                        if (electrons5 < 2 && electrons4 == 8)
                                                                electrons5++;
                                                        if (electrons4 < 8 && electrons3 == 18)
                                                                electrons4++;
                                                        if (y == 29 && electrons3 == 18 && electrons4 == 1)
                                                                electrons4++;
                                                        if (y == 28 && electrons3 == 16) {
                                                                electrons4--;
                                                                electrons3 += 2;
                                                        }
                                                        if (electrons4 == 2 && electrons3 < 16 && electrons3 >= 13)
                                                                electrons3++;
                                                        if (y == 24 && electrons3 == 13 && electrons4 == 1)
                                                                electrons4++;
                                                        if (y == 23 && electrons3 == 11) {
                                                                electrons4--;
                                                                electrons3 += 2;
                                                        }
                                                        if (electrons4 == 2 && electrons3 < 11)
                                                                electrons3++;
                                                        if (electrons4 < 2 && electrons3 == 8)
                                                                electrons4++;
                                                        if (electrons3 < 8 && electrons2 == 8)
                                                                electrons3++;
                                                        if (electrons2 < 8 && electrons1 == 2)
                                                                electrons2++;
                                                        if (electrons1 < 2)
                                                                electrons1++;
                                                        period = 6;
                                                }
                                                if (atomicNumber >= 87 && atomicNumber <= 118) {
                                                        if (electrons6 == 18 && electrons7 < 8)
                                                                electrons7++;
                                                        if (y == 111 && electrons6 == 17 && electrons7 == 2)
                                                                electrons6++;
                                                        if(y == 110 && electrons6 == 17)
                                                                electrons7++;
                                                        if(electrons6 == 15 && y == 109) {
                                                                electrons6 += 2;
                                                                electrons7--;
                                                        }
                                                        if(electrons6 < 15 && y >= 104)
                                                                electrons6++;
                                                        if(y == 103 && electrons7 == 3) {
                                                                electrons7--;
                                                                electrons6 += 2;
                                                        }
                                                        if (y == 102 && electrons5 == 32)
                                                                electrons7++;
                                                        if(electrons5 < 32 && (y >= 97))
                                                                electrons5++;
                                                        if (y == 96 && electrons7 == 2) {
                                                                electrons5 += 2;
                                                                electrons6--;
                                                        }
                                                        if (y == 95 && electrons7 == 2)
                                                                electrons6++;
                                                        if (y == 94 && electrons7 == 2)
                                                                electrons5++;
                                                        if (y == 93 && electrons7 == 2) {
                                                                electrons5 += 2;
                                                                electrons6--;
                                                        }
                                                        if (y == 92 && electrons7 == 2)
                                                                electrons5++;
                                                        if (y == 91 && electrons7 == 2)
                                                                electrons5++;
                                                        if (y == 90 && electrons7 == 2) {
                                                                electrons5 += 2;
                                                                electrons6--;
                                                        }
                                                        if (y == 89 && electrons7 == 2)
                                                                electrons6++;
                                                        if (y == 88 && electrons7 == 2)
                                                                electrons6++;
                                                        if (electrons7 < 2 && electrons6 == 8)
                                                                electrons7++;
                                                        if (electrons5 == 18 && electrons6 < 8)
                                                                electrons6++;
                                                        if (electrons6 == 1 && y == 78)
                                                                electrons5++;
                                                        if (electrons5 == 15 && y == 77) {
                                                                electrons5 += 2;
                                                                electrons6--;
                                                        }
                                                        if (electrons4 == 32 && electrons5 < 15)
                                                                electrons5++;
                                                        if (electrons4 < 32 && electrons4 >= 27)
                                                                electrons4++;
                                                        if (y == 64 && electrons5 == 9) {
                                                                electrons4 += 2;
                                                                electrons5--;
                                                        }
                                                        if (y == 63 && electrons4 == 25)
                                                                electrons5++;
                                                        if (electrons4 < 25 && electrons4 >= 21)
                                                                electrons4++;
                                                        if (y == 58 && electrons6 == 2) {
                                                                electrons4 += 2;
                                                                electrons5--;
                                                        }
                                                        if (y == 57 && electrons6 == 2)
                                                                electrons4++;
                                                        if (y == 56 && electrons6 == 2)
                                                                electrons5++;
                                                        if (electrons6 < 2 && electrons5 == 8)
                                                                electrons6++;
                                                        if (y > 45 && electrons4 == 18 && electrons5 < 8)
                                                                electrons5++;
                                                        if (y == 45 && electrons4 == 16) {
                                                                electrons5--;
                                                                electrons4 += 2;
                                                        }
                                                        if (y == 44 && electrons4 == 15 && electrons5 == 1)
                                                                electrons4++;
                                                        if (y == 43 && electrons4 == 13) {
                                                                electrons5--;
                                                                electrons4 += 2;
                                                        }
                                                        if (y == 42 && electrons4 == 13 && electrons5 == 1)
                                                                electrons5++;
                                                        if (y == 41 && electrons4 == 12 && electrons5 == 1)
                                                                electrons4++;
                                                        if (y == 40 && electrons4 == 10) {
                                                                electrons5--;
                                                                electrons4 += 2;
                                                        }
                                                        if (electrons5 == 2 && electrons4 < 10)
                                                                electrons4++;
                                                        if (electrons5 < 2 && electrons4 == 8)
                                                                electrons5++;
                                                        if (electrons4 < 8 && electrons3 == 18)
                                                                electrons4++;
                                                        if (y == 29 && electrons3 == 18 && electrons4 == 1)
                                                                electrons4++;
                                                        if (y == 28 && electrons3 == 16) {
                                                                electrons4--;
                                                                electrons3 += 2;
                                                        }
                                                        if (electrons4 == 2 && electrons3 < 16 && electrons3 >= 13)
                                                                electrons3++;
                                                        if (y == 24 && electrons3 == 13 && electrons4 == 1)
                                                                electrons4++;
                                                        if (y == 23 && electrons3 == 11) {
                                                                electrons4--;
                                                                electrons3 += 2;
                                                        }
                                                        if (electrons4 == 2 && electrons3 < 11)
                                                                electrons3++;
                                                        if (electrons4 < 2 && electrons3 == 8)
                                                                electrons4++;
                                                        if (electrons3 < 8 && electrons2 == 8)
                                                                electrons3++;
                                                        if (electrons2 < 8 && electrons1 == 2)
                                                                electrons2++;
                                                        if (electrons1 < 2)
                                                                electrons1++;
                                                        period = 7;
                                                }
                                        }
                                }
        
                                shells = period;
        
                                if ((atomicNumber >= 57 && atomicNumber <= 71) || (atomicNumber >= 89 && atomicNumber <= 103))
                                        System.out.println("Location: Period " + period + " - Group: f-Block/Unknown");
                                else if (!(atomicNumber >= 57 && atomicNumber <= 71) && !(atomicNumber >= 89 && atomicNumber <= 103) && atomicNumber != 0)
                                        System.out.println("Location: Period " + period + " - Group: " + group);
        
                                System.out.println("Protons: " + atomicNumber + "\n");
        
                                if (shells == 1) {
                                        System.out.println("Energy Level(s): " + electrons1 + "\nShells: " + shells + "\n" + "Block: " + block);
                                        valence = electrons1;
                                }
                                if (shells == 2) {
                                        System.out.println("Energy Level(s): " + electrons1 + ", " + electrons2 + "\nShells: " + shells + "\n" + "Block: " + block);
                                        valence = electrons2;
                                }
                                if (shells == 3) {
                                        System.out.println("Energy Level(s): " + electrons1 + ", " + electrons2 + ", " + electrons3 + "\nShells: " + shells + "\n" + "Block: " + block);
                                        valence = electrons3;
                                }
                                if (shells == 4) {
                                        System.out.println("Energy Level(s): " + electrons1 + ", " + electrons2 + ", " + electrons3 + ", " + electrons4 + "\nShells: " + shells + "\n" + "Block: " + block);
                                        valence = electrons4;
                                }
                                if (shells == 5) {
                                        System.out.println("Energy Level(s): " + electrons1 + ", " + electrons2 + ", " + electrons3 + ", " + electrons4 + ", " + electrons5 + "\nShells: " + shells + "\n" + "Block: " + block);
                                        valence = electrons5;
                                }
                                if (shells == 6) {
                                        System.out.println("Energy Level(s): " + electrons1 + ", " + electrons2 + ", " + electrons3 + ", " + electrons4 + ", " + electrons5 + ", " + electrons6 + "\nShells: " + shells + "\n" + "Block: " + block);
                                        valence = electrons6;
                                }
                                if (shells == 7) {
                                        System.out.println("Energy Level(s): " + electrons1 + ", " + electrons2 + ", " + electrons3 + ", " + electrons4 + ", " + electrons5 + ", " + electrons6 + ", " + electrons7 + "\nShells: " + shells + "\n" + "Block: " + block);
                                        valence = electrons7;
                                }
        
                                if (block == 's')
                                        System.out.println("Orbital: Spherical");
                                if (block == 'p')
                                        System.out.println("Orbital: Dumbbell");
                                if (block == 'd')
                                        System.out.println("Orbital: Cloverleaf");
                                if (block == 'f')
                                        System.out.println("Orbital: Various/Dependant");
                                
        
                                if(group == 1) {
                                        System.out.println("Ionic Charge: +1");
                                        charge = -1;
                                }
        
                                if(group == 2) {
                                        System.out.println("Ionic Charge: +2");
                                        charge = -2;
                                }
        
                                if(group == 13) {
                                        System.out.println("Ionic Charge: +3");
                                        charge = -3;
                                }
        
                                if(group == 14) {
                                        System.out.println("Ionic Charge: +4/-4");
                                        charge = 4;
                                }
        
                                if(group == 15) {
                                        System.out.println("Ionic Charge: -3");
                                        charge = 3;
                                }
        
                                if(group == 16) {
                                        System.out.println("Ionic Charge: -2");
                                        charge = 2;
                                }
        
                                if(group == 17) {
                                        System.out.println("Ionic Charge: -1");
                                        charge = 1;
                                }
                                
                                if(group == 18) {
                                        System.out.println("Ionic Charge: 0");
                                        charge = 0;
                                }
                                
                                ionicValence = charge + atomicNumber;
                                
                                if(charge == 4 && period < 4)
                                        System.out.println("Noble Gas Lookalike of Ion: " + periodicArray[atomicNumber - 5] + " OR " + periodicArray[atomicNumber + 3]);
                                if(((charge != 0 && charge != 4 && charge != -3)) && (atomicNumber != 2 && atomicNumber != 1))
                                        System.out.println("Noble Gas Lookalike of Ion: " + periodicArray[ionicValence - 1]);
                                if(charge == -3 && period < 4)
                                        System.out.println("Noble Gas Lookalike of Ion: " + periodicArray[ionicValence - 1]);
                                if((charge == -3) && (period >= 4 && period < 6))
                                        System.out.println("Noble Gas Lookalike of Ion: " + periodicArray[ionicValence - 11]);
                                if(charge == 4 && (period >= 4 && period < 6))
                                        System.out.println("Noble Gas Lookalike of Ion: " + periodicArray[atomicNumber - 15] + " OR " + periodicArray[atomicNumber + 3]);
                                if((charge == -3) && (period >= 6))
                                        System.out.println("Noble Gas Lookalike of Ion: " + periodicArray[ionicValence - 25]);
                                if(charge == 4 && (period >= 6))
                                        System.out.println("Noble Gas Lookalike of Ion: " + periodicArray[atomicNumber - 29] + " OR " + periodicArray[atomicNumber + 3]);
                                if(atomicNumber == 1)
                                        System.out.println("Noble Gas Lookalike of Ion: None");
                                if(group == 18)
                                        System.out.println("Is a Noble Gas/Full Valence Shell");
                        }
                        if(block == 's')
                                System.out.println("Electron Location: " + period + block + valence);
                        if(block == 'p')
                                System.out.println("Electron Location: " + period + block + (valence - 2));

                        
                        System.out.println();
                        
                        atomicNumber = 0;
                }
        }
}

