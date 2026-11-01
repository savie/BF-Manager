package l;

import java.util.HashMap;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.֨ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes2.dex */
public final class C0894 implements InterfaceC8618 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static HashMap f3602;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Mac f3603;

    static {
        HashMap map = new HashMap();
        f3602 = map;
        map.put("HMACSHA256", new C2305());
        map.put("HMACMD5", new C5128());
        map.put("AESCMAC", new C22062());
    }

    public C0894(String str) {
        InterfaceC0337 interfaceC0337 = (InterfaceC0337) f3602.get(str.toUpperCase());
        if (interfaceC0337 != null) {
            this.f3603 = (Mac) interfaceC0337.create();
            return;
        }
        throw new IllegalArgumentException("No Mac defined for ".concat(str));
    }

    @Override // l.InterfaceC8618
    public final void init(byte[] bArr) {
        this.f3603.init(new KeyParameter(bArr));
    }

    @Override // l.InterfaceC8618
    public final void update(byte[] bArr) {
        this.f3603.update(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC8618
    public final void update(byte[] bArr, int i, int i2) {
        this.f3603.update(bArr, i, i2);
    }

    @Override // l.InterfaceC8618
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo3570() {
        Mac mac = this.f3603;
        byte[] bArr = new byte[mac.getMacSize()];
        mac.doFinal(bArr, 0);
        return bArr;
    }
}
