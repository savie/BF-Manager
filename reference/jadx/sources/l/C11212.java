package l;

import android.content.DialogInterface;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11212 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC11462 f37931;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC2557 f37932;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC11462 f37933;

    public C11212() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        if (!c21422.m47974("local") && !c21422.m47974("zip") && !c21422.m47974(b.k)) {
            return false;
        }
        if (c21422.m47975() == 2) {
            return true;
        }
        C11545 c11545M47970 = c21422.m47970();
        return c11545M47970.m28814("local") || c11545M47970.m28814("zip") || c11545M47970.m28814(b.k);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        String name;
        String name2;
        if (c21422.m47975() == 2) {
            List listM47979 = c21422.m47979();
            this.f37932 = (InterfaceC2557) listM47979.get(0);
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM47979.get(1);
            AbstractC11462 abstractC11462M47960 = c21422.m47960();
            this.f37931 = abstractC11462M47960;
            this.f37933 = abstractC11462M47960;
            C11545 c11545M47965 = c21422.m47965();
            InterfaceC2557 interfaceC2558 = this.f37932;
            m28162(c11545M47965, interfaceC2558, interfaceC2557, interfaceC2558.getPath(), interfaceC2557.getPath(), true);
            return;
        }
        C11545 c11545M47970 = c21422.m47970();
        this.f37932 = c21422.m47981();
        InterfaceC2557 interfaceC2557M28797 = c11545M47970.m28797();
        this.f37933 = c21422.m47960();
        this.f37931 = c11545M47970.m28817();
        boolean zM28762 = c21422.m47965().m28762();
        if (this.f37932.getName().equals(interfaceC2557M28797.getName())) {
            int i = R.string.MT_Protector;
            String strM39264 = C16737.m39264(zM28762 ? R.string.MT_Protector : R.string.MT_Protector, this.f37932.getName());
            if (!zM28762) {
                i = R.string.MT_Protector;
            }
            name2 = C16737.m39264(i, interfaceC2557M28797.getName());
            name = strM39264;
        } else {
            name = this.f37932.getName();
            name2 = interfaceC2557M28797.getName();
        }
        if (zM28762) {
            m28162(c21422.m47965(), this.f37932, interfaceC2557M28797, name, name2, false);
        } else {
            m28162(c21422.m47965(), interfaceC2557M28797, this.f37932, name2, name, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28162(final C11545 c11545, InterfaceC2557 interfaceC2557, InterfaceC2557 interfaceC2558, String str, String str2, boolean z) {
        View viewM30995 = c11545.m28824().m30995(R.layout.MT_Protector);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(m12942());
        final C21089 c21089 = new C21089();
        c21089.f68710 = interfaceC2557;
        c21089.f68712 = interfaceC2558;
        c21089.f68711 = str;
        c21089.f68709 = str2;
        if (z && interfaceC2557.getTime() > interfaceC2558.getTime()) {
            InterfaceC2557 interfaceC2559 = c21089.f68710;
            c21089.f68710 = c21089.f68712;
            c21089.f68712 = interfaceC2559;
            String str3 = c21089.f68711;
            c21089.f68711 = c21089.f68709;
            c21089.f68709 = str3;
        }
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4388.m12238(c21089.f68711, c21089.f68709, editText, editText2);
        Main mainM28824 = c11545.m28824();
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(mainM28824);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵᩵᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C11212.m28161(this.f63176, c11545, c21089);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269().m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۡ᩵᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21089 c210810 = c21089;
                InterfaceC2557 interfaceC25510 = c210810.f68710;
                c210810.f68710 = c210810.f68712;
                c210810.f68712 = interfaceC25510;
                String str4 = c210810.f68711;
                String str5 = c210810.f68709;
                c210810.f68711 = str5;
                c210810.f68709 = str4;
                C4388.m12238(str5, str4, editText, editText2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28161(C11212 c11212, C11545 c11545, C21089 c21089) {
        AbstractC11462 abstractC11462;
        AbstractC11462 abstractC11463;
        InterfaceC2557 interfaceC2557 = c21089.f68710;
        InterfaceC2557 interfaceC2558 = c21089.f68712;
        if (interfaceC2557 == c11212.f37932) {
            abstractC11462 = c11212.f37933;
            abstractC11463 = c11212.f37931;
        } else {
            abstractC11462 = c11212.f37931;
            abstractC11463 = c11212.f37933;
        }
        abstractC11462.mo23627(interfaceC2557);
        abstractC11463.mo23627(interfaceC2558);
        AbstractC20745 abstractC20745M4734 = C1333.m4734(c11545, c11212.m12942(), "txt");
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C6272.class);
        c10142.m25768("saveAsPath", abstractC20745M4734.mo33986());
        c10142.m25768("inputPath1", interfaceC2557.getPath());
        c10142.m25768("inputPath2", interfaceC2558.getPath());
        if (interfaceC2557 instanceof C5696) {
            c10142.m25768("zipPath1", ((C13810) abstractC11462).m33624());
        } else if (interfaceC2557 instanceof AbstractC5362) {
            c10142.m25770("statelessVisitor1", abstractC11462.mo13029().m24619());
        } else if (!(interfaceC2557 instanceof C6794)) {
            throw new RuntimeException();
        }
        if (interfaceC2558 instanceof C5696) {
            c10142.m25768("zipPath2", ((C13810) abstractC11463).m33624());
        } else if (interfaceC2558 instanceof AbstractC5362) {
            c10142.m25770("statelessVisitor2", abstractC11463.mo13029().m24619());
        } else if (!(interfaceC2558 instanceof C6794)) {
            throw new RuntimeException();
        }
        c10142.m25763();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28156(HashMap map, C2455 c2455, String str, boolean z) throws IOException {
        C22212 c22212M7483 = c2455.m7483();
        String str2 = str.substring(1) + "/";
        for (C12107 c12107 : c2455.m7466()) {
            if (!c12107.isDirectory()) {
                if (c12107.m30133()) {
                    throw new IOException("Comparing encrypted files is not supported");
                }
                if (c12107.getName().startsWith(str2)) {
                    String strSubstring = c12107.getName().substring(str2.length());
                    map.put(strSubstring, new C10507(strSubstring, c12107.getSize(), z ? Long.valueOf(c12107.getSize()) : new C1023(c12107), c22212M7483, c12107));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28159(HashMap map, AbstractC20745 abstractC20745, boolean z, String str, C6272 c6272) {
        AbstractC19603 c7684;
        AbstractC19603 c0627;
        if (c6272.mo2357()) {
            return;
        }
        for (AbstractC20745 abstractC20746 : abstractC20745.mo33983(true)) {
            if (abstractC20746.mo33974()) {
                StringBuilder sbM23356 = C9023.m23356(str);
                sbM23356.append(abstractC20746.getName());
                sbM23356.append("/");
                String string = sbM23356.toString();
                if (z) {
                    map.put(string, new C16151(0L, abstractC20746, string));
                }
                m28159(map, abstractC20746, z, string, c6272);
            } else {
                StringBuilder sbM23357 = C9023.m23356(str);
                sbM23357.append(abstractC20746.getName());
                String string2 = sbM23357.toString();
                if (abstractC20746.mo33988()) {
                    c7684 = new C16151(abstractC20746.mo33964(), abstractC20746, string2);
                } else {
                    String strM46714 = abstractC20746.m46714();
                    if (strM46714 != null) {
                        c0627 = new C20384(string2, strM46714);
                    } else {
                        try {
                            C16856 c16856M28155 = m28155(abstractC20746);
                            char c = c16856M28155.f53921;
                            if (c == '-' || c == 'd') {
                                c7684 = new C16151(abstractC20746.mo33964(), abstractC20746, string2);
                            } else {
                                c0627 = new C0627(string2, c16856M28155);
                            }
                        } catch (IOException e) {
                            c7684 = new C7684(string2, e);
                        }
                    }
                    c7684 = c0627;
                }
                map.put(string2, c7684);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16856 m28155(AbstractC20745 abstractC20745) throws IOException {
        if (abstractC20745.mo33979()) {
            C5574 c5574M33984 = abstractC20745.mo33969().m33984();
            char cM33377 = C13672.m33377(c5574M33984.m15390());
            if (cM33377 != 'l') {
                return new C16856((cM33377 == 'b' || cM33377 == 'c') ? c5574M33984.m15396() : 0L, cM33377);
            }
            throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to resolve special link target: ")));
        }
        if (!abstractC20745.mo36912()) {
            throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to inspect special file: ")));
        }
        try {
            StructStat structStatLstat = Os.lstat(abstractC20745.mo36913().mo24643());
            char cM33378 = C13672.m33377(structStatLstat.st_mode);
            if (cM33378 != 'l') {
                return new C16856((cM33378 == 'b' || cM33378 == 'c') ? structStatLstat.st_rdev : 0L, cM33378);
            }
            throw new IOException("Unable to resolve special link target: " + abstractC20745.mo33986());
        } catch (ErrnoException e) {
            throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to inspect special file: ")), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28163(String str) {
        C11018 c11018 = new C11018();
        c11018.writeByte(77);
        c11018.writeByte(84);
        c11018.writeByte(0);
        c11018.writeByte(76);
        c11018.writeByte(73);
        c11018.writeByte(78);
        c11018.writeByte(75);
        c11018.writeByte(1);
        c11018.writeByte(78);
        c11018.writeByte(79);
        c11018.writeByte(84);
        c11018.writeByte(2);
        c11018.writeByte(69);
        c11018.writeByte(88);
        c11018.writeByte(73);
        c11018.writeByte(83);
        c11018.writeByte(84);
        c11018.writeByte(83);
        c11018.writeByte(3);
        c11018.m27786(str);
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28157(HashMap map, AbstractC12233 abstractC12233, String str, boolean z, String str2, C6272 c6272) {
        if (c6272.mo2357()) {
            return;
        }
        for (InterfaceC2557 interfaceC2557 : abstractC12233.mo10263(str, true)) {
            if (interfaceC2557.isDirectory()) {
                StringBuilder sbM23356 = C9023.m23356(str2);
                sbM23356.append(interfaceC2557.getName());
                sbM23356.append("/");
                String string = sbM23356.toString();
                if (z) {
                    map.put(string, new C12623(abstractC12233, interfaceC2557, string, 0L));
                }
                m28157(map, abstractC12233, interfaceC2557.getPath(), z, string, c6272);
            } else {
                StringBuilder sbM23357 = C9023.m23356(str2);
                sbM23357.append(interfaceC2557.getName());
                String string2 = sbM23357.toString();
                map.put(string2, new C12623(abstractC12233, interfaceC2557, string2, interfaceC2557.getSize()));
            }
        }
    }
}
