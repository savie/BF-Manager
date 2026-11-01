package l;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ۨ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O6MN */
/* JADX INFO: loaded from: classes4.dex */
public final class C11585 extends AbstractC23910 {
    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27314(C8078 c8078) {
        AbstractC19367 abstractC19367M44383 = c8078.m44383();
        if (abstractC19367M44383 instanceof C15840) {
            AbstractC19367 abstractC19367M44384 = abstractC19367M44383.m44383();
            if (abstractC19367M44384 instanceof C17250) {
                C17250 c17250 = (C17250) abstractC19367M44384;
                Matcher matcher = C2411.f9688.matcher(c17250.m40214());
                if (matcher.matches()) {
                    boolean z = true;
                    String strGroup = matcher.group(1);
                    if (!C13638.equals(strGroup, "X") && !C13638.equals(strGroup, "x")) {
                        z = false;
                    }
                    c8078.m44386(new C9778(z));
                    c17250.m40215(matcher.group(2));
                }
            }
        }
        mo37759(c8078);
    }
}
