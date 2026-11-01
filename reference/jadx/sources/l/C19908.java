package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M73F */
/* JADX INFO: loaded from: classes4.dex */
public final class C19908 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C0219 f63809 = new C0219();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f63810;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f63811;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f63812;

    public C19908(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, boolean z) {
        this.f63810 = abstractC20745;
        this.f63811 = abstractC20746;
        this.f63812 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19908 m45178(AbstractC20745 abstractC20745, boolean z) {
        AbstractC20745 abstractC20745M46733;
        if (z) {
            abstractC20745M46733 = abstractC20745.m46733(".compress" + abstractC20745.m46726());
        } else {
            abstractC20745M46733 = abstractC20745;
        }
        return new C19908(abstractC20745, abstractC20745M46733, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m45186() {
        return this.f63811;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m45185(List list, EnumC15675 enumC15675) throws IOException {
        if (!this.f63812) {
            return list;
        }
        try {
            ArrayList arrayListM45183 = m45183(list, enumC15675);
            m45184(arrayListM45183);
            m45180(arrayListM45183);
            m45181(list, enumC15675, null);
            ArrayList arrayList = new ArrayList(arrayListM45183.size());
            Iterator it = arrayListM45183.iterator();
            while (it.hasNext()) {
                arrayList.add(((C20613) it.next()).f67146);
            }
            return arrayList;
        } catch (IOException e) {
            m45181(list, enumC15675, e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private ArrayList m45183(List list, EnumC15675 enumC15675) throws IOException {
        boolean z;
        if (list.isEmpty()) {
            throw new IOException("Compression output list is empty");
        }
        EnumC15675 enumC15676 = EnumC15675.NONE;
        AbstractC20745 abstractC20745 = this.f63811;
        if (enumC15675 == enumC15676 && (list.size() != 1 || !abstractC20745.equals(list.get(0)))) {
            throw new IOException("Unexpected non-split compression output");
        }
        ArrayList arrayList = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        boolean zEquals = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC20745 abstractC20746 = (AbstractC20745) it.next();
            AbstractC20745 abstractC20745M45179 = m45179(abstractC20746, enumC15675);
            if (!hashSet.add(abstractC20745M45179.mo33986())) {
                throw new IOException(C17922.m41615(abstractC20745M45179, new StringBuilder("Duplicate compression output target: ")));
            }
            arrayList.add(new C20613(abstractC20746, abstractC20745M45179));
            zEquals |= abstractC20746.equals(abstractC20745);
            if (enumC15675 == EnumC15675.SEVEN_ZIP) {
                if (abstractC20746.getName().equals(abstractC20745.getName() + ".001")) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            z2 |= z;
        }
        if (enumC15675 == EnumC15675.ZIP && !zEquals) {
            throw new IOException("ZIP split output is missing the final volume");
        }
        if (enumC15675 != EnumC15675.SEVEN_ZIP || z2) {
            return arrayList;
        }
        throw new IOException("7z split output is missing the first volume");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC20745 m45179(AbstractC20745 abstractC20745, EnumC15675 enumC15675) throws IOException {
        AbstractC20745 abstractC20746 = this.f63811;
        if (!C13638.equals(abstractC20746.getParent(), abstractC20745.getParent())) {
            throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Compression output is outside the working directory: ")));
        }
        EnumC15675 enumC15676 = EnumC15675.NONE;
        AbstractC20745 abstractC20747 = this.f63810;
        if (enumC15675 == enumC15676) {
            if (abstractC20746.equals(abstractC20745)) {
                return abstractC20747;
            }
            throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unexpected non-split compression output: ")));
        }
        if (enumC15675 != EnumC15675.ZIP) {
            String strM45177 = m45177(abstractC20745.getName(), 3, abstractC20746.getName(), ".");
            return abstractC20747.m46711().m46690(abstractC20747.getName() + strM45177);
        }
        if (abstractC20746.equals(abstractC20745)) {
            return abstractC20747;
        }
        String strM45178 = m45177(abstractC20745.getName(), 2, C21420.m47957(abstractC20746.getName()), ".z");
        String strM47957 = C21420.m47957(abstractC20747.getName());
        return abstractC20747.m46711().m46690(strM47957 + strM45178);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45177(String str, int i, String str2, String str3) throws IOException {
        boolean z;
        String strM37076 = C15489.m37076(str2, str3);
        if (!str.startsWith(strM37076)) {
            throw new IOException("Unexpected compression volume name: ".concat(str));
        }
        String strSubstring = str.substring(strM37076.length());
        if (strSubstring.length() >= i) {
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                z = true;
                if (i2 >= strSubstring.length()) {
                    z = true ^ z2;
                    break;
                }
                char cCharAt = strSubstring.charAt(i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if (cCharAt == '0') {
                    z = false;
                }
                z2 |= z;
                i2++;
            }
            if (!z) {
                return str3.concat(strSubstring);
            }
        }
        throw new IOException("Unexpected compression volume name: ".concat(str));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m45184(ArrayList arrayList) throws IOException {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20613 c20613 = (C20613) it.next();
            AbstractC20745 abstractC20745 = c20613.f67151;
            AbstractC20745 abstractC20746 = c20613.f67146;
            if (!abstractC20745.mo33975() || !abstractC20745.mo33971()) {
                throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Compression output file is missing: ")));
            }
            boolean zMo33975 = abstractC20746.mo33975();
            c20613.f67148 = zMo33975;
            if (zMo33975 && abstractC20746.mo33974()) {
                throw new IOException(C17922.m41615(abstractC20746, new StringBuilder("Compression output target is a directory: ")));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45180(ArrayList arrayList) throws IOException {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C20613 c20613 = (C20613) it.next();
                boolean z = c20613.f67148;
                AbstractC20745 abstractC20745 = c20613.f67146;
                if (z) {
                    if (abstractC20745.mo33979() || (abstractC20745 instanceof C17589) || (abstractC20745 instanceof C17196)) {
                        C5222 c5222 = new C5222();
                        c20613.f67150 = c5222;
                        c5222.m14408(abstractC20745);
                    }
                    AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(".compress_rollback");
                    if (!abstractC20745.mo24646(abstractC20745M46733)) {
                        throw new IOException("Unable to move compression target to rollback file: " + abstractC20745.mo33986());
                    }
                    c20613.f67149 = abstractC20745M46733;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C20613 c20614 = (C20613) it2.next();
                c20614.f67147 = true;
                AbstractC20745 abstractC20746 = c20614.f67146;
                c20614.f67151.m46699(abstractC20746, (Runnable) null);
                C5222 c5223 = c20614.f67150;
                if (c5223 != null) {
                    c5223.m14402(abstractC20746);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C20613 c20615 = (C20613) it3.next();
                AbstractC20745 abstractC20747 = c20615.f67149;
                if (abstractC20747 != null && abstractC20747.mo33975()) {
                    c20615.f67149.mo24647();
                }
            }
        } catch (IOException e) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C20613 c20616 = (C20613) arrayList.get(size);
                AbstractC20745 abstractC20748 = c20616.f67149;
                AbstractC20745 abstractC20749 = c20616.f67146;
                if (abstractC20748 != null) {
                    if (abstractC20748.mo33975()) {
                        if (c20616.f67147) {
                            m45182(c20616, e);
                        }
                        try {
                            c20616.f67149.m46702(abstractC20749, false, false, null);
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else {
                        e.addSuppressed(new IOException(C17922.m41615(abstractC20749, new StringBuilder("Compression rollback file is missing: "))));
                    }
                } else if (!c20616.f67148 && c20616.f67147) {
                    m45182(c20616, e);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45182(C20613 c20613, IOException iOException) {
        AbstractC20745 abstractC20745 = c20613.f67146;
        if (!abstractC20745.mo33975() || abstractC20745.mo24647()) {
            return;
        }
        iOException.addSuppressed(new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to delete published compression output: "))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45181(List list, EnumC15675 enumC15675, IOException iOException) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC20745 abstractC20745 = (AbstractC20745) it.next();
            try {
                m45179(abstractC20745, enumC15675);
                if (abstractC20745.mo33975() && !abstractC20745.mo24647() && iOException != null) {
                    iOException.addSuppressed(new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to delete temporary compression output: "))));
                }
            } catch (IOException unused) {
            }
        }
    }
}
