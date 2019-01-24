 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jogo.*;

/**
 *
 * @author Andrei
 */
public class JanelaPrincipal extends javax.swing.JFrame {
    public final Game game;
    private final Parser parser;
    public Heroi heroi;
    
    public ObjectOutputStream saidaJogo;
    public ObjectInputStream entradaJogo; 
    
    private int contadorModoDeus;
    private ArrayList<String> listaPers ;
    private ArrayList<Personagem> listaPersonagens;
    private ArrayList<String> listaItens ; 
    private ArrayList<Item> mochilaHeroi;
    private ArrayList<Item> mochilaComerciante;
    private Mochila todosItensPossiveis;
    private JanelaInfoAdversario janelaInfo;
    public JanelaLogin janelaLogin;
    public MenuPrincipal janelaMenu;
    public String nickJogador;
    
    public JanelaPrincipal(MenuPrincipal janM,JanelaLogin jan,ObjectInputStream in , ObjectOutputStream out,String nick) {
        initComponents();
        game = new Game(this);
        this.listaPers = new ArrayList();
        this.listaItens = new ArrayList();
        this.heroi = game.heroi;
        this.contadorModoDeus=0;
        this.mochilaComerciante = new ArrayList();
        this.listaPersonagens = new ArrayList();
        this.todosItensPossiveis = new Mochila();
        this.todosItensPossiveis = game.getMochilaComTodosItens();
        precoItem.setVisible(false);
        labelPreco.setVisible(false);
        this.mochilaHeroi = game.heroi.getMochila().getArrayMochila();
        parser = game.getParser();
        this.janelaLogin = jan;
        this.janelaMenu = janM;
        nickJogador = nick;
        if(nick == null)
            this.setTitle("Vida de Estudande - (Offline)");
        else
            this.setTitle("Vida de Estudante - Online - ("+nickJogador+")");

        this.entradaJogo = in;
        this.saidaJogo = out;
        
        if(in != null && out != null)
            this.setLocation(this.getLocation().x - 217 , this.getLocation().y);
         
        
        atualizaGeral(0);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMapa = new javax.swing.JPanel();
        imagemMapa = new javax.swing.JLabel();
        labelLugarAtual = new javax.swing.JLabel();
        panelPersonagensItens = new javax.swing.JPanel();
        personagem1 = new javax.swing.JLabel();
        botaoFalar = new javax.swing.JButton();
        botaoInfoPersonagem = new javax.swing.JButton();
        botaoAtacar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        textoPersonagemSelecionado = new javax.swing.JLabel();
        personagem2 = new javax.swing.JLabel();
        personagem3 = new javax.swing.JLabel();
        personagem4 = new javax.swing.JLabel();
        personagem5 = new javax.swing.JLabel();
        personagem6 = new javax.swing.JLabel();
        personagem7 = new javax.swing.JLabel();
        panelMochilaHeroi = new javax.swing.JPanel();
        itemMochila1 = new javax.swing.JLabel();
        itemMochila2 = new javax.swing.JLabel();
        itemMochila3 = new javax.swing.JLabel();
        itemMochila4 = new javax.swing.JLabel();
        itemMochila5 = new javax.swing.JLabel();
        itemMochila6 = new javax.swing.JLabel();
        itemMochila7 = new javax.swing.JLabel();
        itemMochila8 = new javax.swing.JLabel();
        itemMochila9 = new javax.swing.JLabel();
        itemMochila10 = new javax.swing.JLabel();
        itemMochila11 = new javax.swing.JLabel();
        itemMochila12 = new javax.swing.JLabel();
        itemMochila13 = new javax.swing.JLabel();
        itemMochila14 = new javax.swing.JLabel();
        itemMochila15 = new javax.swing.JLabel();
        itemMochila16 = new javax.swing.JLabel();
        itemMochila17 = new javax.swing.JLabel();
        itemMochila18 = new javax.swing.JLabel();
        itemMochila19 = new javax.swing.JLabel();
        itemMochila20 = new javax.swing.JLabel();
        itemMochila21 = new javax.swing.JLabel();
        itemMochila22 = new javax.swing.JLabel();
        itemMochila23 = new javax.swing.JLabel();
        itemMochila24 = new javax.swing.JLabel();
        itemMochila25 = new javax.swing.JLabel();
        itemMochila26 = new javax.swing.JLabel();
        itemMochila27 = new javax.swing.JLabel();
        itemMochila28 = new javax.swing.JLabel();
        itemMochila29 = new javax.swing.JLabel();
        itemMochila30 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textoItemMochilaSelecionado = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelCapacidade = new javax.swing.JLabel();
        labelEspacoOcupado = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textoTamanhoItemMochila = new javax.swing.JLabel();
        botaoUsarItem = new javax.swing.JButton();
        botaoInfoItemMochila = new javax.swing.JButton();
        botaoVenderItem = new javax.swing.JButton();
        barraRepelente = new javax.swing.JProgressBar();
        barraColete = new javax.swing.JProgressBar();
        labelRepelente = new javax.swing.JLabel();
        labelColete = new javax.swing.JLabel();
        panelItens = new javax.swing.JPanel();
        item1 = new javax.swing.JLabel();
        item2 = new javax.swing.JLabel();
        item3 = new javax.swing.JLabel();
        item4 = new javax.swing.JLabel();
        item5 = new javax.swing.JLabel();
        item6 = new javax.swing.JLabel();
        item7 = new javax.swing.JLabel();
        item8 = new javax.swing.JLabel();
        item9 = new javax.swing.JLabel();
        item10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textoItemSelecionado = new javax.swing.JLabel();
        botaoPegarItem = new javax.swing.JButton();
        botaoInfoItem = new javax.swing.JButton();
        botaoComprar = new javax.swing.JButton();
        labelPreco = new javax.swing.JLabel();
        precoItem = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoInfo = new javax.swing.JTextArea();
        panelIrDirecao = new javax.swing.JPanel();
        botaoIrNorte = new javax.swing.JButton();
        botaoIrSul = new javax.swing.JButton();
        botaoIrOeste = new javax.swing.JButton();
        botaoIrLeste = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        barraDeVida = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelAtaque = new javax.swing.JLabel();
        labelDefesa = new javax.swing.JLabel();
        labelAtaqueDobrado = new javax.swing.JLabel();
        labelColeteRepelenteAtivo = new javax.swing.JLabel();
        labelDinheiro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Vida de Estudante");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelMapa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        imagemMapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelLugarAtual.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        labelLugarAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLugarAtual.setText("Você está no Laboratório de Programação ");
        labelLugarAtual.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelMapaLayout = new javax.swing.GroupLayout(panelMapa);
        panelMapa.setLayout(panelMapaLayout);
        panelMapaLayout.setHorizontalGroup(
            panelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLugarAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMapaLayout.setVerticalGroup(
            panelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLugarAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemMapa)
                .addContainerGap())
        );

