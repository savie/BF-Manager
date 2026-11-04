package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩶ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S7JE */
/* JADX INFO: loaded from: classes5.dex */
public final class C21083 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C25042[] f67355;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f67356;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21083 m48143(String str) {
        if (str == null) {
            return null;
        }
        if (!str.contains(a.p) && !str.contains("<")) {
            return new C21083(str, null);
        }
        C2008 c2008M6850 = C2008.m6850("<string>" + str + "</string>", false);
        StringBuilder sb = new StringBuilder();
        LinkedList linkedList = new LinkedList();
        C24361.m54437(c2008M6850.m6858(), sb, linkedList);
        return new C21083(sb.toString(), linkedList.isEmpty() ? null : (C25042[]) linkedList.toArray(new C25042[0]));
    }

    public C21083(String str, C25042[] c25042Arr) {
        this.f67356 = str;
        this.f67355 = c25042Arr;
    }

    public C21083(InterfaceC16090 interfaceC16090) {
        this.f67356 = interfaceC16090.getValue();
        this.f67355 = interfaceC16090.mo8826();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m48145() {
        String str = this.f67356;
        C25042[] c25042Arr = this.f67355;
        if (c25042Arr == null || c25042Arr.length == 0) {
            return str.replace(a.p, "&amp;").replace(">", "&gt;").replace("<", "&lt;");
        }
        C0560 c0560 = new C0560();
        C1306 c1306 = new C1306(false);
        c1306.setOutput(c0560);
        try {
            C14049.m34215(new C14369(c1306), str, c25042Arr);
            return c0560.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m48146() {
        return this.f67356;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25042[] m48144() {
        return this.f67355;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21083) {
            C21083 c21083 = (C21083) obj;
            if (this.f67356.equals(c21083.f67356) && Arrays.equals(this.f67355, c21083.f67355)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f67355) + (this.f67356.hashCode() * 31);
    }
}
