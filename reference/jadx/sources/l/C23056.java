package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: MB3E */
/* JADX INFO: loaded from: classes.dex */
public final class C23056 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f74802;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f74803;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f74804;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74805;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f74806;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21246 f74807;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Map f74808;

    public C23056(int i, int i2, boolean z, int i3, AbstractC22044 abstractC22044, C21246 c21246, Map map) {
        this.f74804 = i;
        this.f74803 = i2;
        this.f74806 = z;
        this.f74805 = i3;
        this.f74807 = c21246;
        this.f74802 = abstractC22044;
        this.f74808 = map;
    }

    public C23056(C20348 c20348) {
        this.f74804 = c20348.readByte() & 255;
        this.f74803 = c20348.m46749();
        this.f74806 = c20348.m46753();
        c20348.skipBytes(1);
        this.f74805 = c20348.readInt();
        String strM46742 = c20348.m46742();
        boolean zM46753 = c20348.m46753();
        if (strM46742 != null) {
            this.f74802 = C14584.m35193(strM46742, new String[0]);
        }
        if (zM46753) {
            AbstractC22044 abstractC22044 = this.f74802;
            if (abstractC22044 != null && abstractC22044.mo2934()) {
                try {
                    C21246 c21246 = new C21246(this.f74802);
                    c21246.m48431();
                    this.f74807 = c21246;
                } catch (Throwable unused) {
                }
            }
            if (this.f74807 == null) {
                this.f74807 = new C21246();
            }
        }
        int i = c20348.readInt();
        this.f74808 = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM46756 = c20348.m46756();
            int i3 = c20348.readInt();
            int i4 = c20348.readInt();
            String strM46757 = c20348.m46756();
            int i5 = c20348.readInt();
            C13786[] c13786Arr = new C13786[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                c13786Arr[i6] = new C13786(c20348.readInt(), c20348.readInt(), c20348.m46756());
            }
            this.f74808.put(strM46756, new C2600(i3, strM46757, c13786Arr, i4));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23056 m51960() {
        HashMap map;
        Map map2 = this.f74808;
        if (map2 != null) {
            map = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                C2600 c2600 = (C2600) entry.getValue();
                map.put((String) entry.getKey(), new C2600(c2600.f8357, c2600.f8356, (C13786[]) c2600.f8355.clone(), c2600.f8353));
            }
        } else {
            map = null;
        }
        int i = this.f74803;
        AbstractC22044 abstractC22044 = this.f74802;
        C21246 c21246 = this.f74807;
        return new C23056(this.f74804, i, this.f74806, this.f74805, abstractC22044, c21246, map);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m51962() {
        return this.f74804 == 255;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51963() {
        return this.f74804 == 254;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m51964() {
        return this.f74804 == 253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51959(int i) throws IOException {
        long jM48760;
        AbstractC22044 abstractC22044 = this.f74802;
        if (abstractC22044 != null) {
            String strMo4294 = abstractC22044.mo4294();
            jM48760 = (strMo4294 == null ? 0L : C21443.m48760(strMo4294, false)) + 16;
        } else {
            jM48760 = 15;
        }
        m51958(i, jM48760);
        Map map = this.f74808;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C2600 c2600 = (C2600) entry.getValue();
                String str = (String) entry.getKey();
                long jM48761 = C21443.m48760(c2600.f8356, false) + (str == null ? 0L : C21443.m48760(str, false)) + 20 + jM48760;
                m51958(i, jM48761);
                for (C13786 c13786 : c2600.f8355) {
                    String str2 = c13786.f43733;
                    jM48761 += (str2 == null ? 0L : C21443.m48760(str2, false)) + 12;
                    m51958(i, jM48761);
                }
                jM48760 = jM48761;
            }
        }
        return (int) jM48760;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51958(int i, long j) throws IOException {
        if (i < 0 || j > i) {
            throw new IOException("Text parameters exceed recovery state limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51961(C6178 c6178) {
        c6178.writeByte(this.f74804);
        c6178.mo17812(this.f74803);
        c6178.m17789(this.f74806);
        c6178.writeByte(0);
        c6178.writeInt(this.f74805);
        AbstractC22044 abstractC22044 = this.f74802;
        c6178.m17787(abstractC22044 == null ? null : abstractC22044.mo4294());
        c6178.m17789(this.f74807 != null);
        Map map = this.f74808;
        if (map == null) {
            c6178.writeInt(0);
            return;
        }
        c6178.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c6178.m17786((CharSequence) entry.getKey());
            C2600 c2600 = (C2600) entry.getValue();
            c6178.writeInt(c2600.f8357);
            c6178.writeInt(c2600.f8353);
            c6178.m17786((CharSequence) c2600.f8356);
            C13786[] c13786Arr = c2600.f8355;
            c6178.writeInt(c13786Arr.length);
            for (C13786 c13786 : c13786Arr) {
                c6178.writeInt(c13786.f43735);
                c6178.writeInt(c13786.f43734);
                c6178.m17786((CharSequence) c13786.f43733);
            }
        }
    }
}
