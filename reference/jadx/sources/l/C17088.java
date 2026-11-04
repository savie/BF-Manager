package l;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G6RC */
/* JADX INFO: loaded from: classes.dex */
public final class C17088 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C15508 f55781;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CharSequence f55782;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f55783;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23056 f55784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f55785;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f55786;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f55787;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7239 f55788;

    static {
        ApplicationC23172.m52091(124);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m40249(AbstractC2720 abstractC2720);

    public C17088(CharSequence charSequence, C15508 c15508, String str, C23056 c23056, int i, List list) {
        this.f55782 = charSequence;
        this.f55781 = c15508;
        this.f55786 = str;
        this.f55784 = c23056;
        this.f55783 = i;
        this.f55787 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17088 m40245(InterfaceC19106 interfaceC19106, String str, C23056 c23056) {
        return m40243(interfaceC19106, str, c23056, -1, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17088 m40244(C16320 c16320, String str, C23056 c23056) {
        C17088 c17088M40243 = m40243(c16320.f52980, str, c23056, -1, null);
        C13950 c13950 = c16320.f52982;
        if (c13950 == null || c13950.m34016() <= 1) {
            return c17088M40243;
        }
        try {
            c17088M40243.f55788 = c16320.f52982.m34009(c16320.f52991, c17088M40243.f55782, c16320.f52985.f20454);
            return c17088M40243;
        } catch (Error | RuntimeException e) {
            c17088M40243.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40248() {
        m40246();
        C7239 c7239 = this.f55788;
        if (c7239 != null) {
            c7239.m19856();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17088 m40243(CharSequence charSequence, String str, C23056 c23056, int i, ArrayList arrayList) {
        List listUnmodifiableList;
        C23056 c23056M51960 = c23056.m51960();
        C15508 c15508Mo15337 = null;
        if (arrayList == null) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (Object obj : arrayList) {
                C17359.requireNonNull(obj);
                arrayList2.add(obj);
            }
            listUnmodifiableList = C4681.unmodifiableList(arrayList2);
        }
        if (listUnmodifiableList != null && (i < 0 || i >= listUnmodifiableList.size())) {
            throw new IllegalArgumentException("Invalid saving page index");
        }
        try {
            c15508Mo15337 = charSequence instanceof InterfaceC9629 ? ((InterfaceC9629) charSequence).mo15337() : null;
            return new C17088(c15508Mo15337 == null ? charSequence : c15508Mo15337, c15508Mo15337, str, c23056M51960, i, listUnmodifiableList);
        } catch (Error | RuntimeException e) {
            if (c15508Mo15337 != null) {
                c15508Mo15337.close();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40250(AbstractC22044 abstractC22044) {
        m40246();
        C7239 c7239 = this.f55788;
        C23056 c23056 = this.f55784;
        String str = this.f55786;
        if (c7239 == null) {
            C0681.m2969(abstractC22044, this.f55782, str, c23056.f74803);
        } else {
            C0681.m2968(abstractC22044, str, c23056.f74803, c7239);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40252(AbstractC22044 abstractC22044) throws IOException {
        String string;
        C23056 c23056 = this.f55784;
        C21246 c21246 = c23056.f74807;
        m40246();
        if (this.f55788 == null) {
            CharSequence charSequence = this.f55782;
            if (charSequence instanceof C15508) {
                C15508 c15508 = (C15508) charSequence;
                string = c15508.subSequence(0, c15508.length());
            } else {
                string = charSequence.toString();
            }
        } else {
            StringWriter stringWriter = new StringWriter();
            this.f55788.m19855(stringWriter);
            string = stringWriter.toString();
        }
        C6178 c6178 = new C6178();
        C22173 c22173 = new C22173(c21246);
        c22173.m50143(c23056.f74808);
        c22173.m50145(c23056.f74806);
        c22173.m50142(string);
        c22173.m50144(c6178);
        abstractC22044.m49844(c6178);
        if (c21246 == null || c21246.m48424() == null) {
            return;
        }
        InterfaceC7206 interfaceC7206M48424 = c21246.m48424();
        AbstractC22044 abstractC22044M35193 = C14584.m35193(abstractC22044.mo4294() + ".arsc", new String[0]);
        if (!(interfaceC7206M48424 instanceof C24296)) {
            C6178 c6179 = new C6178();
            C23001.m51887(interfaceC7206M48424, EnumC11066.CREATE, false).m51893(c6179, (C3374) null);
            abstractC22044M35193.m49844(c6179);
            return;
        }
        C24296 c24296 = (C24296) interfaceC7206M48424;
        OutputStream outputStreamMo4289 = abstractC22044M35193.mo4289(false);
        try {
            c24296.m54312(outputStreamMo4289);
            if (outputStreamMo4289 != null) {
                outputStreamMo4289.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo4289 != null) {
                try {
                    outputStreamMo4289.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40251(C23056 c23056) {
        C23056 c23057 = this.f55784;
        Map map = c23057.f74808;
        if (c23056 != null) {
            Map map2 = c23056.f74808;
            if (c23057.f74804 == c23056.f74804 && c23057.f74803 == c23056.f74803 && c23057.f74806 == c23056.f74806 && c23057.f74805 == c23056.f74805 && c23057.f74807 == c23056.f74807 && C17359.equals(c23057.f74802, c23056.f74802)) {
                if (map == null || map2 == null) {
                    if (map == map2) {
                        return true;
                    }
                } else if (map.keySet().equals(map2.keySet())) {
                    for (Map.Entry entry : map.entrySet()) {
                        C2600 c2600 = (C2600) entry.getValue();
                        C2600 c2601 = (C2600) map2.get(entry.getKey());
                        int i = c2600.f8357;
                        C13786[] c13786Arr = c2600.f8355;
                        int i2 = c2601.f8357;
                        C13786[] c13786Arr2 = c2601.f8355;
                        if (i == i2 && c2600.f8353 == c2601.f8353 && C17359.equals(c2600.f8356, c2601.f8356) && c13786Arr.length == c13786Arr2.length) {
                            for (int i3 = 0; i3 < c13786Arr.length; i3++) {
                                C13786 c13786 = c13786Arr[i3];
                                C13786 c13787 = c13786Arr2[i3];
                                if (c13786.f43735 == c13787.f43735 && c13786.f43734 == c13787.f43734 && C17359.equals(c13786.f43733, c13787.f43733)) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13812 m40247(int i) throws C22413 {
        m40246();
        C13812 c13812 = new C13812();
        C7239 c7239 = this.f55788;
        CharSequence charSequence = this.f55782;
        if (c7239 == null) {
            c13812.m33722(i, charSequence);
            return c13812;
        }
        for (int i2 = 0; i2 < this.f55788.f23872.m34016(); i2++) {
            if (i2 == this.f55788.m19853()) {
                c13812.m33722(i, charSequence);
            } else {
                C15508 c15508M19854 = this.f55788.m19854(i2);
                try {
                    c13812.m33722(-1, c15508M19854);
                    c15508M19854.close();
                } catch (Throwable th) {
                    try {
                        c15508M19854.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return c13812;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m40246() {
        if (this.f55785) {
            throw new IllegalStateException("Saving request is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f55785) {
            return;
        }
        this.f55785 = true;
        try {
            C15508 c15508 = this.f55781;
            if (c15508 != null) {
                c15508.close();
            }
        } finally {
            C7239 c7239 = this.f55788;
            if (c7239 != null) {
                c7239.close();
            }
        }
    }
}
