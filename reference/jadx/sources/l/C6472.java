package l;

import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.ۛܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C6472 extends C24372 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21768;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6472(InterfaceC21388 interfaceC21388, String str) {
        super(interfaceC21388);
        this.f21768 = str;
    }

    @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f21768;
    }

    @Override // l.C24372, net.sf.sevenzipjbinding.IOutCreateCallback
    public final IOutItemBase getItemInformation(int i, OutItemFactory outItemFactory) throws SevenZipException {
        InterfaceC21388 interfaceC21388 = this.f79082;
        if (interfaceC21388.mo924()) {
            throw new SevenZipException("Canceled");
        }
        return interfaceC21388.getItemInformation(i, outItemFactory);
    }
}
