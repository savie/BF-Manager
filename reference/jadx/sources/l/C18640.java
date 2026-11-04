package l;

import java.util.HashMap;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.ܿ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes5.dex */
public final class C18640 implements InterfaceC5216 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static HashMap f60608;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Mac f60609;

    static {
        HashMap map = new HashMap();
        f60608 = map;
        map.put("HMACSHA256", new C4470());
        map.put("HMACMD5", new C14910());
        map.put("AESCMAC", new C21624());
    }

    public C18640(String str) {
        InterfaceC15436 interfaceC15436 = (InterfaceC15436) f60608.get(str.toUpperCase());
        if (interfaceC15436 != null) {
            this.f60609 = (Mac) interfaceC15436.create();
            return;
        }
        throw new IllegalArgumentException("No Mac defined for ".concat(str));
    }

    @Override // l.InterfaceC5216
    public final void init(byte[] bArr) {
        this.f60609.init(new KeyParameter(bArr));
    }

    @Override // l.InterfaceC5216
    public final void update(byte[] bArr) {
        this.f60609.update(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC5216
    public final void update(byte[] bArr, int i, int i2) {
        this.f60609.update(bArr, i, i2);
    }

    @Override // l.InterfaceC5216
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo9696() {
        Mac mac = this.f60609;
        byte[] bArr = new byte[mac.getMacSize()];
        mac.doFinal(bArr, 0);
        return bArr;
    }
}
