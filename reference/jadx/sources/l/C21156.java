package l;

import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.᩷᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C21156 extends C16218 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f68893;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21156(InterfaceC16923 interfaceC16923, String str) {
        super(interfaceC16923);
        this.f68893 = str;
    }

    @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f68893;
    }

    @Override // l.C16218, net.sf.sevenzipjbinding.IOutCreateCallback
    public final IOutItemBase getItemInformation(int i, OutItemFactory outItemFactory) throws SevenZipException {
        InterfaceC16923 interfaceC16923 = this.f52338;
        if (interfaceC16923.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        return interfaceC16923.getItemInformation(i, outItemFactory);
    }
}
