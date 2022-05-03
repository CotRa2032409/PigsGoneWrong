package com.example.pigsgonewrong;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class NextGen {

    //Attributs

    //Méthodes
    public NextGen() {

    }

    public Group dataminer(int niveau) {    //Reference à Binding of Isaac, crée les hitbox du sol
        Group collision = new Group();

        switch (niveau) {
            case 1: {
                collision = collision1();
            }
            case 2: {
                collision = collision2();
            }
            case 3: {
                collision = collision3();
            }
            default: {
                System.err.println("Je pense que tu devrais choisir un niveau... si tu veux jouer bien entendu");
            }
        }
        return collision;
    }

    public Group collision1() {
        Rectangle a = new Rectangle(0, 255, 50, 5);
        a.setFill(Color.RED);
        a.setRotate(5);

        Rectangle b = new Rectangle(43, 265, 55, 5);
        b.setFill(Color.ORANGE);
        b.setRotate(20);

        Rectangle c = new Rectangle(88, 298, 80, 5);
        c.setFill(Color.YELLOW);
        c.setRotate(35);

        Rectangle d = new Rectangle(140, 357, 80, 5);
        d.setRotate(63);
        d.setFill(Color.GREEN);

        Rectangle e = new Rectangle(180, 425, 75, 5);
        e.setRotate(58);
        e.setFill(Color.BLUE);

        Rectangle f = new Rectangle(220, 455, 100, 5);
        f.setRotate(15);
        f.setFill(Color.PURPLE);

        Rectangle g = new Rectangle(300, 465, 50, 5);
        g.setFill(Color.RED);

        Rectangle h = new Rectangle(345, 450, 60, 5);
        h.setRotate(-30);
        h.setFill(Color.ORANGE);

        Rectangle i = new Rectangle(399, 425, 50, 5);
        i.setRotate(-22);
        i.setFill(Color.YELLOW);

        Rectangle j = new Rectangle(447, 417, 50, 5);
        j.setRotate(5);
        j.setFill(Color.GREEN);

        Rectangle k = new Rectangle(495, 424, 35, 5);
        k.setRotate(15);
        k.setFill(Color.BLUE);

        Rectangle l = new Rectangle(525, 437, 30, 5);
        l.setRotate(35);
        l.setFill(Color.PURPLE);

        Rectangle m = new Rectangle(550, 450, 20, 5);
        m.setRotate(25);
        m.setFill(Color.RED);

        Rectangle n = new Rectangle(567, 460, 40, 5);
        n.setRotate(15);
        n.setFill(Color.ORANGE);

        Rectangle o = new Rectangle(605, 465, 30, 5);
        o.setRotate(0);
        o.setFill(Color.YELLOW);

        Rectangle p = new Rectangle(630, 455, 60, 5);
        p.setRotate(-20);
        p.setFill(Color.GREEN);

        Rectangle q = new Rectangle(685, 445, 35, 5);
        q.setRotate(-5);
        q.setFill(Color.BLUE);

        Rectangle r = new Rectangle(570, 590, 300, 5);
        r.setRotate(90);
        r.setFill(Color.PURPLE);

        Rectangle s = new Rectangle(680, 770, 100, 5);
        s.setRotate(70);
        s.setFill(Color.RED);

        Rectangle t = new Rectangle(700, 800, 100, 5);
        t.setRotate(0);
        t.setFill(Color.ORANGE);

        Rectangle u = new Rectangle(613, 658, 350, 5);
        u.setRotate(90);
        u.setFill(Color.YELLOW);

        Rectangle v = new Rectangle(785, 482, 15, 5);
        v.setRotate(0);
        v.setFill(Color.GREEN);

        Rectangle w = new Rectangle(795, 490, 30, 5);
        w.setRotate(30);
        w.setFill(Color.BLUE);

        Rectangle x = new Rectangle(820, 505, 60, 5);
        x.setRotate(15);
        x.setFill(Color.PURPLE);

        Rectangle y = new Rectangle(860, 510, 60, 5);
        y.setRotate(0);
        y.setFill(Color.RED);

        Rectangle z = new Rectangle(918, 518, 60, 5);
        z.setRotate(15);
        z.setFill(Color.ORANGE);

        Rectangle aa = new Rectangle(972, 533, 50, 5);
        aa.setRotate(20);
        aa.setFill(Color.YELLOW);

        Rectangle bb = new Rectangle(1015, 552, 35, 5);
        bb.setRotate(40);
        bb.setFill(Color.GREEN);

        Rectangle cc = new Rectangle(1025, 600, 90, 5);
        cc.setRotate(55);
        cc.setFill(Color.BLUE);

        Rectangle dd = new Rectangle(1087, 655, 60, 5);
        dd.setRotate(40);
        dd.setFill(Color.PURPLE);

        Rectangle ee = new Rectangle(1135, 680, 30, 5);
        ee.setRotate(25);
        ee.setFill(Color.RED);

        Rectangle ff = new Rectangle(1153, 715, 100, 5);
        ff.setRotate(35);
        ff.setFill(Color.ORANGE);

        Rectangle gg = new Rectangle(1200, 745, 100, 5);
        gg.setRotate(30);
        gg.setFill(Color.YELLOW);

        Rectangle hh = new Rectangle(1255, 763, 70, 5);
        hh.setRotate(15);
        hh.setFill(Color.GREEN);

        Rectangle ii = new Rectangle(1315, 775, 30, 5);
        ii.setRotate(25);
        ii.setFill(Color.BLUE);

        Rectangle jj = new Rectangle(1342, 784, 50, 5);
        jj.setRotate(5);
        jj.setFill(Color.PURPLE);

        Rectangle kk = new Rectangle(1390, 780, 30, 5);
        kk.setRotate(-20);
        kk.setFill(Color.RED);

        Rectangle ll = new Rectangle(1418, 775, 130, 5);
        ll.setRotate(0);
        ll.setFill(Color.ORANGE);


        return new Group(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, aa, bb, cc, dd, ee, ff, gg, hh, ii, jj, kk, ll);
    }

    public Group collision2() {
        Rectangle mm = new Rectangle(0, 245, 125, 5);
        mm.setFill(Color.RED);
        mm.setRotate(20);

        Rectangle nn = new Rectangle(113, 286, 70, 5);
        nn.setFill(Color.ORANGE);
        nn.setRotate(35);

        Rectangle oo = new Rectangle(150, 370, 180, 5);
        oo.setFill(Color.YELLOW);
        oo.setRotate(45);

        Rectangle pp = new Rectangle(260, 450, 150, 5);
        pp.setRotate(30);
        pp.setFill(Color.GREEN);

        Rectangle qq = new Rectangle(360, 470, 125, 5);
        qq.setRotate(3);
        qq.setFill(Color.BLUE);

        Rectangle rr = new Rectangle(480, 465, 50, 5);
        rr.setRotate(-20);
        rr.setFill(Color.PURPLE);

        Rectangle ss = new Rectangle(515, 425, 100, 5);
        ss.setRotate(-40);
        ss.setFill(Color.RED);

        Rectangle tt = new Rectangle(545, 380, 125, 5);
        tt.setRotate(-60);
        tt.setFill(Color.ORANGE);

        Rectangle uu = new Rectangle(632, 310, 50, 5);
        uu.setRotate(-40);
        uu.setFill(Color.YELLOW);

        Rectangle vv = new Rectangle(674, 280, 90, 5);
        vv.setRotate(-20);
        vv.setFill(Color.GREEN);

        Rectangle ww = new Rectangle(760, 266, 40, 5);
        ww.setRotate(0);
        ww.setFill(Color.BLUE);

        Rectangle xx = new Rectangle(795, 271, 20, 5);
        xx.setRotate(35);
        xx.setFill(Color.PURPLE);

        Rectangle yy = new Rectangle(788, 318, 100, 5);
        yy.setRotate(58);
        yy.setFill(Color.RED);

        Rectangle zz = new Rectangle(805, 440, 180, 5);
        zz.setRotate(68);
        zz.setFill(Color.ORANGE);

        Rectangle aaa = new Rectangle(915, 515, 30, 5);
        aaa.setRotate(45);
        aaa.setFill(Color.YELLOW);

        Rectangle bbb = new Rectangle(930, 527, 30, 5);
        bbb.setRotate(25);
        bbb.setFill(Color.GREEN);

        Rectangle ccc = new Rectangle(950, 555, 75, 5);
        ccc.setRotate(37);
        ccc.setFill(Color.BLUE);

        Rectangle ddd = new Rectangle(1015, 588, 60, 5);
        ddd.setRotate(20);
        ddd.setFill(Color.PURPLE);

        Rectangle eee = new Rectangle(970, 670, 150, 5);
        eee.setRotate(110);
        eee.setFill(Color.RED);

        Rectangle fff = new Rectangle(960, 800, 200, 5);
        fff.setRotate(60);
        fff.setFill(Color.ORANGE);

        Rectangle ggg = new Rectangle(1080, 850, 100, 5);
        ggg.setRotate(-20);
        ggg.setFill(Color.YELLOW);

        Rectangle hhh = new Rectangle(1145, 800, 100, 5);
        hhh.setRotate(-60);
        hhh.setFill(Color.GREEN);

        Rectangle iii = new Rectangle(1160, 750, 100, 5);
        iii.setRotate(-110);
        iii.setFill(Color.BLUE);

        Rectangle jjj = new Rectangle(1180, 720, 100, 5);
        jjj.setRotate(30);
        jjj.setFill(Color.PURPLE);

        Rectangle kkk = new Rectangle(1270, 758, 100, 5);
        kkk.setRotate(15);
        kkk.setFill(Color.RED);

        Rectangle lll = new Rectangle(1367, 770, 100, 5);
        lll.setRotate(0);
        lll.setFill(Color.ORANGE);

        Rectangle mmm = new Rectangle(1460, 775, 100, 5);
        mmm.setRotate(5);
        mmm.setFill(Color.YELLOW);

        return new Group(mm, nn, oo, pp, qq, rr, ss, tt, uu, vv, ww, xx, yy, zz, aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii, jjj, kkk, lll, mmm);
    }

    public Group collision3() {
        Rectangle nnn = new Rectangle(0, 200, 100, 5);
        nnn.setRotate(15);
        nnn.setFill(Color.RED);

        Rectangle ooo = new Rectangle(90, 235, 90, 5);
        ooo.setRotate(30);
        ooo.setFill(Color.ORANGE);

        Rectangle ppp = new Rectangle(170, 267, 30, 5);
        ppp.setRotate(40);
        ppp.setFill(Color.YELLOW);

        Rectangle qqq = new Rectangle(170, 320, 100, 5);
        qqq.setRotate(60);
        qqq.setFill(Color.GREEN);

        Rectangle rrr = new Rectangle(180, 350, 150, 5);
        rrr.setRotate(30);
        rrr.setFill(Color.BLUE);

        Rectangle sss = new Rectangle(190, 355, 150, 5);
        sss.setRotate(10);
        sss.setFill(Color.PURPLE);

        Rectangle ttt = new Rectangle(300, 360, 50, 5);
        ttt.setRotate(-10);
        ttt.setFill(Color.RED);

        Rectangle uuu = new Rectangle(320, 340, 100, 5);
        uuu.setRotate(-30);
        uuu.setFill(Color.ORANGE);

        Rectangle vvv = new Rectangle(400, 310, 30, 5);
        vvv.setRotate(-45);
        vvv.setFill(Color.YELLOW);

        Rectangle www = new Rectangle(400, 330, 50, 5);
        www.setRotate(90);
        www.setFill(Color.GREEN);

        Rectangle xxx = new Rectangle(390, 370, 50, 5);
        xxx.setRotate(120);
        xxx.setFill(Color.BLUE);

        Rectangle yyy = new Rectangle(350, 430, 100, 5);
        yyy.setRotate(90);
        yyy.setFill(Color.PURPLE);

        Rectangle zzz = new Rectangle(385, 490, 50, 5);
        zzz.setRotate(60);
        zzz.setFill(Color.RED);

        Rectangle aaaa = new Rectangle(405, 520, 100, 5);
        aaaa.setRotate(30);
        aaaa.setFill(Color.ORANGE);

        Rectangle bbbb = new Rectangle(490, 548, 75, 5);
        bbbb.setRotate(10);
        bbbb.setFill(Color.YELLOW);

        Rectangle cccc = new Rectangle(455, 618, 150, 5);
        cccc.setRotate(120);
        cccc.setFill(Color.GREEN);

        Rectangle dddd = new Rectangle(450, 720, 100, 5);
        dddd.setRotate(90);
        dddd.setFill(Color.BLUE);

        Rectangle eeee = new Rectangle(490, 780, 50, 5);
        eeee.setRotate(30);
        eeee.setFill(Color.PURPLE);

        Rectangle ffff = new Rectangle(443, 700, 250, 5);
        ffff.setRotate(-70);
        ffff.setFill(Color.RED);

        Rectangle gggg = new Rectangle(606, 597, 100, 5);
        gggg.setRotate(20);
        gggg.setFill(Color.ORANGE);

        Rectangle hhhh = new Rectangle(630, 607, 175, 5);
        hhhh.setRotate(3);
        hhhh.setFill(Color.YELLOW);

        Rectangle iiii = new Rectangle(795, 638, 110, 5);
        iiii.setRotate(30);
        iiii.setFill(Color.GREEN);

        Rectangle jjjj = new Rectangle(838, 710, 100, 5);
        jjjj.setRotate(90);
        jjjj.setFill(Color.BLUE);

        Rectangle kkkk = new Rectangle(880, 780, 50, 5);
        kkkk.setRotate(50);
        kkkk.setFill(Color.PURPLE);

        Rectangle llll = new Rectangle(900, 780, 75, 5);
        llll.setRotate(-30);
        llll.setFill(Color.RED);

        Rectangle mmmm = new Rectangle(930, 765, 50, 5);
        mmmm.setRotate(-60);
        mmmm.setFill(Color.ORANGE);

        Rectangle nnnn = new Rectangle(965, 740, 50, 5);
        nnnn.setRotate(-5);
        nnnn.setFill(Color.YELLOW);

        Rectangle oooo = new Rectangle(1010, 738, 100, 5);
        oooo.setRotate(0);
        oooo.setFill(Color.GREEN);

        Rectangle pppp = new Rectangle(1105, 742, 75, 5);
        pppp.setRotate(5);
        pppp.setFill(Color.BLUE);

        Rectangle qqqq = new Rectangle(1180, 745, 400, 5);
        qqqq.setRotate(0);
        qqqq.setFill(Color.PURPLE);

        //Terrain du haut
        Rectangle rrrr = new Rectangle(520, 250, 125, 5);
        rrrr.setRotate(-23);
        rrrr.setFill(Color.RED);

        Rectangle ssss = new Rectangle(640, 225, 170, 5);
        ssss.setRotate(0);
        ssss.setFill(Color.ORANGE);

        Rectangle tttt = new Rectangle(805, 242, 100, 5);
        tttt.setRotate(20);
        tttt.setFill(Color.YELLOW);

        Rectangle uuuu = new Rectangle(895, 283, 95, 5);
        uuuu.setRotate(30);
        uuuu.setFill(Color.GREEN);

        Rectangle vvvv = new Rectangle(970, 325, 40, 5);
        vvvv.setRotate(65);
        vvvv.setFill(Color.BLUE);

        Rectangle wwww = new Rectangle(990, 345, 30, 5);
        wwww.setRotate(40);
        wwww.setFill(Color.PURPLE);

        Rectangle xxxx = new Rectangle(990, 388, 75, 5);
        xxxx.setRotate(70);
        xxxx.setFill(Color.RED);

        Rectangle yyyy = new Rectangle(1019, 447, 50, 5);
        yyyy.setRotate(80);
        yyyy.setFill(Color.ORANGE);

        Rectangle zzzz = new Rectangle(1010, 510, 110, 5);
        zzzz.setRotate(67);
        zzzz.setFill(Color.YELLOW);

        Rectangle aaaaa = new Rectangle(1070, 570, 50, 5);
        aaaaa.setRotate(50);
        aaaaa.setFill(Color.GREEN);

        Rectangle bbbbb = new Rectangle(1080, 606, 150, 5);
        bbbbb.setRotate(25);
        bbbbb.setFill(Color.BLUE);

        Rectangle ccccc = new Rectangle(1200, 640, 70, 5);
        ccccc.setRotate(15);
        ccccc.setFill(Color.PURPLE);

        Rectangle ddddd = new Rectangle(510, 298, 60, 5);
        ddddd.setRotate(60);
        ddddd.setFill(Color.RED);

        Rectangle eeeee = new Rectangle(547, 345, 75, 5);
        eeeee.setRotate(35);
        eeeee.setFill(Color.ORANGE);

        Rectangle fffff = new Rectangle(597, 438, 325, 5);
        fffff.setRotate(26);
        fffff.setFill(Color.YELLOW);

        Rectangle ggggg = new Rectangle(895, 545, 150, 5);
        ggggg.setRotate(30);
        ggggg.setFill(Color.GREEN);

        Rectangle hhhhh = new Rectangle(1028, 612, 180, 5);
        hhhhh.setRotate(20);
        hhhhh.setFill(Color.BLUE);

        Rectangle iiiii = new Rectangle(1200, 645, 70, 5);
        iiiii.setRotate(5);
        iiiii.setFill(Color.PURPLE);

        return new Group(nnn, ooo, ppp, qqq, rrr, sss, ttt, uuu, vvv, www, xxx, yyy, zzz, aaaa, bbbb, cccc, dddd, eeee, ffff, gggg, hhhh, iiii, jjjj, kkkk, llll, mmmm, nnnn, oooo, pppp, qqqq, rrrr, ssss, tttt, uuuu, vvvv, wwww, xxxx, yyyy, zzzz, aaaaa, bbbbb, ccccc, ddddd, eeeee, fffff, ggggg, hhhhh, iiiii);

    }
}
