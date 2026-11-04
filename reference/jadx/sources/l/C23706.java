package l;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: renamed from: l.᩹ܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes.dex */
public class C23706 extends AbstractC18881 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76834 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3568 f76835;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C0236 f76836;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Boolean f76837;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16312 f76838;

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo35574() {
        return true;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo35581() {
        return true;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo35583() {
        return true;
    }

    public C23706(int i, AbstractC0148 abstractC0148) {
        super(i, abstractC0148);
        this.f76838 = new C16312(new C16992(this), mo20839());
        this.f76835 = C3568.m11613(i, abstractC0148);
    }

    public C23706(int i, AbstractC0148 abstractC0148, C20348 c20348) {
        this(i, abstractC0148);
        Boolean boolM46761 = c20348.m46761();
        this.f76837 = boolM46761;
        if (boolM46761 != null) {
            this.f76838.m38700(boolM46761.booleanValue());
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final void mo35572(AbstractC0148 abstractC0148) {
        super.mo35572(abstractC0148);
        C3568 c3568M11613 = C3568.m11613(this.f61288, abstractC0148);
        if (this.f76835.equals(c3568M11613)) {
            return;
        }
        C10367.m26667(this.f76835);
        this.f76835 = c3568M11613;
        this.f76838.m38698();
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final void mo35585(C6178 c6178) {
        c6178.m17785(this.f76837);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܶ */
    public final String mo35579() {
        return this.f76835.f12224;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܽ */
    public final String mo35580() {
        return this.f76835.f12224;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۗ */
    public final C0236 mo43785() {
        Comparator c4880;
        C0236 c0236 = this.f76836;
        if (c0236 != null) {
            return c0236;
        }
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            C20722 c20722M31073 = new C12517(c20614M26669).m31073();
            HashMap map = c20722M31073.f66403;
            HashMap map2 = c20722M31073.f66404;
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new C7694((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
            }
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                arrayList2.add(new C7694((String) entry2.getKey(), ((Integer) entry2.getValue()).intValue()));
            }
            if (c20722M31073.f66405) {
                c4880 = new C4532(1);
            } else {
                c4880 = new C4880(1);
            }
            Collections.sort(arrayList, c4880);
            Collections.sort(arrayList2, c4880);
            C0236 c0237 = new C0236(C4681.unmodifiableList(arrayList), C4681.unmodifiableList(arrayList2));
            this.f76836 = c0237;
            C10367.m26670(c20614M26669);
            return c0237;
        } catch (Throwable th) {
            try {
                throw new IOException("Failed to load uid and gid lists", th);
            } catch (Throwable th2) {
                C10367.m26670(c20614M26669);
                throw th2;
            }
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܰ */
    public final void mo35578() {
        C5261.f18538.execute(new RunnableC3291(5, this));
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        this.f76838.m38698();
        if (z) {
            C10367.m26667(this.f76835);
            this.f76836 = null;
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo35573(String str) {
        return this.f76838.m38701(str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo35586(String str) {
        C16312 c16312 = this.f76838;
        c16312.getClass();
        return c16312.m38697(C11293.m28556(str), C11293.m28558(str)) != null;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۫ */
    public final String mo35577(String str) {
        return this.f76838.m38702(str);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        String strM28556 = C11293.m28556(str);
        C17630 c17630 = (C17630) this.f76838.m38697(strM28556, C11293.m28558(str));
        if (c17630 != null) {
            return new C1419(c17630, strM28556);
        }
        return null;
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        String strM20187 = AbstractC7364.m20187(str);
        Collection<C17630> collectionValues = this.f76838.m38703(strM20187).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C17630 c17630 : collectionValues) {
            if (z || !c17630.m41279().startsWith(".")) {
                arrayList.add(new C1419(c17630, strM20187));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۧ */
    public final void mo35576(String str) {
        this.f76838.m38699(str);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo20839() {
        return this.f76837 == Boolean.TRUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52958(C23706 c23706, C20614 c20614, Vector vector, String str) throws C20199 {
        String lowerCase;
        HashSet hashSet = new HashSet();
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            hashSet.add(((C17630) it.next()).m41279());
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            C17630 c17630 = (C17630) it2.next();
            if (c17630.m41273().m52109()) {
                String strM41279 = c17630.m41279();
                boolean z = false;
                char cCharAt = strM41279.charAt(0);
                if ('a' <= cCharAt && cCharAt <= 'z') {
                    lowerCase = strM41279.toUpperCase();
                } else if ('A' <= cCharAt && cCharAt <= 'Z') {
                    lowerCase = strM41279.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    try {
                        c20614.m47231(C11293.m28549(str, lowerCase));
                        z = true;
                    } catch (C20199 e) {
                        int i = e.f64841;
                        if (i != 2 && i != 10) {
                            throw e;
                        }
                    }
                    c23706.f76837 = Boolean.valueOf(z);
                    c23706.f76838.m38700(z);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C20614 m52959(C23706 c23706) {
        return C10367.m26669(c23706.f76835);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۘ */
    public final String mo35569() {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            String str = this.f61289.f1128;
            if (!TextUtils.isEmpty(str)) {
                return AbstractC7364.m20187(str);
            }
            return AbstractC7364.m20187(c20614M26669.m47233());
        } finally {
            C10367.m26670(c20614M26669);
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo35570(long j, String str) {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            return new C16246(c20614M26669, c20614M26669.m47224(j, str));
        } catch (IOException | Error | RuntimeException e) {
            C10367.m26670(c20614M26669);
            throw e;
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final void mo43787(int i, int i2, String str) {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            C23183 c23183 = new C23183();
            c23183.m52107(i, i2);
            c20614M26669.m47235(str, c23183);
        } finally {
            C10367.m26670(c20614M26669);
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final void mo35571(String str, String str2) {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            c20614M26669.m47226(str, str2);
        } finally {
            C10367.m26670(c20614M26669);
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۤ */
    public final void mo43668(long j, String str) {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            C23183 c23183 = new C23183();
            int i = (int) (j / 1000);
            c23183.m52103(i, i);
            c20614M26669.m47235(str, c23183);
        } finally {
            C10367.m26670(c20614M26669);
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۤ */
    public final void mo35575(String str, boolean z) {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            if (z) {
                c20614M26669.m47232(str);
            } else {
                c20614M26669.m47236(str);
            }
            C10367.m26670(c20614M26669);
        } catch (Throwable th) {
            C10367.m26670(c20614M26669);
            throw th;
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩴ */
    public final void mo35582(String str) {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            try {
                C23183 c23183 = new C23183();
                c23183.m52102(448);
                c20614M26669.m47227(str, c23183);
                C10367.m26670(c20614M26669);
            } catch (C20199 e) {
                if (e.f64841 == 4) {
                    try {
                        if (c20614M26669.m47231(str).m52108()) {
                            C10367.m26670(c20614M26669);
                            return;
                        }
                    } catch (C20199 unused) {
                    }
                }
                throw e;
            }
        } catch (Throwable th) {
            C10367.m26670(c20614M26669);
            throw th;
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final OutputStream mo35584(long j, String str) {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            return new C17738(this, c20614M26669.m47234(str), c20614M26669);
        } catch (IOException | Error | RuntimeException e) {
            C10367.m26670(c20614M26669);
            throw e;
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final void mo43669(int i, String str) {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            C23183 c23183 = new C23183();
            c23183.m52102(i);
            c20614M26669.m47235(str, c23183);
        } finally {
            C10367.m26670(c20614M26669);
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo43670(String str, String str2) {
        C20614 c20614M26669 = C10367.m26669(this.f76835);
        try {
            c20614M26669.m47226(str, str2);
            return true;
        } catch (C20199 unused) {
            return false;
        } finally {
            C10367.m26670(c20614M26669);
        }
    }
}
