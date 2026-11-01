package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֫᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB3E */
/* JADX INFO: loaded from: classes2.dex */
public final class C2063 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f7648;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Map f7649;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f7650;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f7651;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f7652;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6037 f7653;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7654;

    public C2063(int i, int i2, boolean z, int i3, AbstractC20745 abstractC20745, C6037 c6037, Map map) {
        this.f7648 = i;
        this.f7652 = i2;
        this.f7651 = z;
        this.f7654 = i3;
        this.f7653 = c6037;
        this.f7650 = abstractC20745;
        this.f7649 = map;
    }

    public C2063(C17367 c17367) {
        this.f7648 = c17367.readByte() & 255;
        this.f7652 = c17367.m40462();
        this.f7651 = c17367.m40461();
        c17367.skipBytes(1);
        this.f7654 = c17367.readInt();
        String strM40448 = c17367.m40448();
        boolean zM40461 = c17367.m40461();
        if (strM40448 != null) {
            this.f7650 = C5553.m15313(strM40448, new String[0]);
        }
        if (zM40461) {
            AbstractC20745 abstractC20745 = this.f7650;
            if (abstractC20745 != null && abstractC20745.mo33975()) {
                try {
                    C6037 c6037 = new C6037(this.f7650);
                    c6037.m16376();
                    this.f7653 = c6037;
                } catch (Throwable unused) {
                }
            }
            if (this.f7653 == null) {
                this.f7653 = new C6037();
            }
        }
        int i = c17367.readInt();
        this.f7649 = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM40442 = c17367.m40442();
            int i3 = c17367.readInt();
            int i4 = c17367.readInt();
            String strM40443 = c17367.m40442();
            int i5 = c17367.readInt();
            C21996[] c21996Arr = new C21996[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                c21996Arr[i6] = new C21996(c17367.readInt(), c17367.readInt(), c17367.m40442());
            }
            this.f7649.put(strM40442, new C11413(i3, strM40443, c21996Arr, i4));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2063 m6569() {
        HashMap map;
        Map map2 = this.f7649;
        if (map2 != null) {
            map = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                C11413 c11413 = (C11413) entry.getValue();
                map.put((String) entry.getKey(), new C11413(c11413.f38427, c11413.f38431, (C21996[]) c11413.f38429.clone(), c11413.f38428));
            }
        } else {
            map = null;
        }
        int i = this.f7652;
        AbstractC20745 abstractC20745 = this.f7650;
        C6037 c6037 = this.f7653;
        return new C2063(this.f7648, i, this.f7651, this.f7654, abstractC20745, c6037, map);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m6571() {
        return this.f7648 == 255;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m6572() {
        return this.f7648 == 254;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m6567() {
        return this.f7648 == 253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6568(int i) throws IOException {
        long jM52795;
        AbstractC20745 abstractC20745 = this.f7650;
        if (abstractC20745 != null) {
            String strMo33986 = abstractC20745.mo33986();
            jM52795 = (strMo33986 == null ? 0L : C23967.m52795(strMo33986, false)) + 16;
        } else {
            jM52795 = 15;
        }
        m6566(i, jM52795);
        Map map = this.f7649;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C11413 c11413 = (C11413) entry.getValue();
                String str = (String) entry.getKey();
                long jM52796 = C23967.m52795(c11413.f38431, false) + (str == null ? 0L : C23967.m52795(str, false)) + 20 + jM52795;
                m6566(i, jM52796);
                for (C21996 c21996 : c11413.f38429) {
                    String str2 = c21996.f71327;
                    jM52796 += (str2 == null ? 0L : C23967.m52795(str2, false)) + 12;
                    m6566(i, jM52796);
                }
                jM52795 = jM52796;
            }
        }
        return (int) jM52795;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6566(int i, long j) throws IOException {
        if (i < 0 || j > i) {
            throw new IOException("Text parameters exceed recovery state limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6570(C11018 c11018) {
        c11018.writeByte(this.f7648);
        c11018.mo24508(this.f7652);
        c11018.m27784(this.f7651);
        c11018.writeByte(0);
        c11018.writeInt(this.f7654);
        AbstractC20745 abstractC20745 = this.f7650;
        c11018.m27783(abstractC20745 == null ? null : abstractC20745.mo33986());
        c11018.m27784(this.f7653 != null);
        Map map = this.f7649;
        if (map == null) {
            c11018.writeInt(0);
            return;
        }
        c11018.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c11018.m27782((CharSequence) entry.getKey());
            C11413 c11413 = (C11413) entry.getValue();
            c11018.writeInt(c11413.f38427);
            c11018.writeInt(c11413.f38428);
            c11018.m27782((CharSequence) c11413.f38431);
            C21996[] c21996Arr = c11413.f38429;
            c11018.writeInt(c21996Arr.length);
            for (C21996 c21996 : c21996Arr) {
                c11018.writeInt(c21996.f71329);
                c11018.writeInt(c21996.f71328);
                c11018.m27782((CharSequence) c21996.f71327);
            }
        }
    }
}