        panelPersonagensItens.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personagens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        personagem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        personagem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personagem1MouseClicked(evt);
            }
        });

        botaoFalar.setText("Falar");
        botaoFalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFalarActionPerformed(evt);
            }
        });

        botaoInfoPersonagem.setText("Info");
        botaoInfoPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInfoPersonagemActionPerformed(evt);
            }
        });

        botaoAtacar.setText("Atacar");
        botaoAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtacarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Selecionado:");
        jLabel13.setToolTipText("");

        textoPersonagemSelecionado.setText("Nenhum");

        personagem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        personagem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personagem2MouseClicked(evt);
            }
        });

        personagem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        personagem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personagem3MouseClicked(evt);
            }
        });

        personagem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        personagem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personagem4MouseClicked(evt);
            }
        });

        personagem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        personagem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personagem5MouseClicked(evt);
            }
        });

        personagem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        personagem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personagem6MouseClicked(evt);
            }
        });

        personagem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        personagem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personagem7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPersonagensItensLayout = new javax.swing.GroupLayout(panelPersonagensItens);
        panelPersonagensItens.setLayout(panelPersonagensItensLayout);
        panelPersonagensItensLayout.setHorizontalGroup(
            panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonagensItensLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(personagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPersonagensItensLayout.createSequentialGroup()
                        .addComponent(personagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(personagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(personagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textoPersonagemSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAtacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personagem5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoFalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personagem6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(personagem7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInfoPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelPersonagensItensLayout.setVerticalGroup(
            panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonagensItensLayout.createSequentialGroup()
                .addGroup(panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoPersonagemSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botaoInfoPersonagem, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoAtacar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoFalar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonagensItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(personagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personagem5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personagem6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personagem7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelMochilaHeroi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sua Mochila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila1MouseClicked(evt);
            }
        });

        itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila2MouseClicked(evt);
            }
        });

        itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila3MouseClicked(evt);
            }
        });

        itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila4MouseClicked(evt);
            }
        });

        itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila5MouseClicked(evt);
            }
        });

        itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila6MouseClicked(evt);
            }
        });

        itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila7MouseClicked(evt);
            }
        });

        itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila8MouseClicked(evt);
            }
        });

        itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila9MouseClicked(evt);
            }
        });

        itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila10MouseClicked(evt);
            }
        });

        itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila11MouseClicked(evt);
            }
        });

        itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila12MouseClicked(evt);
            }
        });

        itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila13MouseClicked(evt);
            }
        });

        itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila14MouseClicked(evt);
            }
        });

        itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila15MouseClicked(evt);
            }
        });

        itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila16MouseClicked(evt);
            }
        });

        itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila17MouseClicked(evt);
            }
        });

        itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila18MouseClicked(evt);
            }
        });

        itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila19MouseClicked(evt);
            }
        });

        itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila20MouseClicked(evt);
            }
        });

        itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila21MouseClicked(evt);
            }
        });

        itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila22MouseClicked(evt);
            }
        });

        itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila23MouseClicked(evt);
            }
        });

        itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila24MouseClicked(evt);
            }
        });

        itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila25MouseClicked(evt);
            }
        });

        itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila26MouseClicked(evt);
            }
        });

        itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila27MouseClicked(evt);
            }
        });

        itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila28MouseClicked(evt);
            }
        });

        itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila29MouseClicked(evt);
            }
        });

        itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        itemMochila30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMochila30MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Selecionado:");
        jLabel15.setToolTipText("");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        textoItemMochilaSelecionado.setText("Nenhum");
        textoItemMochilaSelecionado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Capacidade:");
        jLabel16.setToolTipText("");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Espaço Ocupado:");
        jLabel17.setToolTipText("");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        labelCapacidade.setText("30");

        labelEspacoOcupado.setText("0");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Tamanho :");
        jLabel18.setToolTipText("");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        textoTamanhoItemMochila.setText("0");
        textoTamanhoItemMochila.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        botaoUsarItem.setText("Usar");
        botaoUsarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUsarItemActionPerformed(evt);
            }
        });

        botaoInfoItemMochila.setText("Info");
        botaoInfoItemMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInfoItemMochilaActionPerformed(evt);
            }
        });

        botaoVenderItem.setText("Vender");
        botaoVenderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVenderItemActionPerformed(evt);
            }
        });

        barraRepelente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        barraRepelente.setForeground(new java.awt.Color(0, 0, 0));
        barraRepelente.setMaximum(5);
        barraRepelente.setValue(3);
        barraRepelente.setString("3");
        barraRepelente.setStringPainted(true);

        barraColete.setBackground(new java.awt.Color(0, 0, 0));
        barraColete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        barraColete.setForeground(new java.awt.Color(0, 0, 0));
        barraColete.setMaximum(3);
        barraColete.setValue(3);
        barraColete.setString("3");
        barraColete.setStringPainted(true);

        labelRepelente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelRepelente.setText("Repelente");

        labelColete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelColete.setText("Colete");

        javax.swing.GroupLayout panelMochilaHeroiLayout = new javax.swing.GroupLayout(panelMochilaHeroi);
        panelMochilaHeroi.setLayout(panelMochilaHeroiLayout);
        panelMochilaHeroiLayout.setHorizontalGroup(
            panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMochilaHeroiLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMochilaHeroiLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelRepelente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraRepelente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMochilaHeroiLayout.createSequentialGroup()
                        .addComponent(itemMochila21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMochilaHeroiLayout.createSequentialGroup()
                        .addComponent(itemMochila11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemMochila20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMochilaHeroiLayout.createSequentialGroup()
                        .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelMochilaHeroiLayout.createSequentialGroup()
                                .addComponent(itemMochila1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemMochila2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemMochila3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemMochila4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemMochila5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(itemMochila6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMochilaHeroiLayout.createSequentialGroup()
                                .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelMochilaHeroiLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(10, 10, 10)
                                        .addComponent(labelEspacoOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelMochilaHeroiLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textoItemMochilaSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoTamanhoItemMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMochilaHeroiLayout.createSequentialGroup()
                                .addComponent(itemMochila7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemMochila8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemMochila9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemMochila10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMochilaHeroiLayout.createSequentialGroup()
                                .addComponent(botaoVenderItem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoUsarItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoInfoItemMochila))
                            .addGroup(panelMochilaHeroiLayout.createSequentialGroup()
                                .addComponent(labelColete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(barraColete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        panelMochilaHeroiLayout.setVerticalGroup(
            panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMochilaHeroiLayout.createSequentialGroup()
                .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCapacidade)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelEspacoOcupado))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMochilaHeroiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMochilaHeroiLayout.createSequentialGroup()
                                .addComponent(barraColete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barraRepelente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMochilaHeroiLayout.createSequentialGroup()
                                .addComponent(labelColete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRepelente)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoInfoItemMochila)
                        .addComponent(botaoUsarItem)
                        .addComponent(botaoVenderItem))
                    .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoItemMochilaSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoTamanhoItemMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemMochila2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemMochila12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMochilaHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemMochila22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemMochila30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelItens.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Itens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item1MouseClicked(evt);
            }
        });

        item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item2MouseClicked(evt);
            }
        });

        item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item3MouseClicked(evt);
            }
        });

        item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item4MouseClicked(evt);
            }
        });

        item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item5MouseClicked(evt);
            }
        });

        item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item6MouseClicked(evt);
            }
        });

        item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item7MouseClicked(evt);
            }
        });

        item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item8MouseClicked(evt);
            }
        });

        item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item9MouseClicked(evt);
            }
        });

        item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        item10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item10MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Selecionado:");
        jLabel14.setToolTipText("");

        textoItemSelecionado.setText("Nenhum");

        botaoPegarItem.setText("Pegar");
        botaoPegarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPegarItemActionPerformed(evt);
            }
        });

        botaoInfoItem.setText("Info");
        botaoInfoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInfoItemActionPerformed(evt);
            }
        });

        botaoComprar.setText("Comprar");
        botaoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarActionPerformed(evt);
            }
        });

        labelPreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPreco.setText("Preço:");

        precoItem.setText("100");

        javax.swing.GroupLayout panelItensLayout = new javax.swing.GroupLayout(panelItens);
        panelItens.setLayout(panelItensLayout);
        panelItensLayout.setHorizontalGroup(
            panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelItensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelItensLayout.createSequentialGroup()
                        .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelItensLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoItemSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(labelPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(precoItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelItensLayout.createSequentialGroup()
                        .addComponent(botaoComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoPegarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoInfoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelItensLayout.createSequentialGroup()
                        .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(item10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        panelItensLayout.setVerticalGroup(
            panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelItensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoInfoItem)
                        .addComponent(botaoPegarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelItensLayout.createSequentialGroup()
                        .addGroup(panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botaoComprar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precoItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoItemSelecionado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelItensLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        textoInfo.setColumns(20);
        textoInfo.setRows(5);
        textoInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informação"));
        textoInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoInfoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(textoInfo);

        panelIrDirecao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle de Direção", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        botaoIrNorte.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoIrNorte.setText("Ir Norte");
        botaoIrNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIrNorteActionPerformed(evt);
            }
        });

        botaoIrSul.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoIrSul.setText("Ir Sul");
        botaoIrSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIrSulActionPerformed(evt);
            }
        });

        botaoIrOeste.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoIrOeste.setText("Ir Oeste");
        botaoIrOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIrOesteActionPerformed(evt);
            }
        });

        botaoIrLeste.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoIrLeste.setText("Ir Leste");
        botaoIrLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIrLesteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIrDirecaoLayout = new javax.swing.GroupLayout(panelIrDirecao);
        panelIrDirecao.setLayout(panelIrDirecaoLayout);
        panelIrDirecaoLayout.setHorizontalGroup(
            panelIrDirecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIrDirecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIrDirecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoIrNorte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoIrSul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelIrDirecaoLayout.createSequentialGroup()
                        .addComponent(botaoIrOeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoIrLeste)))
                .addContainerGap())
        );
        panelIrDirecaoLayout.setVerticalGroup(
            panelIrDirecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIrDirecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoIrNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIrDirecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoIrOeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoIrLeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoIrSul, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Vida do Herói:");

        barraDeVida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        barraDeVida.setForeground(new java.awt.Color(0, 0, 0));
        barraDeVida.setToolTipText("50");
        barraDeVida.setValue(50);
        barraDeVida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        barraDeVida.setPreferredSize(new java.awt.Dimension(155, 16));
        barraDeVida.setRequestFocusEnabled(false);
        barraDeVida.setString("50");
        barraDeVida.setStringPainted(true);
        barraDeVida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraDeVidaMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ataque:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Defesa:");

        labelAtaque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAtaque.setForeground(new java.awt.Color(0, 0, 255));
        labelAtaque.setText("99 ");

        labelDefesa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelDefesa.setForeground(new java.awt.Color(0, 0, 255));
        labelDefesa.setText("99");

        labelAtaqueDobrado.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        labelAtaqueDobrado.setText("(Dobrado por x Turnos)");

        labelColeteRepelenteAtivo.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        labelColeteRepelenteAtivo.setText("(Repelente ativo - Dano p/ Inseto nulo)");

        labelDinheiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDinheiro.setForeground(new java.awt.Color(0, 153, 51));
        labelDinheiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDinheiro.setText("$ 250");
        labelDinheiro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInfoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraDeVida, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelIrDirecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDefesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(labelAtaqueDobrado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelColeteRepelenteAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(barraDeVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelIrDirecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelAtaque)
                                .addComponent(labelAtaqueDobrado))
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(labelDinheiro)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelDefesa)
                            .addComponent(labelColeteRepelenteAtivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPersonagensItens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMochilaHeroi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPersonagensItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelMochilaHeroi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        perguntarFechar();
    }//GEN-LAST:event_formWindowClosing

    private void personagem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personagem1MouseClicked
        
        if(this.contadorModoDeus==0)
            this.contadorModoDeus=1;
        else
            this.contadorModoDeus=0;
        
        if(listaPers.size()>=1){
            this.textoPersonagemSelecionado.setText(listaPers.get(0));
            
            //Personagem per = this.listaPersonagens.get(0); 
            //if(per instanceof VilaoNormal)
            //    this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoNormal) per).pegaDinheiro()+"\n\n");
            //if(per instanceof VilaoChefao)
            //    this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoChefao) per).pegaDinheiro()+"\n\n");
            
            this.personagem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.personagem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_personagem1MouseClicked

    private void personagem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personagem2MouseClicked
        if(listaPers.size()>=2){
            this.textoPersonagemSelecionado.setText(listaPers.get(1));
            
            /*
            Personagem per = this.listaPersonagens.get(1); 
            if(per instanceof VilaoNormal)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoNormal) per).pegaDinheiro()+"\n\n");
            if(per instanceof VilaoChefao)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoChefao) per).pegaDinheiro()+"\n\n");
            */
            this.personagem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.personagem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_personagem2MouseClicked

    private void personagem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personagem3MouseClicked
        if(listaPers.size()>=3){
            this.textoPersonagemSelecionado.setText(listaPers.get(2));

            /*
            Personagem per = this.listaPersonagens.get(2); 
            if(per instanceof VilaoNormal)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoNormal) per).pegaDinheiro()+"\n\n");
            if(per instanceof VilaoChefao)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoChefao) per).pegaDinheiro()+"\n\n");
            */
            this.personagem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.personagem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_personagem3MouseClicked

    private void personagem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personagem4MouseClicked
        if(listaPers.size()>=4){
            this.textoPersonagemSelecionado.setText(listaPers.get(3));
            /*
            Personagem per = this.listaPersonagens.get(3); 
            if(per instanceof VilaoNormal)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoNormal) per).pegaDinheiro()+"\n\n");
            if(per instanceof VilaoChefao)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoChefao) per).pegaDinheiro()+"\n\n");
            */  
            this.personagem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.personagem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_personagem4MouseClicked

    private void personagem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personagem5MouseClicked
        if(listaPers.size()>=5){
            this.textoPersonagemSelecionado.setText(listaPers.get(4));
            /*
            Personagem per = this.listaPersonagens.get(4); 
            if(per instanceof VilaoNormal)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoNormal) per).pegaDinheiro()+"\n\n");
            if(per instanceof VilaoChefao)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoChefao) per).pegaDinheiro()+"\n\n");
            */
            this.personagem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.personagem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_personagem5MouseClicked

    private void personagem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personagem6MouseClicked
        if(listaPers.size()>=6){
            this.textoPersonagemSelecionado.setText(listaPers.get(5));
            /*
            Personagem per = this.listaPersonagens.get(5); 
            if(per instanceof VilaoNormal)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoNormal) per).pegaDinheiro()+"\n\n");
            if(per instanceof VilaoChefao)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoChefao) per).pegaDinheiro()+"\n\n");
            */
            this.personagem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.personagem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_personagem6MouseClicked

    private void personagem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personagem7MouseClicked
        if(listaPers.size()>=7){
            this.textoPersonagemSelecionado.setText(listaPers.get(6));
            /*
            Personagem per = this.listaPersonagens.get(6); 
            if(per instanceof VilaoNormal)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoNormal) per).pegaDinheiro()+"\n\n");
            if(per instanceof VilaoChefao)
                this.textoInfo.append("Energia de "+per.pegaNome()+": "+per.pegaEnergia()+"\nDinheiro: "+((VilaoChefao) per).pegaDinheiro()+"\n\n");
            */
            this.personagem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.personagem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.personagem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_personagem7MouseClicked

    private void botaoAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtacarActionPerformed
        if(this.textoPersonagemSelecionado.getText().equals("Nenhum"))
           JOptionPane.showMessageDialog(this,"Selecione um personagem para atacar.","Erro",JOptionPane.ERROR_MESSAGE);   
        else
            processaComando("atacar",this.textoPersonagemSelecionado.getText());
        
        atualizaGeral(1);
    }//GEN-LAST:event_botaoAtacarActionPerformed

    private void item1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item1MouseClicked
        
        if(this.contadorModoDeus==1)
            this.contadorModoDeus=2;
        else
            this.contadorModoDeus=0;
        
        if(this.listaItens.size()>=1){
            this.textoItemSelecionado.setText(listaItens.get(0));
            
            if(this.mochilaComerciante.size() > 0){
                precoItem.setVisible(true);
                labelPreco.setVisible(true);
                precoItem.setText(String.valueOf(this.mochilaComerciante.get(0).getValor())+"$");
            }
            
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item1MouseClicked

    private void item2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item2MouseClicked
        if(this.listaItens.size()>=2){
            this.textoItemSelecionado.setText(listaItens.get(1));
            
            if(this.mochilaComerciante.size() > 0){
                precoItem.setVisible(true);
                labelPreco.setVisible(true);
                precoItem.setText(String.valueOf(this.mochilaComerciante.get(1).getValor()+"$"));
            }
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item2MouseClicked

    private void item3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item3MouseClicked
       if(this.listaItens.size()>=3){
            this.textoItemSelecionado.setText(listaItens.get(2));
            
            if(this.mochilaComerciante.size() > 0){
                precoItem.setVisible(true);
                labelPreco.setVisible(true);
                precoItem.setText(String.valueOf(this.mochilaComerciante.get(2).getValor()+"$"));
            }
            
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item3MouseClicked

    private void item4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item4MouseClicked
       if(this.listaItens.size()>=4){
            this.textoItemSelecionado.setText(listaItens.get(3));

            if(this.mochilaComerciante.size() > 0){
            precoItem.setVisible(true);
            labelPreco.setVisible(true);
            precoItem.setText(String.valueOf(this.mochilaComerciante.get(3).getValor()+"$"));
            }
            
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item4MouseClicked

    private void item5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item5MouseClicked
       if(this.listaItens.size()>=5){
            this.textoItemSelecionado.setText(listaItens.get(4));
            if(this.mochilaComerciante.size() > 0){
            precoItem.setVisible(true);
            labelPreco.setVisible(true);
            precoItem.setText(String.valueOf(this.mochilaComerciante.get(4).getValor()+"$"));
            }
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item5MouseClicked

    private void item6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item6MouseClicked
        if(this.listaItens.size()>=6){
            this.textoItemSelecionado.setText(listaItens.get(5));
            if(this.mochilaComerciante.size() > 0){
            precoItem.setVisible(true);
            labelPreco.setVisible(true);
            precoItem.setText(String.valueOf(this.mochilaComerciante.get(5).getValor()+"$"));
            }
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item6MouseClicked

    private void item7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item7MouseClicked
        if(this.listaItens.size()>=7){
            this.textoItemSelecionado.setText(listaItens.get(6));
            if(this.mochilaComerciante.size() > 0){
            precoItem.setVisible(true);
            labelPreco.setVisible(true);
            precoItem.setText(String.valueOf(this.mochilaComerciante.get(6).getValor()+"$"));
            }
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item7MouseClicked

    private void item8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item8MouseClicked
        if(this.listaItens.size()>=8){
            this.textoItemSelecionado.setText(listaItens.get(7));
            if(this.mochilaComerciante.size() > 0){
            precoItem.setVisible(true);
            labelPreco.setVisible(true);
            precoItem.setText(String.valueOf(this.mochilaComerciante.get(7).getValor()+"$"));
            }
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item8MouseClicked

    private void item9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item9MouseClicked
        if(this.listaItens.size()>=9){
            this.textoItemSelecionado.setText(listaItens.get(8));
            if(this.mochilaComerciante.size() > 0){
            precoItem.setVisible(true);
            labelPreco.setVisible(true);
            precoItem.setText(String.valueOf(this.mochilaComerciante.get(8).getValor()+"$"));
            }
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item9MouseClicked

    private void item10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item10MouseClicked
        if(this.listaItens.size()>=10){
            this.textoItemSelecionado.setText(listaItens.get(9));
            if(this.mochilaComerciante.size() > 0){
            precoItem.setVisible(true);
            labelPreco.setVisible(true);
            precoItem.setText(String.valueOf(this.mochilaComerciante.get(9).getValor()+"$"));
            }
            this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_item10MouseClicked

    private void botaoPegarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPegarItemActionPerformed
        if(this.textoItemSelecionado.getText().equals("Nenhum"))
           JOptionPane.showMessageDialog(this,"Selecione um item para pegar.","Erro",JOptionPane.ERROR_MESSAGE);   
        else
            processaComando("pegar",this.textoItemSelecionado.getText());
        
        atualizaGeral(0);
    }//GEN-LAST:event_botaoPegarItemActionPerformed

    private void itemMochila1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila1MouseClicked
        
        if(this.contadorModoDeus==2)
            this.contadorModoDeus=3;
        else
            this.contadorModoDeus=0;
        
        if(this.mochilaHeroi.size()>=1){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(0).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(0).getTamanho()));
            
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila1MouseClicked

    private void itemMochila2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila2MouseClicked
        if(this.mochilaHeroi.size()>=2){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(1).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(1).getTamanho()));
            
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila2MouseClicked

    private void itemMochila3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila3MouseClicked
        if(this.mochilaHeroi.size()>=3){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(2).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(2).getTamanho()));
            
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila3MouseClicked

    private void itemMochila4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila4MouseClicked
        if(this.mochilaHeroi.size()>=4){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(3).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(3).getTamanho()));
            
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila4MouseClicked

    private void itemMochila5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila5MouseClicked
        if(this.mochilaHeroi.size()>=5){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(4).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(4).getTamanho()));
            
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila5MouseClicked

    private void itemMochila6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila6MouseClicked
       if(this.mochilaHeroi.size()>=6){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(5).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(5).getTamanho()));
            
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila6MouseClicked

    private void itemMochila7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila7MouseClicked
        if(this.mochilaHeroi.size()>=7){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(6).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(6).getTamanho()));
            
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila7MouseClicked

    private void itemMochila8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila8MouseClicked
       if(this.mochilaHeroi.size()>=8){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(7).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(7).getTamanho()));
            
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila8MouseClicked

    private void itemMochila9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila9MouseClicked
       if(this.mochilaHeroi.size()>=9){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(8).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(8).getTamanho()));
            
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila9MouseClicked

    private void itemMochila10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila10MouseClicked
        if(this.mochilaHeroi.size()>=10){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(9).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(9).getTamanho()));
            
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila10MouseClicked

    private void itemMochila11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila11MouseClicked
        if(this.mochilaHeroi.size()>=11){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(10).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(10).getTamanho()));
            
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila11MouseClicked

    private void itemMochila12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila12MouseClicked
        if(this.mochilaHeroi.size()>=12){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(11).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(11).getTamanho()));
            
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila12MouseClicked

    private void itemMochila13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila13MouseClicked
       if(this.mochilaHeroi.size()>=13){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(12).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(12).getTamanho()));
            
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila13MouseClicked

    private void itemMochila14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila14MouseClicked
        if(this.mochilaHeroi.size()>=14){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(13).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(13).getTamanho()));
            
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila14MouseClicked

    private void itemMochila15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila15MouseClicked
        if(this.mochilaHeroi.size()>=15){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(14).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(14).getTamanho()));
            
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila15MouseClicked

    private void itemMochila16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila16MouseClicked
        if(this.mochilaHeroi.size()>=16){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(15).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(15).getTamanho()));
            
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila16MouseClicked

    private void itemMochila17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila17MouseClicked
       if(this.mochilaHeroi.size()>=17){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(16).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(16).getTamanho()));
            
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila17MouseClicked

    private void itemMochila18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila18MouseClicked
        if(this.mochilaHeroi.size()>=18){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(17).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(17).getTamanho()));
            
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila18MouseClicked

    private void itemMochila19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila19MouseClicked
        if(this.mochilaHeroi.size()>=19){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(18).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(18).getTamanho()));
            
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila19MouseClicked

    private void itemMochila20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila20MouseClicked
       if(this.mochilaHeroi.size()>=20){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(19).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(19).getTamanho()));
            
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila20MouseClicked

    private void itemMochila21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila21MouseClicked
       if(this.mochilaHeroi.size()>=21){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(20).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(20).getTamanho()));
            
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila21MouseClicked

    private void itemMochila22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila22MouseClicked
        if(this.mochilaHeroi.size()>=22){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(21).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(21).getTamanho()));
            
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila22MouseClicked

    private void itemMochila23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila23MouseClicked
        if(this.mochilaHeroi.size()>=23){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(22).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(22).getTamanho()));
            
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila23MouseClicked

    private void itemMochila24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila24MouseClicked
        if(this.mochilaHeroi.size()>=24){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(23).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(23).getTamanho()));
            
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila24MouseClicked

    private void itemMochila25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila25MouseClicked
        if(this.mochilaHeroi.size()>=25){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(24).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(24).getTamanho()));
            
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila25MouseClicked

    private void itemMochila26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila26MouseClicked
        if(this.mochilaHeroi.size()>=26){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(25).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(25).getTamanho()));
            
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila26MouseClicked

    private void itemMochila27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila27MouseClicked
        if(this.mochilaHeroi.size()>=27){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(26).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(26).getTamanho()));
            
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila27MouseClicked

    private void itemMochila28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila28MouseClicked
        if(this.mochilaHeroi.size()>=28){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(27).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(27).getTamanho()));
            
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila28MouseClicked

    private void itemMochila29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila29MouseClicked
       if(this.mochilaHeroi.size()>=29){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(28).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(28).getTamanho()));
            
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila29MouseClicked

    private void itemMochila30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMochila30MouseClicked
        if(this.contadorModoDeus==3){
            Game.modoDeus = true;
            this.barraDeVida.setString("Modo Deus Ativo");
            }
        else
            this.contadorModoDeus=0;
        
        if(this.mochilaHeroi.size()>=30){
            this.textoItemMochilaSelecionado.setText(mochilaHeroi.get(29).getNomeItem());
            this.textoTamanhoItemMochila.setText(String.valueOf(mochilaHeroi.get(29).getTamanho()));

            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        }
    }//GEN-LAST:event_itemMochila30MouseClicked

    private void botaoVenderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVenderItemActionPerformed
        if(this.textoItemMochilaSelecionado.getText().equals("Nenhum"))
           JOptionPane.showMessageDialog(this,"Selecione um item para vender.","Erro",JOptionPane.ERROR_MESSAGE);   
        else{
            if(this.textoItemMochilaSelecionado.getText().equals("Dinheiro"))
               JOptionPane.showMessageDialog(this,"Você não pode vender seu precioso dinheiro.","Erro",JOptionPane.ERROR_MESSAGE);  
            else{
                    Item item = game.heroi.getMochila().procuraItemMochila(this.textoItemMochilaSelecionado.getText());
                    int n = JOptionPane.showConfirmDialog(this,"Deseja vender o item "+item.getNomeItem()+" por "+ item.getValor()+"$ ?","Vender?",JOptionPane.YES_NO_OPTION);
                    if(n==0)
                        processaComando("vender",this.textoItemMochilaSelecionado.getText());
            }    
            
            }
        atualizaGeral(0);
    }//GEN-LAST:event_botaoVenderItemActionPerformed

    private void botaoInfoItemMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInfoItemMochilaActionPerformed
        if(this.textoItemMochilaSelecionado.getText().equals("Nenhum"))
           JOptionPane.showMessageDialog(this,"Selecione um item para mostrar a informação.","Erro",JOptionPane.ERROR_MESSAGE);   
        else{
            Item item = this.todosItensPossiveis.procuraItemMochila(textoItemMochilaSelecionado.getText());
            if(item != null)
                processaComando("info",item.getNomeItem());
        }
        atualizaGeral(3);
    }//GEN-LAST:event_botaoInfoItemMochilaActionPerformed

    private void botaoUsarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUsarItemActionPerformed
        if(this.textoItemMochilaSelecionado.getText().equals("Nenhum"))
           JOptionPane.showMessageDialog(this,"Selecione um item para usar.","Erro",JOptionPane.ERROR_MESSAGE);   
        else
            processaComando("usar",this.textoItemMochilaSelecionado.getText());
        
        atualizaGeral(0);
    }//GEN-LAST:event_botaoUsarItemActionPerformed

    private void botaoFalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFalarActionPerformed
        if(this.textoPersonagemSelecionado.getText().equals("Nenhum"))
           JOptionPane.showMessageDialog(this,"Selecione um personagem para falar.","Erro",JOptionPane.ERROR_MESSAGE);   
        else{
            if(this.textoPersonagemSelecionado.getText().equals("Comerciante") || this.textoPersonagemSelecionado.getText().equals("Bibliotecario") ){
                montaMochilaComerciante(this.textoPersonagemSelecionado.getText());
            }else{
                processaComando("falar",this.textoPersonagemSelecionado.getText());
            }
            
           }
        
        //atualizaGeral(0);
    }//GEN-LAST:event_botaoFalarActionPerformed

    private void botaoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarActionPerformed
        if(this.textoItemSelecionado.getText().equals("Nenhum"))
           JOptionPane.showMessageDialog(this,"Selecione um item para comprar.","Erro",JOptionPane.ERROR_MESSAGE);   
        else
            processaComando("comprar",this.textoItemSelecionado.getText());
        
        atualizaGeral(2);
    }//GEN-LAST:event_botaoComprarActionPerformed

    private void botaoInfoPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInfoPersonagemActionPerformed
        if(this.textoPersonagemSelecionado.getText().equals("Nenhum"))
           JOptionPane.showMessageDialog(this,"Selecione um personagem para mostrar a informação.","Erro",JOptionPane.ERROR_MESSAGE);   
        else
            processaComando("info",this.textoPersonagemSelecionado.getText());
        
        atualizaGeral(3);
    }//GEN-LAST:event_botaoInfoPersonagemActionPerformed

    private void botaoInfoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInfoItemActionPerformed
        if(this.textoItemSelecionado.getText().equals("Nenhum"))
           JOptionPane.showMessageDialog(this,"Selecione um item para mostrar a informação.","Erro",JOptionPane.ERROR_MESSAGE);   
        else{
            Item item = this.todosItensPossiveis.procuraItemMochila(textoItemSelecionado.getText());
            if(item != null)
                processaComando("info",item.getNomeItem());
        }
        atualizaGeral(3);
    }//GEN-LAST:event_botaoInfoItemActionPerformed

    private void barraDeVidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraDeVidaMouseClicked
        Game.modoDeus = false;
        atualizaGeral(0);
    }//GEN-LAST:event_barraDeVidaMouseClicked

    private void textoInfoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoInfoKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                processaComando("ir","oeste");
                atualizaGeral(0);
                break;
            case KeyEvent.VK_RIGHT:
                processaComando("ir","leste");
                atualizaGeral(0);
                break;
            case KeyEvent.VK_UP:
                processaComando("ir","norte");
                atualizaGeral(0);
                break;
            case KeyEvent.VK_DOWN:
                processaComando("ir","sul");
                atualizaGeral(0);
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_textoInfoKeyPressed

    private void botaoIrLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIrLesteActionPerformed
        processaComando("ir","leste");
        atualizaGeral(0);
    }//GEN-LAST:event_botaoIrLesteActionPerformed

    private void botaoIrOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIrOesteActionPerformed
        processaComando("ir","oeste");
        atualizaGeral(0);
    }//GEN-LAST:event_botaoIrOesteActionPerformed

    private void botaoIrSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIrSulActionPerformed
        processaComando("ir","sul");
        atualizaGeral(0);
    }//GEN-LAST:event_botaoIrSulActionPerformed

    private void botaoIrNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIrNorteActionPerformed
        processaComando("ir","norte");
        atualizaGeral(0);
    }//GEN-LAST:event_botaoIrNorteActionPerformed
    
    private void montaMochilaComerciante(String nome){
        
       Comerciante co = (Comerciante)game.currentRoom.getCharacter(nome);
       Mochila mo = co.getMochila();
       
        atualizaImgsItens(mo.getArrayMochila());
    }
    
    private void resetaSelecaoItem(){
        this.textoItemSelecionado.setText("Nenhum");
               
        this.item1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.item2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.item3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.item4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.item5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.item6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.item7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.item8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.item9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.item10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
    }
    
    private void resetaSelecaoItemMochila(){
        this.textoItemMochilaSelecionado.setText("Nenhum");
        this.textoTamanhoItemMochila.setText("0");
               
            this.itemMochila1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
            this.itemMochila30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
    }
    
    private void resetaSelecaoPersonagem(){
        this.textoPersonagemSelecionado.setText("Nenhum");

        this.personagem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.personagem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.personagem3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.personagem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.personagem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.personagem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
        this.personagem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,0), 1, true));
    }
    //Botão OK: processaComando(this.textoComando.getText());
    public void processaComando(String comando1,String comando2){
        boolean finalizado;
        String comando=null;
        if(comando2 != null)
            comando = comando1+" "+comando2;
        else
            comando = comando1;
        
        Command command = parser.receiveCommand(comando);
         
        finalizado = game.processCommand(command);
       
        if(finalizado){
            String[] options = {"Sim","Não"};
            int opcao;
            if(this.entradaJogo != null){
                opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo sair? \n Você perderá XP!", "AVISO",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
                if(opcao == 0)
                    game.desistiu = true;
            }
                else{
                opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo sair?", "AVISO",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
                
                if(opcao == 0){
                
                    if(janelaInfo != null)
                        this.janelaInfo.dispose();

                    this.dispose();

                    if(this.janelaMenu == null)
                        this.janelaLogin.setVisible(true);
                    else
                        this.janelaMenu.setVisible(true);
                }
            }
               
        }
         
    }
    
    private void perguntarFechar(){
        processaComando("sair",null);
    }
    
    public void atualizaGeral(int x){
        
        this.contadorModoDeus=0;
        
        if(x!=4){
            if(x!=1 && x!=3)
            this.textoInfo.setText("");
        
            //this.mochilaComerciante = new ArrayList();

            atualizaImgMapa();
            atualizaImgsPersonagens();
            atualizaImgsItens(null);
            atualizaImgsMochila();
            atualizaInfoHeroi();
            atualizaAtqDfsMsgs();
            atualizaMochilaMsgs();
            if(x!=1)
                resetaSelecaoPersonagem();
            resetaSelecaoItem();
            if(x==2)
                atualizaImgsItens(this.mochilaComerciante);

            resetaSelecaoItemMochila();

            precoItem.setVisible(false);
            labelPreco.setVisible(false);
        }else
            atualizaInfoHeroi();
        
            
        
    }
    
    private void atualizaImgsItens(ArrayList<Item> listaI){
        
        if(listaI == null){
            HashMap<String,Item> listaItensSala = game.currentRoom.getListaItens();
            Map <String,String> lista = (Map) listaItensSala;
            listaItens = new ArrayList();

            for(String nome : lista.keySet()){
                listaItens.add(nome);
            }
        }else{
            this.mochilaComerciante = listaI;
            for(Item X: listaI)
                listaItens.add(X.getNomeItem());
        }
       
        
        this.item1.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.item2.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.item3.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.item4.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.item5.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.item6.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.item7.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.item8.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.item9.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.item10.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        
        if(listaItens.size() >= 1){
            this.item1.setIcon(decideImagemItem(listaItens.get(0)));
        }
        if(listaItens.size() >= 2){
            this.item2.setIcon(decideImagemItem(listaItens.get(1)));
        }
        if(listaItens.size() >= 3){
            this.item3.setIcon(decideImagemItem(listaItens.get(2)));
        }
        if(listaItens.size() >= 4){
            this.item4.setIcon(decideImagemItem(listaItens.get(3)));
        }
        if(listaItens.size() >= 5){
            this.item5.setIcon(decideImagemItem(listaItens.get(4)));
        }
        if(listaItens.size() >= 6){
            this.item6.setIcon(decideImagemItem(listaItens.get(5)));
        }
        if(listaItens.size() >= 7){
            this.item7.setIcon(decideImagemItem(listaItens.get(6)));
        }
        if(listaItens.size() >= 8){
            this.item8.setIcon(decideImagemItem(listaItens.get(7)));
        }
        if(listaItens.size() >= 9){
            this.item9.setIcon(decideImagemItem(listaItens.get(8)));
        }
        if(listaItens.size() >= 10){
            this.item10.setIcon(decideImagemItem(listaItens.get(9)));
        }
    }
    
    public ImageIcon decideImagemItem(String nome){
        switch (nome) {
            case "Agua":
                return new ImageIcon(getClass().getResource("/imgs/Consumiveis/agua.jpg"));
            case "Cafe":
                return new ImageIcon(getClass().getResource("/imgs/Consumiveis/cafe.jpg"));
            case "Barra de Cereal":
                return new ImageIcon(getClass().getResource("/imgs/Consumiveis/cereal.jpg"));
            case "Passagem para Casa":
                return new ImageIcon(getClass().getResource("/imgs/Consumiveis/passagemCasa.jpg"));
            case "Ticket do RU":
                return new ImageIcon(getClass().getResource("/imgs/Consumiveis/ticketRU.jpg"));
            //------------------------------------------------------------
            case "Repelente":
                return new ImageIcon(getClass().getResource("/imgs/repelente.jpg"));
            case "Colete":
                return new ImageIcon(getClass().getResource("/imgs/colete.jpg"));
            case "Dinheiro":
                return new ImageIcon(getClass().getResource("/imgs/dinheiro.jpg"));
            case "Mochila Media":
                return new ImageIcon(getClass().getResource("/imgs/mochila.jpg"));
            //------------------------------------------------------------
            case "Chave 1 - Prof. CD":
                return new ImageIcon(getClass().getResource("/imgs/Chaves/chave1.jpg")); 
            case "Chave 2 - Prof. Programacao":
                return new ImageIcon(getClass().getResource("/imgs/Chaves/chave2.jpg"));
            case "Chave 3 - Prof. Calculo":
                return new ImageIcon(getClass().getResource("/imgs/Chaves/chave3.jpg"));
            case "Chave 4 - Prof. Fisica":
                return new ImageIcon(getClass().getResource("/imgs/Chaves/chave4.jpg"));
            //------------------------------------------------------------
            case "Livro de CD":
                return new ImageIcon(getClass().getResource("/imgs/Livros/livroCD.jpg")); 
            case "Livro de Programacao":
                return new ImageIcon(getClass().getResource("/imgs/Livros/livroProgramacao.jpg"));
            case "Livro de Calculo":
                return new ImageIcon(getClass().getResource("/imgs/Livros/livroCalculo.jpg"));
            case "Livro de Fisica":
                return new ImageIcon(getClass().getResource("/imgs/Livros/livroFisica.jpg"));
            //------------------------------------------------------------
            case "Bermuda":
                return new ImageIcon(getClass().getResource("/imgs/roupas/bermuda.jpg")); 
            case "Regata":
                return new ImageIcon(getClass().getResource("/imgs/roupas/regata.jpg"));
            case "Chinelo":
                return new ImageIcon(getClass().getResource("/imgs/roupas/chinelo.jpg"));
            case "Camisa Social":
                return new ImageIcon(getClass().getResource("/imgs/roupas/camisaSocial.jpg"));
            case "Calca Social":
                return new ImageIcon(getClass().getResource("/imgs/roupas/calcaSocial.jpg")); 
            case "Sapato":
                return new ImageIcon(getClass().getResource("/imgs/roupas/sapato.jpg"));
            default:
                return new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg"));
        }
    }
    /**
     * Atualiza as informações do heroi.
     */
    private void atualizaInfoHeroi(){
        this.labelLugarAtual.setText("Você está "+ game.currentRoom.getShortDescription()+".");
        this.labelDinheiro.setText("$ "+ String.valueOf(heroi.getMochila().getDinheiro()));
        this.barraDeVida.setMaximum(heroi.getMaxEnergia());
        this.barraDeVida.setValue(heroi.pegaEnergia());
        if(Game.modoDeus)
            this.barraDeVida.setString("Modo Deus Ativo");
        else
            this.barraDeVida.setString(String.valueOf(heroi.pegaEnergia()));
    }
    /**
     * Atualiza labels de ataque,defesa e mensagens referentes aos danos dobrados, de colete e de repelente.
     */
    private void atualizaAtqDfsMsgs(){
        this.labelAtaque.setText(String.valueOf(heroi.getPoderAtaque()));
        this.labelDefesa.setText(String.valueOf(heroi.getPoderDefesa()));
        
        if(heroi.estaContadorAtivo()){
            this.labelAtaqueDobrado.setVisible(true);
            this.labelAtaqueDobrado.setText("(Dobrado por "+heroi.getContadorTemp()+" turnos)");
        }else{
            this.labelAtaqueDobrado.setVisible(false);
            }
        
        if(heroi.getMochila().estaRepelenteAtivo()){
                this.labelColeteRepelenteAtivo.setVisible(true);
                this.labelColeteRepelenteAtivo.setText("(Repelente ativo - Dano p/ Inseto pela metade)");
        }else
            this.labelColeteRepelenteAtivo.setVisible(false);
        
        
        if(heroi.getColete() != null ){
            if(heroi.getColete().estaAtivo()){
                this.labelColeteRepelenteAtivo.setText("(Colete ativo - Dano nulo)");
                this.labelColeteRepelenteAtivo.setVisible(true);
            }
        }
    
    }
    /**
     * atualiza informações da mochila.
     */
    private void atualizaMochilaMsgs(){
        this.labelCapacidade.setText(String.valueOf(heroi.getMochila().getTamanhoMochila()));
        this.labelEspacoOcupado.setText(String.valueOf(heroi.getMochila().getEspacoUsadoMochila()));
        
        if(heroi.getColete() != null){
            this.barraColete.setVisible(true);
            this.barraColete.setString(String.valueOf(heroi.getColete().getDuracao()));
            this.barraColete.setMaximum(heroi.getColete().getDuracaoMaxima());
            this.barraColete.setValue(heroi.getColete().getDuracao());
            this.labelColete.setVisible(true);
        }else{
            this.labelColete.setVisible(false);
            this.barraColete.setVisible(false);
        }
        
        if(heroi.getMochila().estaRepelenteAtivo()){
            this.barraRepelente.setVisible(true);
            this.barraRepelente.setString(String.valueOf(heroi.getMochila().getTempoRepelente()));
            this.barraRepelente.setMaximum(5);
            this.barraRepelente.setValue(heroi.getMochila().getTempoRepelente());
            this.barraRepelente.setVisible(true);
        }else{
            this.labelRepelente.setVisible(false);
            this.barraRepelente.setVisible(false);
        }
  
    }
    
    private void atualizaImgsMochila(){
        
        this.mochilaHeroi = game.heroi.getMochila().getArrayMochila();
        
        this.itemMochila1.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila2.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila3.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila4.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila5.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila6.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila7.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila8.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila9.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila10.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila11.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila12.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila13.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila14.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila15.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila16.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila17.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila18.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila19.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila20.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila21.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila22.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila23.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila24.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila25.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila26.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila27.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila28.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila29.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        this.itemMochila30.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio50.jpg")));
        
        if(mochilaHeroi.size() >= 1){
            this.itemMochila1.setIcon(decideImagemItem(mochilaHeroi.get(0).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 2){
            this.itemMochila2.setIcon(decideImagemItem(mochilaHeroi.get(1).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 3){
            this.itemMochila3.setIcon(decideImagemItem(mochilaHeroi.get(2).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 4){
            this.itemMochila4.setIcon(decideImagemItem(mochilaHeroi.get(3).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 5){
            this.itemMochila5.setIcon(decideImagemItem(mochilaHeroi.get(4).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 6){
            this.itemMochila6.setIcon(decideImagemItem(mochilaHeroi.get(5).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 7){
            this.itemMochila7.setIcon(decideImagemItem(mochilaHeroi.get(6).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 8){
            this.itemMochila8.setIcon(decideImagemItem(mochilaHeroi.get(7).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 9){
            this.itemMochila9.setIcon(decideImagemItem(mochilaHeroi.get(8).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 10){
            this.itemMochila10.setIcon(decideImagemItem(mochilaHeroi.get(9).getNomeItem()));
        }
        
        if(mochilaHeroi.size() >= 11){
            this.itemMochila11.setIcon(decideImagemItem(mochilaHeroi.get(10).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 12){
            this.itemMochila12.setIcon(decideImagemItem(mochilaHeroi.get(11).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 13){
            this.itemMochila13.setIcon(decideImagemItem(mochilaHeroi.get(12).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 14){
            this.itemMochila14.setIcon(decideImagemItem(mochilaHeroi.get(13).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 15){
            this.itemMochila15.setIcon(decideImagemItem(mochilaHeroi.get(14).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 16){
            this.itemMochila16.setIcon(decideImagemItem(mochilaHeroi.get(15).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 17){
            this.itemMochila17.setIcon(decideImagemItem(mochilaHeroi.get(16).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 18){
            this.itemMochila18.setIcon(decideImagemItem(mochilaHeroi.get(17).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 19){
            this.itemMochila19.setIcon(decideImagemItem(mochilaHeroi.get(18).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 20){
            this.itemMochila20.setIcon(decideImagemItem(mochilaHeroi.get(19).getNomeItem()));
        }
        
        if(mochilaHeroi.size() >= 21){
            this.itemMochila21.setIcon(decideImagemItem(mochilaHeroi.get(20).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 22){
            this.itemMochila22.setIcon(decideImagemItem(mochilaHeroi.get(21).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 23){
            this.itemMochila23.setIcon(decideImagemItem(mochilaHeroi.get(22).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 24){
            this.itemMochila24.setIcon(decideImagemItem(mochilaHeroi.get(23).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 25){
            this.itemMochila25.setIcon(decideImagemItem(mochilaHeroi.get(24).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 26){
            this.itemMochila26.setIcon(decideImagemItem(mochilaHeroi.get(25).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 27){
            this.itemMochila27.setIcon(decideImagemItem(mochilaHeroi.get(26).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 28){
            this.itemMochila28.setIcon(decideImagemItem(mochilaHeroi.get(27).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 29){
            this.itemMochila29.setIcon(decideImagemItem(mochilaHeroi.get(28).getNomeItem()));
        }
        if(mochilaHeroi.size() >= 30){
            this.itemMochila30.setIcon(decideImagemItem(mochilaHeroi.get(29).getNomeItem()));
        }
        
    }
    
    private void atualizaImgsPersonagens(){
        HashMap<String,Personagem> listaPersonagensSala = game.currentRoom.getListaPersonagens();
        Map <String,String> lista = (Map) listaPersonagensSala;
        listaPers = new ArrayList();
        this.listaPersonagens = new ArrayList();
        
        for(Personagem per: listaPersonagensSala.values()){
            this.listaPersonagens.add(per);
        }
        for(String nome : lista.keySet()){
            listaPers.add(nome);
        }
        
        this.personagem1.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio70.jpg")));
        this.personagem2.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio70.jpg")));
        this.personagem3.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio70.jpg")));
        this.personagem4.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio70.jpg")));
        this.personagem5.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio70.jpg")));
        this.personagem6.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio70.jpg")));
        this.personagem7.setIcon(new ImageIcon(getClass().getResource("/imgs/blocoVazio70.jpg")));
        
        if(listaPers.size() >= 1){
            this.personagem1.setIcon(decideImagemPersonagem(listaPers.get(0)));
        }
        if(listaPers.size() >= 2){
            this.personagem2.setIcon(decideImagemPersonagem(listaPers.get(1)));
        }
        if(listaPers.size() >= 3){
            this.personagem3.setIcon(decideImagemPersonagem(listaPers.get(2)));
        }
        if(listaPers.size() >= 4){
            this.personagem4.setIcon(decideImagemPersonagem(listaPers.get(3)));
        }
        if(listaPers.size() >= 5){
            this.personagem5.setIcon(decideImagemPersonagem(listaPers.get(4)));
        }
        if(listaPers.size() >= 6){
            this.personagem6.setIcon(decideImagemPersonagem(listaPers.get(5)));
        }
        if(listaPers.size() >= 7){
            this.personagem7.setIcon(decideImagemPersonagem(listaPers.get(6)));
        }
        
    }
    
    private void atualizaImgMapa(){
        if(this.entradaJogo != null)
            return;
        
        String desc = game.currentRoom.getShortDescription();
        if(game.heroi.getMochila().temTodasChaves1()){
            switch (desc) {
                case "na sala secreta 1":
                    this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/salaSecreta1.png")));
                    break;
                case "na sala secreta 2":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/salaSecreta2.png")));
                     break;
                case "na sala 101":
                    this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-101.png")));
                    break;
                case "na sala 102":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-102.png")));
                     break;
                case "na sala 103":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-103.png")));
                     break;
                case "na sala 104":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-104.png")));
                     break;
                case "na rua":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-Rua.png")));
                     break;
                case "na biblioteca":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-bibli.png")));
                     break;
                case "no corredor da computação":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-Corredor.png")));
                     break;
                case "no laboratório de programação":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-labProg.png")));
                     break;
                case "no laboratório de circuitos digitais":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-CD.png")));
                     break;
                case "na sala de cálculo":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-calculo.png")));
                     break;
                case "na sala de física":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-fisica.png")));
                     break;
                case "na cantina":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-Cantina.png")));
                     break;
                case "no banheiro":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Aberto-banheiro.png")));
                     break;
            }
        }else{
            switch (desc) {
                case "na sala secreta 1":
                    this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/salaSecreta1.png")));
                    break;
                case "na sala secreta 2":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/salaSecreta2.png")));
                     break;
                case "na sala 101":
                    this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-101.png")));
                    break;
                case "na sala 102":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-102.png")));
                     break;
                case "na sala 103":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-103.png")));
                     break;
                case "na sala 104":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-104.png")));
                     break;
                case "na rua":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-Rua.png")));
                     break;
                case "na biblioteca":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-bibli.png")));
                     break;
                case "no corredor da computação":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-Corredor.png")));
                     break;
                case "no laboratório de programação":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-labProg.png")));
                     break;
                case "no laboratório de circuitos digitais":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-CD.png")));
                     break;
                case "na sala de cálculo":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-calculo.png")));
                     break;
                case "na sala de física":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-fisica.png")));
                     break;
                case "na cantina":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-Cantina.png")));
                     break;
                case "no banheiro":
                     this.imagemMapa.setIcon(new ImageIcon(getClass().getResource("/imgs/Mapas/level1/mapa1-Fechado-banheiro.png")));
                     break;
            }
        }
    }
    
    private ImageIcon decideImagemPersonagem(String nome){
        switch (nome) {
            case "Rato":
                return new ImageIcon(getClass().getResource("/imgs/viloesNormais/rato.jpg"));
            case "Aranha":
                return new ImageIcon(getClass().getResource("/imgs/viloesNormais/aranha.jpg"));
            case "Barata":
                return new ImageIcon(getClass().getResource("/imgs/viloesNormais/barata.jpg"));
            case "Centopeia":
                return new ImageIcon(getClass().getResource("/imgs/viloesNormais/centopeia.jpg"));
            case "Cobra":
                return new ImageIcon(getClass().getResource("/imgs/viloesNormais/cobra.jpg"));
            case "Morcego":
                return new ImageIcon(getClass().getResource("/imgs/viloesNormais/morcego.jpg"));
            case "Escorpiao":
                return new ImageIcon(getClass().getResource("/imgs/viloesNormais/escorpiao.jpg"));
            //------------------------------------------------------------
            case "Professor de Circuitos Digitais":
                return new ImageIcon(getClass().getResource("/imgs/viloesChefoes/Prof3.jpg"));
            case "Professor de Programacao":
                return new ImageIcon(getClass().getResource("/imgs/viloesChefoes/Prof1.jpg")); 
            case "Professor de Calculo":
                return new ImageIcon(getClass().getResource("/imgs/viloesChefoes/Prof2.jpg"));
            case "Professor de Fisica":
                return new ImageIcon(getClass().getResource("/imgs/viloesChefoes/Prof4.jpg"));
            //------------------------------------------------------------
            case "Comerciante":
                return new ImageIcon(getClass().getResource("/imgs/Comerciantes/comerciante.jpg")); 
            case "Bibliotecario":
                return new ImageIcon(getClass().getResource("/imgs/Comerciantes/bibliotecario.jpg"));
            default:
                return new ImageIcon(getClass().getResource("/imgs/blocoVazio70.jpg"));
             
        }
       
    }
    
    public int getDinheiroAtual(){
        return heroi.getMochila().getDinheiro();
    }
    
    public int getVidaAtual(){
        return this.barraDeVida.getValue();
    }
    
    public String getLocalAtual(){
        return game.currentRoom.getShortDescription();
    }
    
    public int getNumChavesAtual(){
        return heroi.getMochila().getNumeroChaves();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraColete;
    public javax.swing.JProgressBar barraDeVida;
    private javax.swing.JProgressBar barraRepelente;
    private javax.swing.JButton botaoAtacar;
    public javax.swing.JButton botaoComprar;
    private javax.swing.JButton botaoFalar;
    private javax.swing.JButton botaoInfoItem;
    private javax.swing.JButton botaoInfoItemMochila;
    private javax.swing.JButton botaoInfoPersonagem;
    private javax.swing.JButton botaoIrLeste;
    private javax.swing.JButton botaoIrNorte;
    private javax.swing.JButton botaoIrOeste;
    private javax.swing.JButton botaoIrSul;
    public javax.swing.JButton botaoPegarItem;
    private javax.swing.JButton botaoUsarItem;
    private javax.swing.JButton botaoVenderItem;
    public javax.swing.JLabel imagemMapa;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel item10;
    private javax.swing.JLabel item2;
    private javax.swing.JLabel item3;
    private javax.swing.JLabel item4;
    private javax.swing.JLabel item5;
    private javax.swing.JLabel item6;
    private javax.swing.JLabel item7;
    private javax.swing.JLabel item8;
    private javax.swing.JLabel item9;
    private javax.swing.JLabel itemMochila1;
    private javax.swing.JLabel itemMochila10;
    private javax.swing.JLabel itemMochila11;
    private javax.swing.JLabel itemMochila12;
    private javax.swing.JLabel itemMochila13;
    private javax.swing.JLabel itemMochila14;
    private javax.swing.JLabel itemMochila15;
    private javax.swing.JLabel itemMochila16;
    private javax.swing.JLabel itemMochila17;
    private javax.swing.JLabel itemMochila18;
    private javax.swing.JLabel itemMochila19;
    private javax.swing.JLabel itemMochila2;
    private javax.swing.JLabel itemMochila20;
    private javax.swing.JLabel itemMochila21;
    private javax.swing.JLabel itemMochila22;
    private javax.swing.JLabel itemMochila23;
    private javax.swing.JLabel itemMochila24;
    private javax.swing.JLabel itemMochila25;
    private javax.swing.JLabel itemMochila26;
    private javax.swing.JLabel itemMochila27;
    private javax.swing.JLabel itemMochila28;
    private javax.swing.JLabel itemMochila29;
    private javax.swing.JLabel itemMochila3;
    private javax.swing.JLabel itemMochila30;
    private javax.swing.JLabel itemMochila4;
    private javax.swing.JLabel itemMochila5;
    private javax.swing.JLabel itemMochila6;
    private javax.swing.JLabel itemMochila7;
    private javax.swing.JLabel itemMochila8;
    private javax.swing.JLabel itemMochila9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAtaque;
    private javax.swing.JLabel labelAtaqueDobrado;
    private javax.swing.JLabel labelCapacidade;
    private javax.swing.JLabel labelColete;
    private javax.swing.JLabel labelColeteRepelenteAtivo;
    private javax.swing.JLabel labelDefesa;
    private javax.swing.JLabel labelDinheiro;
    private javax.swing.JLabel labelEspacoOcupado;
    private javax.swing.JLabel labelLugarAtual;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelRepelente;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelIrDirecao;
    private javax.swing.JPanel panelItens;
    private javax.swing.JPanel panelMapa;
    private javax.swing.JPanel panelMochilaHeroi;
    private javax.swing.JPanel panelPersonagensItens;
    private javax.swing.JLabel personagem1;
    private javax.swing.JLabel personagem2;
    private javax.swing.JLabel personagem3;
    private javax.swing.JLabel personagem4;
    private javax.swing.JLabel personagem5;
    private javax.swing.JLabel personagem6;
    private javax.swing.JLabel personagem7;
    private javax.swing.JLabel precoItem;
    public javax.swing.JTextArea textoInfo;
    private javax.swing.JLabel textoItemMochilaSelecionado;
    private javax.swing.JLabel textoItemSelecionado;
    private javax.swing.JLabel textoPersonagemSelecionado;
    private javax.swing.JLabel textoTamanhoItemMochila;
    // End of variables declaration//GEN-END:variables
}
