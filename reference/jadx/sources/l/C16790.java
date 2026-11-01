package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ܽܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16790 {
    public static Date from(C18285 c18285) {
        try {
            return new Date(c18285.toEpochMilli());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
