package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩶ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7JE */
/* JADX INFO: loaded from: classes4.dex */
public final class C19933 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15606[] f63871;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f63872;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19933 m45229(String str) {
        if (str == null) {
            return null;
        }
        if (!str.contains(a.p) && !str.contains("<")) {
            return new C19933(str, null);
        }
        C8340 c8340M21775 = C8340.m21775("<string>" + str + "</string>", false);
        StringBuilder sb = new StringBuilder();
        LinkedList linkedList = new LinkedList();
        C14816.m35490(c8340M21775.m21785(), sb, linkedList);
        return new C19933(sb.toString(), linkedList.isEmpty() ? null : (C15606[]) linkedList.toArray(new C15606[0]));
    }

    public C19933(String str, C15606[] c15606Arr) {
        this.f63872 = str;
        this.f63871 = c15606Arr;
    }

    public C19933(InterfaceC12078 interfaceC12078) {
        this.f63872 = interfaceC12078.getValue();
        this.f63871 = interfaceC12078.mo11444();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m45231() {
        String str = this.f63872;
        C15606[] c15606Arr = this.f63871;
        if (c15606Arr == null || c15606Arr.length == 0) {
            return str.replace(a.p, "&amp;").replace(">", "&gt;").replace("<", "&lt;");
        }
        C2093 c2093 = new C2093();
        C13985 c13985 = new C13985(false);
        c13985.setOutput(c2093);
        try {
            C7054.m18905(new C15700(c13985), str, c15606Arr);
            return c2093.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m45232() {
        return this.f63872;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15606[] m45230() {
        return this.f63871;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19933) {
            C19933 c19933 = (C19933) obj;
            if (this.f63872.equals(c19933.f63872) && Arrays.equals(this.f63871, c19933.f63871)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f63871) + (this.f63872.hashCode() * 31);
    }
}
