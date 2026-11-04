package l;

import android.content.DialogInterface;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14449 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC2386 f45464;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC7364 f45465;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC7364 f45466;

    public C14449() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        if (!c12915.m31986("local") && !c12915.m31986("zip") && !c12915.m31986(b.k)) {
            return false;
        }
        if (c12915.m31981() == 2) {
            return true;
        }
        C8614 c8614M31974 = c12915.m31974();
        return c8614M31974.m23228("local") || c8614M31974.m23228("zip") || c8614M31974.m23228(b.k);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        String name;
        String name2;
        if (c12915.m31981() == 2) {
            List listM31982 = c12915.m31982();
            this.f45464 = (InterfaceC2386) listM31982.get(0);
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM31982.get(1);
            AbstractC7364 abstractC7364M31987 = c12915.m31987();
            this.f45465 = abstractC7364M31987;
            this.f45466 = abstractC7364M31987;
            C8614 c8614M31983 = c12915.m31983();
            InterfaceC2386 interfaceC2387 = this.f45464;
            m34881(c8614M31983, interfaceC2387, interfaceC2386, interfaceC2387.getPath(), interfaceC2386.getPath(), true);
            return;
        }
        C8614 c8614M31974 = c12915.m31974();
        this.f45464 = c12915.m31989();
        InterfaceC2386 interfaceC2386M23235 = c8614M31974.m23235();
        this.f45466 = c12915.m31987();
        this.f45465 = c8614M31974.m23213();
        boolean zM23195 = c12915.m31983().m23195();
        if (this.f45464.getName().equals(interfaceC2386M23235.getName())) {
            int i = R.string.MT_Protector;
            String strM49059 = C21576.m49059(zM23195 ? R.string.MT_Protector : R.string.MT_Protector, this.f45464.getName());
            if (!zM23195) {
                i = R.string.MT_Protector;
            }
            name2 = C21576.m49059(i, interfaceC2386M23235.getName());
            name = strM49059;
        } else {
            name = this.f45464.getName();
            name2 = interfaceC2386M23235.getName();
        }
        if (zM23195) {
            m34881(c12915.m31983(), this.f45464, interfaceC2386M23235, name, name2, false);
        } else {
            m34881(c12915.m31983(), interfaceC2386M23235, this.f45464, name2, name, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34881(final C8614 c8614, InterfaceC2386 interfaceC2386, InterfaceC2386 interfaceC2387, String str, String str2, boolean z) {
        View viewM40395 = c8614.m23233().m40395(R.layout.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(m25627());
        final C15941 c15941 = new C15941();
        c15941.f51762 = interfaceC2386;
        c15941.f51764 = interfaceC2387;
        c15941.f51763 = str;
        c15941.f51765 = str2;
        if (z && interfaceC2386.getTime() > interfaceC2387.getTime()) {
            InterfaceC2386 interfaceC2388 = c15941.f51762;
            c15941.f51762 = c15941.f51764;
            c15941.f51764 = interfaceC2388;
            String str3 = c15941.f51763;
            c15941.f51763 = c15941.f51765;
            c15941.f51765 = str3;
        }
        c23255.m54107(true);
        c23256.m54107(true);
        C2459.m8293(c15941.f51763, c15941.f51765, c23255, c23256);
        Main mainM23233 = c8614.m23233();
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(mainM23233);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧ۟ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C14449.m34882(this.f36051, c8614, c15941);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016().m22440().setOnClickListener(new View.OnClickListener() { // from class: l.᩻۟ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15941 c15942 = c15941;
                InterfaceC2386 interfaceC2389 = c15942.f51762;
                c15942.f51762 = c15942.f51764;
                c15942.f51764 = interfaceC2389;
                String str4 = c15942.f51763;
                String str5 = c15942.f51765;
                c15942.f51763 = str5;
                c15942.f51765 = str4;
                C2459.m8293(str5, str4, c23255, c23256);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34882(C14449 c14449, C8614 c8614, C15941 c15941) {
        AbstractC7364 abstractC7364;
        AbstractC7364 abstractC7365;
        InterfaceC2386 interfaceC2386 = c15941.f51762;
        InterfaceC2386 interfaceC2387 = c15941.f51764;
        if (interfaceC2386 == c14449.f45464) {
            abstractC7364 = c14449.f45466;
            abstractC7365 = c14449.f45465;
        } else {
            abstractC7364 = c14449.f45465;
            abstractC7365 = c14449.f45466;
        }
        abstractC7364.mo18797(interfaceC2386);
        abstractC7365.mo18797(interfaceC2387);
        AbstractC22044 abstractC22044M33163 = C13485.m33163(c8614, c14449.m25627(), "txt");
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C4009.class);
        c8458.m22719("saveAsPath", abstractC22044M33163.mo4294());
        c8458.m22719("inputPath1", interfaceC2386.getPath());
        c8458.m22719("inputPath2", interfaceC2387.getPath());
        if (interfaceC2386 instanceof C2494) {
            c8458.m22719("zipPath1", ((C15102) abstractC7364).m36371());
        } else if (interfaceC2386 instanceof AbstractC20042) {
            c8458.m22721("statelessVisitor1", abstractC7364.mo10174().m20838());
        } else if (!(interfaceC2386 instanceof C6004)) {
            throw new RuntimeException();
        }
        if (interfaceC2387 instanceof C2494) {
            c8458.m22719("zipPath2", ((C15102) abstractC7365).m36371());
        } else if (interfaceC2387 instanceof AbstractC20042) {
            c8458.m22721("statelessVisitor2", abstractC7365.mo10174().m20838());
        } else if (!(interfaceC2387 instanceof C6004)) {
            throw new RuntimeException();
        }
        c8458.m22714();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34880(HashMap map, C22941 c22941, String str, boolean z) throws IOException {
        C15481 c15481M51723 = c22941.m51723();
        String str2 = str.substring(1) + "/";
        for (C8002 c8002 : c22941.m51742()) {
            if (!c8002.isDirectory()) {
                if (c8002.m21856()) {
                    throw new IOException("Comparing encrypted files is not supported");
                }
                if (c8002.getName().startsWith(str2)) {
                    String strSubstring = c8002.getName().substring(str2.length());
                    map.put(strSubstring, new C16687(strSubstring, c8002.getSize(), z ? Long.valueOf(c8002.getSize()) : new C11048(c8002), c15481M51723, c8002));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34878(HashMap map, AbstractC22044 abstractC22044, boolean z, String str, C4009 c4009) {
        AbstractC20970 c17433;
        AbstractC20970 c20417;
        if (c4009.mo924()) {
            return;
        }
        for (AbstractC22044 abstractC22045 : abstractC22044.mo4299(true)) {
            if (abstractC22045.mo4281()) {
                StringBuilder sbM27333 = C10732.m27333(str);
                sbM27333.append(abstractC22045.getName());
                sbM27333.append("/");
                String string = sbM27333.toString();
                if (z) {
                    map.put(string, new C23401(0L, abstractC22045, string));
                }
                m34878(map, abstractC22045, z, string, c4009);
            } else {
                StringBuilder sbM27334 = C10732.m27333(str);
                sbM27334.append(abstractC22045.getName());
                String string2 = sbM27334.toString();
                if (abstractC22045.mo4297()) {
                    c17433 = new C23401(abstractC22045.mo4285(), abstractC22045, string2);
                } else {
                    String strM49852 = abstractC22045.m49852();
                    if (strM49852 != null) {
                        c20417 = new C3263(string2, strM49852);
                    } else {
                        try {
                            C12212 c12212M34875 = m34875(abstractC22045);
                            char c = c12212M34875.f39244;
                            if (c == '-' || c == 'd') {
                                c17433 = new C23401(abstractC22045.mo4285(), abstractC22045, string2);
                            } else {
                                c20417 = new C20417(string2, c12212M34875);
                            }
                        } catch (IOException e) {
                            c17433 = new C17433(string2, e);
                        }
                    }
                    c17433 = c20417;
                }
                map.put(string2, c17433);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12212 m34875(AbstractC22044 abstractC22044) throws IOException {
        if (abstractC22044.mo19981()) {
            C21694 c21694M19978 = abstractC22044.mo19983().m19978();
            char cM18964 = C6790.m18964(c21694M19978.m49241());
            if (cM18964 != 'l') {
                return new C12212((cM18964 == 'b' || cM18964 == 'c') ? c21694M19978.m49234() : 0L, cM18964);
            }
            throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to resolve special link target: ")));
        }
        if (!abstractC22044.mo4295()) {
            throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to inspect special file: ")));
        }
        try {
            StructStat structStatLstat = Os.lstat(abstractC22044.mo4275().mo4278());
            char cM18965 = C6790.m18964(structStatLstat.st_mode);
            if (cM18965 != 'l') {
                return new C12212((cM18965 == 'b' || cM18965 == 'c') ? structStatLstat.st_rdev : 0L, cM18965);
            }
            throw new IOException("Unable to resolve special link target: " + abstractC22044.mo4294());
        } catch (ErrnoException e) {
            throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to inspect special file: ")), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m34883(String str) {
        C6178 c6178 = new C6178();
        c6178.writeByte(77);
        c6178.writeByte(84);
        c6178.writeByte(0);
        c6178.writeByte(76);
        c6178.writeByte(73);
        c6178.writeByte(78);
        c6178.writeByte(75);
        c6178.writeByte(1);
        c6178.writeByte(78);
        c6178.writeByte(79);
        c6178.writeByte(84);
        c6178.writeByte(2);
        c6178.writeByte(69);
        c6178.writeByte(88);
        c6178.writeByte(73);
        c6178.writeByte(83);
        c6178.writeByte(84);
        c6178.writeByte(83);
        c6178.writeByte(3);
        c6178.m17800(str);
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34876(HashMap map, AbstractC18881 abstractC18881, String str, boolean z, String str2, C4009 c4009) {
        if (c4009.mo924()) {
            return;
        }
        for (InterfaceC2386 interfaceC2386 : abstractC18881.mo20830(str, true)) {
            if (interfaceC2386.isDirectory()) {
                StringBuilder sbM27333 = C10732.m27333(str2);
                sbM27333.append(interfaceC2386.getName());
                sbM27333.append("/");
                String string = sbM27333.toString();
                if (z) {
                    map.put(string, new C6247(abstractC18881, interfaceC2386, string, 0L));
                }
                m34876(map, abstractC18881, interfaceC2386.getPath(), z, string, c4009);
            } else {
                StringBuilder sbM27334 = C10732.m27333(str2);
                sbM27334.append(interfaceC2386.getName());
                String string2 = sbM27334.toString();
                map.put(string2, new C6247(abstractC18881, interfaceC2386, string2, interfaceC2386.getSize()));
            }
        }
    }
}
