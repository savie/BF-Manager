package l;

import com.alipay.sdk.m.t.e;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ᩳۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5UU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17886 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public void mo3144(C15313 c15313) {
        C14277 c14277 = new C14277();
        CRC32 crc32 = new CRC32();
        crc32.update((byte[]) ((C14277) c15313.m36673()).m34475());
        c14277.m34464(crc32.getValue());
        c15313.m36672(c14277);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41515(String str) {
        if (!"code".equals(str) && !e.m.equals(str) && !"both".equals(str)) {
            throw new IllegalArgumentException("Invalid scanKind");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41514(int i, String str) {
        m41515(str);
        C21845.m48623(i);
        if (e.m.equals(str)) {
            if (i != 4) {
                throw new IllegalArgumentException("scanKind=data requires referenceKinds=[data]");
            }
        } else if ("both".equals(str) && (i & 4) == 0) {
            throw new IllegalArgumentException("scanKind=both requires referenceKinds containing data");
        }
    }
}
