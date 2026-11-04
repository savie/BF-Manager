package l;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QS */
/* JADX INFO: loaded from: classes.dex */
public final class C25403 extends AbstractC13468 {
    @Override // l.AbstractC13468
    /* JADX INFO: renamed from: ۙ */
    public final C19378 mo7730(C15705 c15705, ByteBuffer byteBuffer) {
        return new C19378(m56765(new C21287(byteBuffer.array(), byteBuffer.limit())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11976 m56765(C21287 c21287) {
        String strM48484 = c21287.m48484();
        strM48484.getClass();
        String strM48485 = c21287.m48484();
        strM48485.getClass();
        return new C11976(strM48484, strM48485, c21287.m48518(), c21287.m48518(), Arrays.copyOfRange(c21287.m48497(), c21287.m48516(), c21287.m48509()));
    }
}
