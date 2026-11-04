package l;

import java.text.MessageFormat;

/* JADX INFO: renamed from: l.ۗۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3236 implements InterfaceC1745 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f10543;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22078 f10544;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f10545;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract String mo10586(String str, Object... objArr);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m10580(String str, Object... objArr) {
        if (str == null) {
            return "";
        }
        try {
            return MessageFormat.format(str, objArr);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @Override // l.InterfaceC1745
    /* JADX INFO: renamed from: ۙ */
    public void mo4159(long j, String str, Object... objArr) {
        throw new C11439();
    }

    public AbstractC3236(String str, C10889 c10889) {
        this.f10543 = str;
        this.f10544 = c10889;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo10584(InterfaceC18152 interfaceC18152) {
        interfaceC18152.getClass();
        this.f10545 = C14631.get(interfaceC18152.getName(), new String[0]).getFileName().toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo10582(String str, Object... objArr) {
        throw new C11439();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo10583(Throwable th) {
        mo4159(2147483647L, th.getMessage(), new Object[0]);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m10585() {
        return this.f10545;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10581() {
        return this.f10543;
    }
}
