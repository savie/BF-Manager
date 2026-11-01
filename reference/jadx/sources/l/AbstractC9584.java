package l;

import java.text.MessageFormat;

/* JADX INFO: renamed from: l.ۢ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9584 implements InterfaceC12406 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f32303;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f32304;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC21016 f32305;

    /* JADX INFO: renamed from: ܰ */
    public abstract String mo23029(String str, Object... objArr);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m24455(String str, Object... objArr) {
        if (str == null) {
            return "";
        }
        try {
            return MessageFormat.format(str, objArr);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @Override // l.InterfaceC12406
    /* JADX INFO: renamed from: ۙ */
    public void mo2149(long j, String str, Object... objArr) {
        throw new C17344();
    }

    public AbstractC9584(String str, C16078 c16078) {
        this.f32304 = str;
        this.f32305 = c16078;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo23027(InterfaceC1260 interfaceC1260) {
        interfaceC1260.getClass();
        this.f32303 = C22852.get(interfaceC1260.getName(), new String[0]).getFileName().toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24457(String str, Object... objArr) {
        throw new C17344();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo24458(Throwable th) {
        mo2149(2147483647L, th.getMessage(), new Object[0]);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m24459() {
        return this.f32303;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24456() {
        return this.f32304;
    }
}
