package l;

import android.os.Build;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘ᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4424 extends C1858 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C23816 f15866 = new C23816(0);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C8172 f15867 = new C8172(1);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f15870;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC3678 f15871;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f15873;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Predicate f15874;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f15875;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14864 f15876;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f15877;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f15878;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15872 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f15868 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f15869 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4424 m14050(String str, C18616 c18616, InterfaceC3678 interfaceC3678) {
        return m14049(str, c18616, interfaceC3678, f15866);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4424 m14049(String str, InterfaceC14864 interfaceC14864, InterfaceC3678 interfaceC3678, Predicate predicate) {
        boolean z = !C14584.m35214(str) && C17743.m41554(str) == null;
        return new C4424(str, interfaceC14864, z, z, interfaceC3678, predicate);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4424 m14051(String str, AbstractC18881 abstractC18881, InterfaceC14864 interfaceC14864, InterfaceC3678 interfaceC3678) {
        C4424 c4424 = new C4424(str, interfaceC14864, abstractC18881.mo35583(), false, interfaceC3678, f15866);
        c4424.f15869 = true;
        return c4424;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4424 m14052(InterfaceC3678 interfaceC3678) {
        return new C4424("", null, true, true, interfaceC3678, f15866);
    }

    public C4424(String str, InterfaceC14864 interfaceC14864, boolean z, boolean z2, InterfaceC3678 interfaceC3678, Predicate predicate) {
        this.f15877 = str;
        this.f15876 = interfaceC14864;
        this.f15878 = z;
        this.f15870 = z2;
        this.f15871 = interfaceC3678;
        this.f15874 = predicate;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m14082() {
        this.f15878 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14077() {
        this.f15870 = false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m14081() {
        this.f15873 = true;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m14078() {
        this.f15869 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14069(String str) {
        this.f15875 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14062(String[] strArr, AbstractC7629 abstractC7629, boolean z) throws IOException {
        for (String str : strArr) {
            InterfaceC2386 interfaceC2386M20843 = abstractC7629.m20843(str);
            m14054(interfaceC2386M20843, ((C13352) interfaceC2386M20843).getName(), abstractC7629, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14054(InterfaceC2386 interfaceC2386, String str, AbstractC7629 abstractC7629, boolean z) throws IOException {
        boolean z2 = false;
        boolean z3 = z && interfaceC2386.mo8107();
        try {
            if (interfaceC2386.isDirectory() && !z3) {
                z2 = true;
            }
            String strM35187 = C14584.m35187(str, z2);
            if (z3) {
                String strMo8112 = interfaceC2386.mo8112();
                if (strMo8112 == null) {
                    throw new IOException(C25272.m56409("Archive symbolic link target is missing: ", str));
                }
                C14584.m35202(strM35187, strMo8112);
            }
            if (interfaceC2386.isDirectory()) {
                for (InterfaceC2386 interfaceC2387 : abstractC7629.mo20830(interfaceC2386.getPath(), true)) {
                    String name = interfaceC2387.getName();
                    if (!strM35187.isEmpty()) {
                        name = C20196.m46451(strM35187, "/", name);
                    }
                    m14054(interfaceC2387, name, abstractC7629, z);
                }
            }
        } catch (IOException e) {
            String path = interfaceC2386.getPath();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            throw new IOException(C25272.m56409("Unsafe archive entry path: ", path), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14074(String[] strArr, AbstractC7629 abstractC7629, boolean z, boolean z2) throws IOException {
        AbstractC6662 c12627;
        int i;
        C9097 c9097Mo5155;
        String[] strArr2 = strArr;
        String str = this.f15875;
        if (str != null && strArr2.length != 1) {
            throw new IllegalStateException();
        }
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            ArrayList<AbstractC6662> arrayList = this.f15872;
            InterfaceC3678 interfaceC3678 = this.f15871;
            if (i2 < length) {
                String str2 = strArr2[i2];
                if (interfaceC3678.mo924()) {
                    return;
                }
                InterfaceC2386 interfaceC2386M20843 = abstractC7629.m20843(str2);
                String name = str != null ? str : ((C13352) interfaceC2386M20843).getName();
                C13352 c13352 = (C13352) interfaceC2386M20843;
                boolean zIsDirectory = c13352.isDirectory();
                if (z) {
                    name = C14584.m35187(name, zIsDirectory);
                }
                AbstractC22044 abstractC22044M35193 = C14584.m35193(this.f15877, name);
                boolean zMo2934 = abstractC22044M35193.mo2934();
                boolean z3 = this.f15870 && c13352.mo8107();
                boolean z4 = zMo2934 && z3 && this.f15873;
                if (zMo2934 && z3) {
                    if (!this.f15873) {
                        m14065(abstractC22044M35193.mo4294());
                        throw null;
                    }
                }
                if (c13352.isDirectory()) {
                    c12627 = new C20832();
                    if (zMo2934 && !z4) {
                        m14061(abstractC22044M35193);
                    }
                    i = length;
                } else {
                    c12627 = new C12627();
                    if (!zMo2934 || z4) {
                        i = length;
                    } else {
                        m14068(abstractC22044M35193);
                        int iM14048 = m14048(abstractC22044M35193, interfaceC2386M20843, name);
                        i = length;
                        InterfaceC14864 interfaceC14864 = this.f15876;
                        if (interfaceC14864.mo924()) {
                            interfaceC3678.mo2721();
                            return;
                        }
                        if (iM14048 != 1) {
                            if (iM14048 == 2) {
                                c12627.m18623();
                            } else if (this.f15878) {
                                C24523 c24523 = new C24523();
                                c24523.m54796(abstractC22044M35193);
                                c12627.m18611(c24523.m54795());
                            }
                            if (iM14048 == 0 && interfaceC14864.mo28695() && abstractC22044M35193.mo4292()) {
                                c12627.m18636(true);
                            }
                        }
                        i2++;
                        strArr2 = strArr;
                        str = str;
                        length = i;
                    }
                    c12627.m18608(c13352.getSize());
                    this.f6253 = c12627.m18622() + this.f6253;
                }
                c12627.m18638(name);
                c12627.m18633(c13352.getTime());
                c12627.m18614(z3);
                if (c12627.m18605()) {
                    c12627.m18609(c13352.mo8112());
                }
                if (this.f15878 && c12627.m18628() == null && (c9097Mo5155 = interfaceC2386M20843.mo5155()) != null) {
                    if (interfaceC2386M20843 instanceof C6004) {
                        if (C6004.m17446(c9097Mo5155)) {
                            if (!((C6004) interfaceC2386M20843).mo8093().mo49854()) {
                                try {
                                    c12627.m18611(new C6623(C14453.m34906(((C13352) interfaceC2386M20843).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c12627.m18611(new C6623(c9097Mo5155.m24243(), c9097Mo5155.m24242(), c9097Mo5155.m24246()));
                        }
                    } else {
                        c12627.m18611(new C6623(c9097Mo5155.m24243(), -1, -1));
                    }
                }
                c12627.m18618(str2);
                c12627.m18635(abstractC22044M35193);
                c12627.m18634(name);
                c12627.m18619(zMo2934);
                arrayList.add(c12627);
                this.f6251++;
                i2++;
                strArr2 = strArr;
                str = str;
                length = i;
            } else {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : arrayList) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (m14063(abstractC6662)) {
                        m14059(abstractC6662.mo18607(), abstractC7629, z);
                    }
                }
                if (z2) {
                    interfaceC3678.mo2722();
                    for (AbstractC6662 abstractC6663 : arrayList) {
                        if (abstractC6663.m18625()) {
                            m14064(abstractC6663.mo18607());
                        }
                    }
                }
                Collections.sort(arrayList, f15867);
                for (AbstractC6662 abstractC6664 : arrayList) {
                    if (abstractC6664.m18625()) {
                        abstractC6664.mo18607().m47637();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14059(C20832 c20832, AbstractC7629 abstractC7629, boolean z) throws IOException {
        AbstractC6662 c20833;
        C9097 c9097Mo5155;
        String strM18624 = c20832.m18624();
        Iterator it = abstractC7629.mo20830(c20832.m18604(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC3678 interfaceC3678 = this.f15871;
            if (!zHasNext) {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : c20832.f66705) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (m14063(abstractC6662)) {
                        m14059(abstractC6662.mo18607(), abstractC7629, z);
                    }
                }
                return;
            }
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC3678.mo924()) {
                return;
            }
            String name = interfaceC2386.getName();
            if (!strM18624.isEmpty()) {
                name = C20196.m46451(strM18624, "/", name);
            }
            boolean zIsDirectory = interfaceC2386.isDirectory();
            if (z) {
                name = C14584.m35187(name, zIsDirectory);
            }
            AbstractC22044 abstractC22044M35193 = C14584.m35193(this.f15877, name);
            boolean z2 = false;
            boolean z3 = c20832.m18630() && abstractC22044M35193.mo2934();
            boolean z4 = this.f15870 && interfaceC2386.mo8107();
            if (z3 && z4 && this.f15873) {
                z2 = true;
            }
            if (interfaceC2386.isDirectory()) {
                c20833 = new C20832();
                if (z3 && !z2) {
                    m14061(abstractC22044M35193);
                }
            } else {
                C12627 c12627 = new C12627();
                if (z3 && !z2) {
                    m14068(abstractC22044M35193);
                    int iM14048 = m14048(abstractC22044M35193, interfaceC2386, name);
                    InterfaceC14864 interfaceC14864 = this.f15876;
                    if (interfaceC14864.mo924()) {
                        interfaceC3678.mo2721();
                        return;
                    }
                    if (iM14048 == 1) {
                        c20832.f66706 = true;
                    } else {
                        if (iM14048 == 2) {
                            c12627.m18623();
                        } else {
                            C24523 c24523 = new C24523();
                            c24523.m54796(abstractC22044M35193);
                            c12627.m18611(c24523.m54795());
                        }
                        if (iM14048 == 0 && interfaceC14864.mo28695() && abstractC22044M35193.mo4292()) {
                            c12627.m18636(true);
                        }
                    }
                }
                c12627.m18608(interfaceC2386.getSize());
                this.f6253 = c12627.m18622() + this.f6253;
                c20833 = c12627;
            }
            c20833.m18633(interfaceC2386.getTime());
            c20833.m18614(z4);
            if (c20833.m18605()) {
                c20833.m18609(interfaceC2386.mo8112());
            }
            if (this.f15878 && c20833.m18628() == null && (c9097Mo5155 = interfaceC2386.mo5155()) != null) {
                if (!(interfaceC2386 instanceof C6004)) {
                    c20833.m18611(new C6623(c9097Mo5155.m24243(), -1, -1));
                } else if (!C6004.m17446(c9097Mo5155)) {
                    c20833.m18611(new C6623(c9097Mo5155.m24243(), c9097Mo5155.m24242(), c9097Mo5155.m24246()));
                } else if (!interfaceC2386.mo8093().mo49854()) {
                    try {
                        c20833.m18611(new C6623(C14453.m34906(interfaceC2386.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c20833.m18618(interfaceC2386.getPath());
            c20833.m18635(abstractC22044M35193);
            c20833.m18634(name);
            c20833.m18619(z3);
            c20832.f66705.add(c20833);
            this.f6251++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m14048(AbstractC22044 abstractC22044, InterfaceC2386 interfaceC2386, String str) {
        boolean zTest = this.f15874.test(abstractC22044);
        if (!this.f15876.mo28698(zTest)) {
            C21578 c21578 = C21578.f68936;
            return this.f15876.mo28696(str, c21578, c21578, false, zTest);
        }
        return this.f15876.mo28696(str, C21578.m49095(interfaceC2386), C21578.m49096(abstractC22044), abstractC22044.mo4292(), zTest);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14063(AbstractC6662 abstractC6662) {
        if (!abstractC6662.m18625()) {
            return false;
        }
        if (!abstractC6662.m18605() || this.f15869) {
            return (this.f15873 && abstractC6662.m18605() && abstractC6662.m18630()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14071(String[] strArr) throws IOException {
        AbstractC6662 c12627;
        int length = strArr.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC6662> arrayList = this.f15872;
            InterfaceC3678 interfaceC3678 = this.f15871;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC3678.mo924()) {
                    return;
                }
                AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
                String name = abstractC22044M35193.getName();
                AbstractC22044 abstractC22044M35194 = C14584.m35193(this.f15877, name);
                if (!C14584.m35211(abstractC22044M35193.mo4294(), abstractC22044M35194.mo4294())) {
                    boolean zMo2934 = abstractC22044M35194.mo2934();
                    if (abstractC22044M35193.mo4281()) {
                        if (abstractC22044M35194.m49851(abstractC22044M35193)) {
                            throw new C3090(C21576.m49059(R.string.MT_Protector, abstractC22044M35193.mo4294()));
                        }
                        c12627 = new C20832();
                    } else {
                        c12627 = new C12627();
                        c12627.m18608(abstractC22044M35193.mo4285());
                    }
                    c12627.m18638(abstractC22044M35193.getName());
                    c12627.m18633(abstractC22044M35193.mo4286());
                    c12627.m18614(this.f15870 && abstractC22044M35193.m49860());
                    c12627.m18613(abstractC22044M35193);
                    c12627.m18635(abstractC22044M35194);
                    c12627.m18634(name);
                    c12627.m18619(zMo2934);
                    if (!zMo2934) {
                        interfaceC3678.mo2723(name);
                        if (abstractC22044M35193.mo4301(abstractC22044M35194)) {
                            if (c12627.m18625()) {
                                abstractC22044M35194.mo2942(c12627.m18627());
                            }
                            this.f15868.add(c12627);
                            this.f6251++;
                            m6376();
                        }
                    } else if (c12627.f22215) {
                        if (abstractC22044M35194.mo4281() && !abstractC22044M35194.m49860()) {
                            m14065(abstractC22044M35194.mo4294());
                            throw null;
                        }
                    } else if (c12627.m18625()) {
                        m14061(abstractC22044M35194);
                    } else {
                        m14068(abstractC22044M35194);
                    }
                    if (c12627.f22215 || !c12627.m18625()) {
                        C12627 c12627Mo18632 = c12627.mo18632();
                        if (zMo2934) {
                            c12627Mo18632.m18631();
                            InterfaceC14864 interfaceC14864 = this.f15876;
                            if (interfaceC14864.mo28694()) {
                                interfaceC14864.mo28697(name, C21578.m49096(abstractC22044M35193), C21578.m49096(abstractC22044M35194), abstractC22044M35194.mo4292());
                            }
                            if (interfaceC14864.mo924()) {
                                interfaceC3678.mo2721();
                                return;
                            }
                            if (interfaceC14864.mo28700() != 1) {
                                if (interfaceC14864.mo28700() == 2) {
                                    c12627Mo18632.m18623();
                                } else if (!c12627.f22215) {
                                    C24523 c24523 = new C24523();
                                    c24523.m54796(abstractC22044M35194);
                                    c12627Mo18632.m18611(c24523.m54795());
                                }
                                if (interfaceC14864.mo28700() == 0 && interfaceC14864.mo28695() && abstractC22044M35194.mo4292()) {
                                    c12627Mo18632.m18636(true);
                                }
                            }
                        }
                        if (!c12627.f22215) {
                            this.f6253 += c12627.f22206;
                        }
                        arrayList.add(c12627);
                        this.f6251++;
                    } else {
                        arrayList.add(c12627);
                        this.f6251++;
                    }
                }
                i++;
            } else {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : arrayList) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (abstractC6662.m18625() && !abstractC6662.m18605()) {
                        m14056(abstractC6662.mo18607());
                    }
                }
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6663 : arrayList) {
                    if (abstractC6663.m18625()) {
                        m14064(abstractC6663.mo18607());
                    }
                }
                Collections.sort(arrayList, f15867);
                for (AbstractC6662 abstractC6664 : arrayList) {
                    if (abstractC6664.m18625()) {
                        abstractC6664.mo18607().m47637();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14056(C20832 c20832) throws IOException {
        AbstractC6662 c12627;
        AbstractC22044 abstractC22044M18615 = c20832.m18615();
        String str = c20832.m18624() + "/";
        Iterator it = abstractC22044M18615.mo4299(true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC3678 interfaceC3678 = this.f15871;
            if (!zHasNext) {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : c20832.f66705) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (abstractC6662.m18625() && !abstractC6662.m18605()) {
                        m14056(abstractC6662.mo18607());
                    }
                }
                return;
            }
            AbstractC22044 abstractC22044 = (AbstractC22044) it.next();
            if (interfaceC3678.mo924()) {
                return;
            }
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(abstractC22044.getName());
            String string = sbM27333.toString();
            AbstractC22044 abstractC22044M35193 = C14584.m35193(this.f15877, string);
            if (!C14584.m35211(abstractC22044.mo4294(), abstractC22044M35193.mo4294())) {
                boolean z = false;
                boolean z2 = c20832.m18630() && abstractC22044M35193.mo2934();
                if (abstractC22044.mo4281()) {
                    c12627 = new C20832();
                } else {
                    c12627 = new C12627();
                    c12627.m18608(abstractC22044.mo4285());
                }
                c12627.m18633(abstractC22044.mo4286());
                if (this.f15870 && abstractC22044.m49860()) {
                    z = true;
                }
                c12627.m18614(z);
                c12627.m18613(abstractC22044);
                c12627.m18635(abstractC22044M35193);
                c12627.m18634(string);
                c12627.m18619(z2);
                if (c20832.m18630() && !z2) {
                    interfaceC3678.mo2723(string);
                    if (abstractC22044.mo4301(abstractC22044M35193)) {
                        if (c12627.m18625()) {
                            abstractC22044M35193.mo2942(c12627.m18627());
                        }
                        this.f15868.add(c12627);
                        this.f6251++;
                        m6376();
                    }
                }
                if (z2) {
                    if (c12627.f22215) {
                        if (abstractC22044M35193.mo4281() && !abstractC22044M35193.m49860()) {
                            m14065(abstractC22044M35193.mo4294());
                            throw null;
                        }
                    } else if (c12627.m18625()) {
                        m14061(abstractC22044M35193);
                    } else {
                        m14068(abstractC22044M35193);
                    }
                }
                if (c12627.f22215 || !c12627.m18625()) {
                    C12627 c12627Mo18632 = c12627.mo18632();
                    if (z2) {
                        if (c20832.m18630()) {
                            c12627Mo18632.m18631();
                        }
                        InterfaceC14864 interfaceC14864 = this.f15876;
                        if (interfaceC14864.mo28694()) {
                            interfaceC14864.mo28697(string, C21578.m49096(abstractC22044), C21578.m49096(abstractC22044M35193), abstractC22044M35193.mo4292());
                        }
                        if (interfaceC14864.mo924()) {
                            interfaceC3678.mo2721();
                            return;
                        }
                        if (interfaceC14864.mo28700() == 1) {
                            c20832.f66706 = true;
                        } else {
                            if (interfaceC14864.mo28700() == 2) {
                                c12627Mo18632.m18623();
                            } else if (!c12627.f22215) {
                                C24523 c24523 = new C24523();
                                c24523.m54796(abstractC22044M35193);
                                c12627Mo18632.m18611(c24523.m54795());
                            }
                            if (interfaceC14864.mo28700() == 0 && interfaceC14864.mo28695() && abstractC22044M35193.mo4292()) {
                                c12627Mo18632.m18636(true);
                            }
                        }
                    }
                    if (!c12627.f22215) {
                        this.f6253 += c12627.f22206;
                    }
                }
                c20832.f66705.add(c12627);
                this.f6251++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14073(String[] strArr, AbstractC7629 abstractC7629, AbstractC18881 abstractC18881, InterfaceC24628 interfaceC24628) {
        AbstractC6662 c20832;
        C9097 c9097Mo5155;
        C21578 c21578M49095;
        C9097 c9097Mo5156;
        String[] strArr2 = strArr;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC6662> arrayList = this.f15872;
            InterfaceC3678 interfaceC3678 = this.f15871;
            if (i < length) {
                String str = strArr2[i];
                if (interfaceC3678.mo924()) {
                    return;
                }
                InterfaceC2386 interfaceC2386M20843 = abstractC7629.m20843(str);
                C13352 c13352 = (C13352) interfaceC2386M20843;
                String name = c13352.getName();
                String strM28549 = C11293.m28549(this.f15877, name);
                boolean zMo35586 = abstractC18881.mo35586(strM28549);
                if (zMo35586 && this.f15870 && c13352.mo8107()) {
                    m14065(strM28549);
                    throw null;
                }
                if (c13352.isDirectory()) {
                    interfaceC24628.setName(name);
                    c20832 = new C20832();
                    if (zMo35586) {
                        m14055(abstractC18881, strM28549);
                    }
                    length = length;
                } else {
                    C12627 c12627 = new C12627();
                    if (zMo35586) {
                        m14066(abstractC18881, strM28549);
                        InterfaceC14864 interfaceC14864 = this.f15876;
                        if (interfaceC14864.mo28694()) {
                            C21578 c21578M49096 = C21578.m49095(interfaceC2386M20843);
                            try {
                                c21578M49095 = C21578.m49095(abstractC18881.m20843(strM28549));
                            } catch (Exception unused) {
                                c21578M49095 = C21578.f68936;
                            }
                            interfaceC14864.mo28697(name, c21578M49096, c21578M49095, false);
                        }
                        if (interfaceC14864.mo924()) {
                            interfaceC3678.mo2721();
                            return;
                        }
                        if (interfaceC14864.mo28700() != 1) {
                            if (interfaceC14864.mo28700() == 2) {
                                c12627.m18623();
                            } else if (this.f15878 && (c9097Mo5155 = abstractC18881.m20843(strM28549).mo5155()) != null) {
                                c12627.m18611(new C6623(c9097Mo5155.m24243(), -1, -1));
                            }
                        }
                        i++;
                        strArr2 = strArr;
                        length = length;
                    } else {
                        length = length;
                    }
                    c12627.m18608(c13352.getSize());
                    this.f6253 += c12627.m18622();
                    c20832 = c12627;
                }
                c20832.m18638(name);
                c20832.m18633(c13352.getTime());
                c20832.m18614(this.f15870 && c13352.mo8107());
                if (c20832.m18605()) {
                    c20832.m18609(c13352.mo8112());
                }
                if (this.f15878 && c20832.m18628() == null && (c9097Mo5156 = interfaceC2386M20843.mo5155()) != null) {
                    int iM24243 = c9097Mo5156.m24243();
                    if ((interfaceC2386M20843 instanceof C6004) && C6004.m17446(c9097Mo5156) && !((C6004) interfaceC2386M20843).mo8093().mo49854()) {
                        try {
                            iM24243 = C14453.m34906(((C13352) interfaceC2386M20843).getPath()).m49237();
                        } catch (IOException unused2) {
                        }
                    }
                    c20832.m18611(new C6623(iM24243, -1, -1));
                }
                c20832.m18618(c13352.getPath());
                c20832.m18629(strM28549);
                c20832.m18634(name);
                c20832.m18619(zMo35586);
                arrayList.add(c20832);
                this.f6251++;
                i++;
                strArr2 = strArr;
                length = length;
            } else {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : arrayList) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (abstractC6662.m18625() && (!abstractC6662.m18605() || this.f15869)) {
                        m14058(abstractC6662.mo18607(), abstractC7629, abstractC18881, interfaceC24628);
                    }
                }
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6663 : arrayList) {
                    if (abstractC6663.m18625()) {
                        m14064(abstractC6663.mo18607());
                    }
                }
                Collections.sort(arrayList, f15867);
                for (AbstractC6662 abstractC6664 : arrayList) {
                    if (abstractC6664.m18625()) {
                        abstractC6664.mo18607().m47637();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14058(C20832 c20832, AbstractC7629 abstractC7629, AbstractC18881 abstractC18881, InterfaceC24628 interfaceC24628) throws IOException {
        AbstractC6662 c20833;
        C9097 c9097Mo5155;
        C9097 c9097Mo5156;
        C21578 c21578M49095;
        String str = c20832.m18624() + "/";
        Iterator it = abstractC7629.mo20830(c20832.m18604(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC3678 interfaceC3678 = this.f15871;
            if (!zHasNext) {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : c20832.f66705) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (abstractC6662.m18625() && (!abstractC6662.m18605() || this.f15869)) {
                        m14058(abstractC6662.mo18607(), abstractC7629, abstractC18881, interfaceC24628);
                    }
                }
                return;
            }
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC3678.mo924()) {
                return;
            }
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(interfaceC2386.getName());
            String string = sbM27333.toString();
            String strM28549 = C11293.m28549(this.f15877, string);
            boolean z = false;
            boolean z2 = c20832.m18630() && abstractC18881.mo35586(strM28549);
            if (interfaceC2386.isDirectory()) {
                interfaceC24628.setName(string);
                c20833 = new C20832();
                if (z2) {
                    m14055(abstractC18881, strM28549);
                }
            } else {
                C12627 c12627 = new C12627();
                if (z2) {
                    m14066(abstractC18881, strM28549);
                    InterfaceC14864 interfaceC14864 = this.f15876;
                    if (interfaceC14864.mo28694()) {
                        C21578 c21578M49096 = C21578.m49095(interfaceC2386);
                        try {
                            c21578M49095 = C21578.m49095(abstractC18881.m20843(strM28549));
                        } catch (Exception unused) {
                            c21578M49095 = C21578.f68936;
                        }
                        interfaceC14864.mo28697(string, c21578M49096, c21578M49095, false);
                    }
                    if (interfaceC14864.mo924()) {
                        interfaceC3678.mo2721();
                        return;
                    } else if (interfaceC14864.mo28700() == 1) {
                        c20832.f66706 = true;
                    } else if (interfaceC14864.mo28700() == 2) {
                        c12627.m18623();
                    } else if (this.f15878 && (c9097Mo5156 = abstractC18881.m20843(strM28549).mo5155()) != null) {
                        c12627.m18611(new C6623(c9097Mo5156.m24243(), -1, -1));
                    }
                }
                c12627.m18608(interfaceC2386.getSize());
                this.f6253 += c12627.m18622();
                c20833 = c12627;
            }
            c20833.m18633(interfaceC2386.getTime());
            if (this.f15870 && interfaceC2386.mo8107()) {
                z = true;
            }
            c20833.m18614(z);
            if (c20833.m18605()) {
                c20833.m18609(interfaceC2386.mo8112());
            }
            if (this.f15878 && c20833.m18628() == null && (c9097Mo5155 = interfaceC2386.mo5155()) != null) {
                int iM24243 = c9097Mo5155.m24243();
                if ((interfaceC2386 instanceof C6004) && C6004.m17446(c9097Mo5155) && !interfaceC2386.mo8093().mo49854()) {
                    try {
                        iM24243 = C14453.m34906(interfaceC2386.getPath()).m49237();
                    } catch (IOException unused2) {
                    }
                }
                c20833.m18611(new C6623(iM24243, -1, -1));
            }
            c20833.m18618(interfaceC2386.getPath());
            c20833.m18629(strM28549);
            c20833.m18634(string);
            c20833.m18619(z2);
            c20832.f66705.add(c20833);
            this.f6251++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14075(String[] strArr, AbstractC18881 abstractC18881, InterfaceC0761 interfaceC0761) throws IOException {
        AbstractC6662 c20832;
        C9097 c9097Mo5155;
        C21578 c21578M49095;
        C9097 c9097Mo5156;
        String[] strArr2 = strArr;
        boolean zMo20839 = abstractC18881.mo20839();
        int length = strArr2.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC6662> arrayList = this.f15872;
            InterfaceC3678 interfaceC3678 = this.f15871;
            if (i < length) {
                String str = strArr2[i];
                if (interfaceC3678.mo924()) {
                    return;
                }
                InterfaceC2386 interfaceC2386M20843 = abstractC18881.m20843(str);
                C13352 c13352 = (C13352) interfaceC2386M20843;
                String name = c13352.getName();
                String strM28549 = C11293.m28549(this.f15877, name);
                String path = c13352.getPath();
                if (!zMo20839 ? !path.equals(strM28549) : !path.equalsIgnoreCase(strM28549)) {
                    boolean zMo35586 = abstractC18881.mo35586(strM28549);
                    if (zMo35586 && this.f15870 && c13352.mo8107()) {
                        m14065(strM28549);
                        throw null;
                    }
                    if (c13352.isDirectory()) {
                        interfaceC0761.setName(name);
                        c20832 = new C20832();
                        if (zMo35586) {
                            m14055(abstractC18881, strM28549);
                        }
                        zMo20839 = zMo20839;
                        length = length;
                    } else {
                        C12627 c12627 = new C12627();
                        if (zMo35586) {
                            m14066(abstractC18881, strM28549);
                            InterfaceC14864 interfaceC14864 = this.f15876;
                            if (interfaceC14864.mo28694()) {
                                C21578 c21578M49096 = C21578.m49095(interfaceC2386M20843);
                                try {
                                    c21578M49095 = C21578.m49095(abstractC18881.m20843(strM28549));
                                } catch (Exception unused) {
                                    c21578M49095 = C21578.f68936;
                                }
                                interfaceC14864.mo28697(name, c21578M49096, c21578M49095, false);
                            }
                            if (interfaceC14864.mo924()) {
                                interfaceC3678.mo2721();
                                return;
                            } else if (interfaceC14864.mo28700() != 1) {
                                if (interfaceC14864.mo28700() == 2) {
                                    c12627.m18623();
                                } else if (this.f15878 && (c9097Mo5155 = abstractC18881.m20843(strM28549).mo5155()) != null) {
                                    c12627.m18611(new C6623(c9097Mo5155.m24243(), -1, -1));
                                }
                            }
                        } else {
                            zMo20839 = zMo20839;
                            length = length;
                        }
                        c12627.m18608(c13352.getSize());
                        this.f6253 = c12627.m18622() + this.f6253;
                        c20832 = c12627;
                    }
                    c20832.m18638(name);
                    c20832.m18633(c13352.getTime());
                    c20832.m18614(this.f15870 && c13352.mo8107());
                    if (c20832.m18605()) {
                        c20832.m18609(c13352.mo8112());
                    }
                    if (this.f15878 && c20832.m18628() == null && (c9097Mo5156 = interfaceC2386M20843.mo5155()) != null) {
                        int iM24243 = c9097Mo5156.m24243();
                        if ((interfaceC2386M20843 instanceof C6004) && C6004.m17446(c9097Mo5156) && !((C6004) interfaceC2386M20843).mo8093().mo49854()) {
                            try {
                                iM24243 = C14453.m34906(((C13352) interfaceC2386M20843).getPath()).m49237();
                            } catch (IOException unused2) {
                            }
                        }
                        c20832.m18611(new C6623(iM24243, -1, -1));
                    }
                    c20832.m18618(path);
                    c20832.m18629(strM28549);
                    c20832.m18634(name);
                    c20832.m18619(zMo35586);
                    if (!zMo35586 && c20832.m18625()) {
                        try {
                            if (abstractC18881.mo43670(c20832.m18604(), c20832.m18626())) {
                                this.f15868.add(c20832);
                                this.f6251++;
                                m6376();
                            } else {
                                arrayList.add(c20832);
                                this.f6251++;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        arrayList.add(c20832);
                        this.f6251++;
                    }
                } else {
                    zMo20839 = zMo20839;
                    length = length;
                }
                i++;
                strArr2 = strArr;
                zMo20839 = zMo20839;
                length = length;
            } else {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : arrayList) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (abstractC6662.m18625() && (!abstractC6662.m18605() || this.f15869)) {
                        m14060(abstractC6662.mo18607(), abstractC18881, interfaceC0761);
                    }
                }
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6663 : arrayList) {
                    if (abstractC6663.m18625()) {
                        m14064(abstractC6663.mo18607());
                    }
                }
                Collections.sort(arrayList, f15867);
                for (AbstractC6662 abstractC6664 : arrayList) {
                    if (abstractC6664.m18625()) {
                        abstractC6664.mo18607().m47637();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14060(C20832 c20832, AbstractC18881 abstractC18881, InterfaceC0761 interfaceC0761) throws IOException {
        AbstractC6662 c20833;
        C9097 c9097Mo5155;
        C9097 c9097Mo5156;
        C21578 c21578M49095;
        String str = c20832.m18624() + "/";
        Iterator it = abstractC18881.mo20830(c20832.m18604(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC3678 interfaceC3678 = this.f15871;
            if (!zHasNext) {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : c20832.f66705) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (abstractC6662.m18625() && (!abstractC6662.m18605() || this.f15869)) {
                        m14060(abstractC6662.mo18607(), abstractC18881, interfaceC0761);
                    }
                }
                return;
            }
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC3678.mo924()) {
                return;
            }
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(interfaceC2386.getName());
            String string = sbM27333.toString();
            String strM28549 = C11293.m28549(this.f15877, string);
            boolean z = false;
            boolean z2 = c20832.m18630() && abstractC18881.mo35586(strM28549);
            if (interfaceC2386.isDirectory()) {
                interfaceC0761.setName(string);
                c20833 = new C20832();
                if (z2) {
                    m14055(abstractC18881, strM28549);
                }
            } else {
                C12627 c12627 = new C12627();
                if (z2) {
                    m14066(abstractC18881, strM28549);
                    InterfaceC14864 interfaceC14864 = this.f15876;
                    if (interfaceC14864.mo28694()) {
                        C21578 c21578M49096 = C21578.m49095(interfaceC2386);
                        try {
                            c21578M49095 = C21578.m49095(abstractC18881.m20843(strM28549));
                        } catch (Exception unused) {
                            c21578M49095 = C21578.f68936;
                        }
                        interfaceC14864.mo28697(string, c21578M49096, c21578M49095, false);
                    }
                    if (interfaceC14864.mo924()) {
                        interfaceC3678.mo2721();
                        return;
                    } else if (interfaceC14864.mo28700() == 1) {
                        c20832.f66706 = true;
                    } else if (interfaceC14864.mo28700() == 2) {
                        c12627.m18623();
                    } else if (this.f15878 && (c9097Mo5156 = abstractC18881.m20843(strM28549).mo5155()) != null) {
                        c12627.m18611(new C6623(c9097Mo5156.m24243(), -1, -1));
                    }
                }
                c12627.m18608(interfaceC2386.getSize());
                this.f6253 += c12627.m18622();
                c20833 = c12627;
            }
            c20833.m18633(interfaceC2386.getTime());
            if (this.f15870 && interfaceC2386.mo8107()) {
                z = true;
            }
            c20833.m18614(z);
            if (c20833.m18605()) {
                c20833.m18609(interfaceC2386.mo8112());
            }
            if (this.f15878 && c20833.m18628() == null && (c9097Mo5155 = interfaceC2386.mo5155()) != null) {
                int iM24243 = c9097Mo5155.m24243();
                if ((interfaceC2386 instanceof C6004) && C6004.m17446(c9097Mo5155) && !interfaceC2386.mo8093().mo49854()) {
                    try {
                        iM24243 = C14453.m34906(interfaceC2386.getPath()).m49237();
                    } catch (IOException unused2) {
                    }
                }
                c20833.m18611(new C6623(iM24243, -1, -1));
            }
            c20833.m18618(interfaceC2386.getPath());
            c20833.m18629(strM28549);
            c20833.m18634(string);
            c20833.m18619(z2);
            c20832.f66705.add(c20833);
            this.f6251++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14072(String[] strArr, AbstractC7629 abstractC7629) {
        AbstractC6662 c12627;
        C9097 c9097Mo5155;
        int length = strArr.length;
        int i = 0;
        while (true) {
            InterfaceC3678 interfaceC3678 = this.f15871;
            ArrayList<AbstractC6662> arrayList = this.f15872;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC3678.mo924()) {
                    return;
                }
                InterfaceC2386 interfaceC2386M20843 = abstractC7629.m20843(str);
                C13352 c13352 = (C13352) interfaceC2386M20843;
                String name = c13352.getName();
                if (c13352.isDirectory()) {
                    c12627 = new C20832();
                } else {
                    c12627 = new C12627();
                    c12627.m18608(c13352.getSize());
                    this.f6253 = c12627.m18622() + this.f6253;
                }
                c12627.m18638(name);
                c12627.m18633(c13352.getTime());
                c12627.m18614(this.f15870 && c13352.mo8107());
                if (c12627.m18605()) {
                    c12627.m18609(c13352.mo8112());
                }
                if (this.f15878 && (c9097Mo5155 = interfaceC2386M20843.mo5155()) != null) {
                    if (interfaceC2386M20843 instanceof C6004) {
                        if (C6004.m17446(c9097Mo5155)) {
                            if (!((C6004) interfaceC2386M20843).mo8093().mo49854()) {
                                try {
                                    c12627.m18611(new C6623(C14453.m34906(((C13352) interfaceC2386M20843).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c12627.m18611(new C6623(c9097Mo5155.m24243(), c9097Mo5155.m24242(), c9097Mo5155.m24246()));
                        }
                    } else {
                        c12627.m18611(new C6623(c9097Mo5155.m24243(), -1, -1));
                    }
                }
                c12627.m18618(str);
                c12627.m18629(this.f15877 + name);
                c12627.m18634(name);
                c12627.m18619(false);
                arrayList.add(c12627);
                this.f6251++;
                i++;
            } else {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : arrayList) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (abstractC6662.m18625() && (!abstractC6662.m18605() || this.f15869)) {
                        m14057(abstractC6662.mo18607(), abstractC7629);
                    }
                }
                Collections.sort(arrayList, f15867);
                for (AbstractC6662 abstractC6663 : arrayList) {
                    if (abstractC6663.m18625()) {
                        abstractC6663.mo18607().m47637();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14057(C20832 c20832, AbstractC7629 abstractC7629) {
        AbstractC6662 c12627;
        C9097 c9097Mo5155;
        String str = c20832.m18624() + "/";
        Iterator it = abstractC7629.mo20830(c20832.m18604(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC3678 interfaceC3678 = this.f15871;
            if (!zHasNext) {
                interfaceC3678.mo2722();
                for (AbstractC6662 abstractC6662 : c20832.f66705) {
                    if (interfaceC3678.mo924()) {
                        return;
                    }
                    if (abstractC6662.m18625() && (!abstractC6662.m18605() || this.f15869)) {
                        m14057(abstractC6662.mo18607(), abstractC7629);
                    }
                }
                return;
            }
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC3678.mo924()) {
                return;
            }
            String strM34972 = C14483.m34972(str, interfaceC2386.getName());
            if (interfaceC2386.isDirectory()) {
                c12627 = new C20832();
            } else {
                c12627 = new C12627();
                c12627.m18608(interfaceC2386.getSize());
                this.f6253 = c12627.m18622() + this.f6253;
            }
            c12627.m18633(interfaceC2386.getTime());
            c12627.m18614(this.f15870 && interfaceC2386.mo8107());
            if (c12627.m18605()) {
                c12627.m18609(interfaceC2386.mo8112());
            }
            if (this.f15878 && (c9097Mo5155 = interfaceC2386.mo5155()) != null) {
                if (!(interfaceC2386 instanceof C6004)) {
                    c12627.m18611(new C6623(c9097Mo5155.m24243(), -1, -1));
                } else if (!C6004.m17446(c9097Mo5155)) {
                    c12627.m18611(new C6623(c9097Mo5155.m24243(), c9097Mo5155.m24242(), c9097Mo5155.m24246()));
                } else if (!interfaceC2386.mo8093().mo49854()) {
                    try {
                        c12627.m18611(new C6623(C14453.m34906(interfaceC2386.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c12627.m18618(interfaceC2386.getPath());
            c12627.m18629(this.f15877 + strM34972);
            c12627.m18634(strM34972);
            c12627.m18619(false);
            c20832.f66705.add(c12627);
            this.f6251++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m14065(String str) throws IOException {
        throw new IOException(C25272.m56409("Cannot create symbolic link because it already exists: ", str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m14066(AbstractC18881 abstractC18881, String str) throws IOException {
        if (abstractC18881.mo35573(str)) {
            throw new IOException(C14442.m34865("File '", str, "' exists but is a directory"));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14055(AbstractC18881 abstractC18881, String str) throws IOException {
        if (!abstractC18881.mo35573(str)) {
            throw new IOException(C14442.m34865("File '", str, "' exists but is not a directory"));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m14068(AbstractC22044 abstractC22044) throws IOException {
        if (abstractC22044.mo4281()) {
            throw new IOException("File '" + abstractC22044 + "' exists but is a directory");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14061(AbstractC22044 abstractC22044) throws IOException {
        if (abstractC22044.mo4281()) {
            return;
        }
        throw new IOException("File '" + abstractC22044 + "' exists but is not a directory");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m14064(C20832 c20832) {
        if (c20832.m18605()) {
            return;
        }
        if (!c20832.m18630()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            c20832.f22213 = countDownLatch;
            Iterator it = c20832.m47638().iterator();
            while (it.hasNext()) {
                ((AbstractC6662) it.next()).mo18610(countDownLatch);
            }
        }
        for (AbstractC6662 abstractC6662 : c20832.m47638()) {
            if (abstractC6662.m18625()) {
                m14064(abstractC6662.mo18607());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14070(C12451 c12451) {
        m14053(this.f15872, c12451);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14053(ArrayList arrayList, InterfaceC24562 interfaceC24562) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC6662 abstractC6662 = (AbstractC6662) it.next();
            C12451 c12451 = (C12451) interfaceC24562;
            String str = c12451.f40014;
            C24320 c24320 = c12451.f40016;
            int i = c12451.f40015;
            int i2 = C4248.f15466;
            if (!abstractC6662.m18625()) {
                StringBuilder sbM27333 = C10732.m27333(str);
                sbM27333.append(abstractC6662.m18624());
                C8002 entry = c24320.getEntry(sbM27333.toString());
                if (entry != null && (i == 2 || abstractC6662.m18627() <= entry.getTime())) {
                    it.remove();
                    this.f6251--;
                    if (abstractC6662.m18625()) {
                        m14067(abstractC6662.mo18607());
                    } else {
                        this.f6253 -= abstractC6662.f22206;
                    }
                }
            }
            if (abstractC6662.m18625()) {
                m14053(abstractC6662.mo18607().f66705, interfaceC24562);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m14067(C20832 c20832) {
        for (AbstractC6662 abstractC6662 : c20832.f66705) {
            this.f6251--;
            if (abstractC6662.m18625()) {
                m14067(abstractC6662.mo18607());
            } else {
                this.f6253 -= abstractC6662.f22206;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m14079() {
        return C4681.unmodifiableList(this.f15872);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m14080() {
        return C4681.unmodifiableList(this.f15868);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14076(boolean z) {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        C20617 c20617 = new C20617();
        Iterator it = C4681.unmodifiableList(this.f15872).iterator();
        while (it.hasNext()) {
            ((AbstractC6662) it.next()).m18612(c20617, z);
        }
        return c20617.m47239();
    }
}
