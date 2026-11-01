package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2696 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10393;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C12660 f10391 = C12660.m31455(':');

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C12660 f10390 = C12660.m31455('*');

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10392 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f10394 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8228() {
        this.f10392.clear();
        this.f10394 = 0;
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
    public final void m8229(InterfaceC7222 interfaceC7222, C0954 c0954, ArrayList arrayList) throws C22861 {
        char c;
        int i;
        ArrayList arrayList2;
        List listM31459;
        int i2;
        List listM314510;
        int i3 = this.f10394;
        if (i3 == 0) {
            long j = 0;
            long length = interfaceC7222.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            c0954.f3770 = j;
            this.f10394 = 1;
            return;
        }
        if (i3 == 1) {
            C2460 c2460 = new C2460(8);
            interfaceC7222.readFully(c2460.m7518(), 0, 8);
            this.f10393 = c2460.m7502() + 8;
            if (c2460.m7499() != 1397048916) {
                c0954.f3770 = 0L;
                return;
            } else {
                c0954.f3770 = interfaceC7222.getPosition() - ((long) (this.f10393 - 12));
                this.f10394 = 2;
                return;
            }
        }
        ArrayList arrayList3 = this.f10392;
        short s = 2816;
        char c2 = 2819;
        if (i3 == 2) {
            long length2 = interfaceC7222.getLength();
            int i4 = this.f10393 - 20;
            C2460 c2461 = new C2460(i4);
            interfaceC7222.readFully(c2461.m7518(), 0, i4);
            int i5 = 0;
            short s2 = 2817;
            while (i5 < i4 / 12) {
                c2461.m7535(2);
                short sM7536 = c2461.m7536();
                if (sM7536 != 2192 && sM7536 != s && sM7536 != s2) {
                    if (sM7536 != 2819 && sM7536 != 2820) {
                        c2461.m7535(8);
                    }
                    i5++;
                    s2 = 2817;
                    s = 2816;
                }
                arrayList3.add(new C11870(c2461.m7502(), (length2 - ((long) this.f10393)) - ((long) c2461.m7502())));
                i5++;
                s2 = 2817;
                s = 2816;
            }
            if (arrayList3.isEmpty()) {
                c0954.f3770 = 0L;
                return;
            } else {
                this.f10394 = 3;
                c0954.f3770 = ((C11870) arrayList3.get(0)).f39819;
                return;
            }
        }
        if (i3 != 3) {
            throw new IllegalStateException();
        }
        long position = interfaceC7222.getPosition();
        int length3 = (int) ((interfaceC7222.getLength() - interfaceC7222.getPosition()) - ((long) this.f10393));
        C2460 c2462 = new C2460(length3);
        interfaceC7222.readFully(c2462.m7518(), 0, length3);
        int i6 = 0;
        char c3 = 2820;
        while (i6 < arrayList3.size()) {
            C11870 c11870 = (C11870) arrayList3.get(i6);
            c2462.m7510((int) (c11870.f39819 - position));
            c2462.m7535(4);
            int iM7502 = c2462.m7502();
            Charset charset = StandardCharsets.UTF_8;
            String strM7505 = c2462.m7505(iM7502, charset);
            byte b = -1;
            switch (strM7505.hashCode()) {
                case -1711564334:
                    if (strM7505.equals("SlowMotion_Data")) {
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
                            throw C22861.m50610("Invalid SEF name", (Throwable) null);
                    }
                    i = c11870.f39818 - (iM7502 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM31459 = f10390.m31459(c2462.m7505(i, charset));
                        for (i2 = 0; i2 < listM31459.size(); i2++) {
                            listM314510 = f10391.m31459((CharSequence) listM31459.get(i2));
                            if (listM314510.size() == 3) {
                                throw C22861.m50610((String) null, (Throwable) null);
                            }
                            try {
                                arrayList2.add(new C18136(Long.parseLong((String) listM314510.get(0)), 1 << (Integer.parseInt((String) listM314510.get(2)) - 1), Long.parseLong((String) listM314510.get(1))));
                            } catch (NumberFormatException e) {
                                throw C22861.m50610((String) null, (Throwable) e);
                            }
                        }
                        arrayList.add(new C18842(arrayList2));
                    } else if (c == 2816 && c != 2817 && c != c2 && c != c3) {
                        throw new IllegalStateException();
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -1332107749:
                    if (strM7505.equals("Super_SlowMotion_Edit_Data")) {
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
                            throw C22861.m50610("Invalid SEF name", (Throwable) null);
                    }
                    i = c11870.f39818 - (iM7502 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM31459 = f10390.m31459(c2462.m7505(i, charset));
                        while (i2 < listM31459.size()) {
                            listM314510 = f10391.m31459((CharSequence) listM31459.get(i2));
                            if (listM314510.size() == 3) {
                                throw C22861.m50610((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C18136(Long.parseLong((String) listM314510.get(0)), 1 << (Integer.parseInt((String) listM314510.get(2)) - 1), Long.parseLong((String) listM314510.get(1))));
                        }
                        arrayList.add(new C18842(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -1251387154:
                    if (strM7505.equals("Super_SlowMotion_Data")) {
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
                            throw C22861.m50610("Invalid SEF name", (Throwable) null);
                    }
                    i = c11870.f39818 - (iM7502 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM31459 = f10390.m31459(c2462.m7505(i, charset));
                        while (i2 < listM31459.size()) {
                            listM314510 = f10391.m31459((CharSequence) listM31459.get(i2));
                            if (listM314510.size() == 3) {
                                throw C22861.m50610((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C18136(Long.parseLong((String) listM314510.get(0)), 1 << (Integer.parseInt((String) listM314510.get(2)) - 1), Long.parseLong((String) listM314510.get(1))));
                        }
                        arrayList.add(new C18842(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case -830665521:
                    if (strM7505.equals("Super_SlowMotion_Deflickering_On")) {
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
                            throw C22861.m50610("Invalid SEF name", (Throwable) null);
                    }
                    i = c11870.f39818 - (iM7502 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM31459 = f10390.m31459(c2462.m7505(i, charset));
                        while (i2 < listM31459.size()) {
                            listM314510 = f10391.m31459((CharSequence) listM31459.get(i2));
                            if (listM314510.size() == 3) {
                                throw C22861.m50610((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C18136(Long.parseLong((String) listM314510.get(0)), 1 << (Integer.parseInt((String) listM314510.get(2)) - 1), Long.parseLong((String) listM314510.get(1))));
                        }
                        arrayList.add(new C18842(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
                case 1760745220:
                    if (strM7505.equals("Super_SlowMotion_BGM")) {
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
                            throw C22861.m50610("Invalid SEF name", (Throwable) null);
                    }
                    i = c11870.f39818 - (iM7502 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM31459 = f10390.m31459(c2462.m7505(i, charset));
                        while (i2 < listM31459.size()) {
                            listM314510 = f10391.m31459((CharSequence) listM31459.get(i2));
                            if (listM314510.size() == 3) {
                                throw C22861.m50610((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C18136(Long.parseLong((String) listM314510.get(0)), 1 << (Integer.parseInt((String) listM314510.get(2)) - 1), Long.parseLong((String) listM314510.get(1))));
                        }
                        arrayList.add(new C18842(arrayList2));
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
                            throw C22861.m50610("Invalid SEF name", (Throwable) null);
                    }
                    i = c11870.f39818 - (iM7502 + 8);
                    if (c != 2192) {
                        arrayList2 = new ArrayList();
                        listM31459 = f10390.m31459(c2462.m7505(i, charset));
                        while (i2 < listM31459.size()) {
                            listM314510 = f10391.m31459((CharSequence) listM31459.get(i2));
                            if (listM314510.size() == 3) {
                                throw C22861.m50610((String) null, (Throwable) null);
                            }
                            arrayList2.add(new C18136(Long.parseLong((String) listM314510.get(0)), 1 << (Integer.parseInt((String) listM314510.get(2)) - 1), Long.parseLong((String) listM314510.get(1))));
                        }
                        arrayList.add(new C18842(arrayList2));
                    } else if (c == 2816) {
                    }
                    i6++;
                    c3 = 2820;
                    c2 = 2819;
                    break;
            }
        }
        c0954.f3770 = 0L;
    }
}
