package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0570 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C0942 f2330 = C0942.m3763(':');

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C0942 f2331 = C0942.m3763('*');

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f2333;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2332 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f2334 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2586() {
        this.f2332.clear();
        this.f2334 = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2587(InterfaceC19502 interfaceC19502, C18756 c18756, ArrayList arrayList) throws C2970 {
        char c;
        int i;
        ArrayList arrayList2;
        List listM3767;
        int i2;
        List listM3768;
        int i3 = this.f2334;
        if (i3 == 0) {
            long j = 0;
            long length = interfaceC19502.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            c18756.f60914 = j;
            this.f2334 = 1;
            return;
        }
        if (i3 == 1) {
            C21287 c21287 = new C21287(8);
            interfaceC19502.readFully(c21287.m48497(), 0, 8);
            this.f2333 = c21287.m48483() + 8;
            if (c21287.m48500() != 1397048916) {
                c18756.f60914 = 0L;
                return;
            } else {
                c18756.f60914 = interfaceC19502.getPosition() - ((long) (this.f2333 - 12));
                this.f2334 = 2;
                return;
            }
        }
        ArrayList arrayList3 = this.f2332;
        short s = 2816;
        char c2 = 2819;
        if (i3 == 2) {
            long length2 = interfaceC19502.getLength();
            int i4 = this.f2333 - 20;
            C21287 c21288 = new C21287(i4);
            interfaceC19502.readFully(c21288.m48497(), 0, i4);
            int i5 = 0;
            short s2 = 2817;
            while (i5 < i4 / 12) {
                c21288.m48503(2);
                short sM48520 = c21288.m48520();
                if (sM48520 != 2192 && sM48520 != s && sM48520 != s2) {
                    if (sM48520 != 2819 && sM48520 != 2820) {
                        c21288.m48503(8);
                    }
                    i5++;
                    s2 = 2817;
                    s = 2816;
                }
                arrayList3.add(new C18469(c21288.m48483(), (length2 - ((long) this.f2333)) - ((long) c21288.m48483())));
                i5++;
                s2 = 2817;
                s = 2816;
            }
            if (arrayList3.isEmpty()) {
                c18756.f60914 = 0L;
                return;
            } else {
                this.f2334 = 3;
                c18756.f60914 = ((C18469) arrayList3.get(0)).f60135;
                return;
            }
        }
        if (i3 != 3) {
            throw new IllegalStateException();
        }
        long position = interfaceC19502.getPosition();
        int length3 = (int) ((interfaceC19502.getLength() - interfaceC19502.getPosition()) - ((long) this.f2333));
        C21287 c21289 = new C21287(length3);
        interfaceC19502.readFully(c21289.m48497(), 0, length3);
        int i6 = 0;
        char c3 = 2820;
        while (i6 < arrayList3.size()) {
            C18469 c18469 = (C18469) arrayList3.get(i6);
            c21289.m48510((int) (c18469.f60135 - position));
            c21289.m48503(4);
            int iM48483 = c21289.m48483();
            Charset charset = StandardCharsets.UTF_8;
            String strM48488 = c21289.m48488(iM48483, charset);
            byte b = -1;
            switch (strM48488.hashCode()) {
                case -1711564334:
                    if (strM48488.equals("SlowMotion_Data")) {
                        b = 0;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C2970.m9688("Invalid SEF name", (Throwable) null);
                    }
                    i = c18469.f60134 - (iM48483 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM3767 = f2331.m3767(c21289.m48488(i, charset));
                        for (i2 = 0; i2 < listM3767.size(); i2++) {
                            listM3768 = f2330.m3767((CharSequence) listM3767.get(i2));
                            if (listM3768.size() == 3) {
                                throw C2970.m9688((String) null, (Throwable) null);
                            }
                            try {
                                arrayList2.add(new C5023(Long.parseLong((String) listM3768.get(0)), 1 << (Integer.parseInt((String) listM3768.get(2)) - 1), Long.parseLong((String) listM3768.get(1))));
                            } catch (NumberFormatException e) {
                                throw C2970.m9688((String) null, (Throwable) e);
                            }
                        }
                        arrayList.add(new C22177(arrayList2));
                    } else if (c == 2816 && c != 2817 && c != c2 && c != c3) {
                        throw new IllegalStateException();
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -1332107749:
                    if (strM48488.equals("Super_SlowMotion_Edit_Data")) {
                        b = 1;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C2970.m9688("Invalid SEF name", (Throwable) null);
                    }
                    i = c18469.f60134 - (iM48483 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM3767 = f2331.m3767(c21289.m48488(i, charset));
                        while (i2 < listM3767.size()) {
                            listM3768 = f2330.m3767((CharSequence) listM3767.get(i2));
                            if (listM3768.size() == 3) {
                                throw C2970.m9688((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C5023(Long.parseLong((String) listM3768.get(0)), 1 << (Integer.parseInt((String) listM3768.get(2)) - 1), Long.parseLong((String) listM3768.get(1))));
                        }
                        arrayList.add(new C22177(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -1251387154:
                    if (strM48488.equals("Super_SlowMotion_Data")) {
                        b = 2;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C2970.m9688("Invalid SEF name", (Throwable) null);
                    }
                    i = c18469.f60134 - (iM48483 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM3767 = f2331.m3767(c21289.m48488(i, charset));
                        while (i2 < listM3767.size()) {
                            listM3768 = f2330.m3767((CharSequence) listM3767.get(i2));
                            if (listM3768.size() == 3) {
                                throw C2970.m9688((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C5023(Long.parseLong((String) listM3768.get(0)), 1 << (Integer.parseInt((String) listM3768.get(2)) - 1), Long.parseLong((String) listM3768.get(1))));
                        }
                        arrayList.add(new C22177(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -830665521:
                    if (strM48488.equals("Super_SlowMotion_Deflickering_On")) {
                        b = 3;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C2970.m9688("Invalid SEF name", (Throwable) null);
                    }
                    i = c18469.f60134 - (iM48483 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM3767 = f2331.m3767(c21289.m48488(i, charset));
                        while (i2 < listM3767.size()) {
                            listM3768 = f2330.m3767((CharSequence) listM3767.get(i2));
                            if (listM3768.size() == 3) {
                                throw C2970.m9688((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C5023(Long.parseLong((String) listM3768.get(0)), 1 << (Integer.parseInt((String) listM3768.get(2)) - 1), Long.parseLong((String) listM3768.get(1))));
                        }
                        arrayList.add(new C22177(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case 1760745220:
                    if (strM48488.equals("Super_SlowMotion_BGM")) {
                        b = 4;
                    }
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C2970.m9688("Invalid SEF name", (Throwable) null);
                    }
                    i = c18469.f60134 - (iM48483 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM3767 = f2331.m3767(c21289.m48488(i, charset));
                        while (i2 < listM3767.size()) {
                            listM3768 = f2330.m3767((CharSequence) listM3767.get(i2));
                            if (listM3768.size() == 3) {
                                throw C2970.m9688((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C5023(Long.parseLong((String) listM3768.get(0)), 1 << (Integer.parseInt((String) listM3768.get(2)) - 1), Long.parseLong((String) listM3768.get(1))));
                        }
                        arrayList.add(new C22177(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                default:
                    switch (b) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = 2820;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw C2970.m9688("Invalid SEF name", (Throwable) null);
                    }
                    i = c18469.f60134 - (iM48483 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM3767 = f2331.m3767(c21289.m48488(i, charset));
                        while (i2 < listM3767.size()) {
                            listM3768 = f2330.m3767((CharSequence) listM3767.get(i2));
                            if (listM3768.size() == 3) {
                                throw C2970.m9688((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C5023(Long.parseLong((String) listM3768.get(0)), 1 << (Integer.parseInt((String) listM3768.get(2)) - 1), Long.parseLong((String) listM3768.get(1))));
                        }
                        arrayList.add(new C22177(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
            }
        }
        c18756.f60914 = 0L;
    }
}
