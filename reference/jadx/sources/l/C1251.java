package l;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.PropID;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.֨ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes3.dex */
public final class C1251 extends AbstractC11691 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f4525;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f4526;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f4527;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2742 f4528;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ISequentialOutStream[] f4529;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1251(AbstractActivityC17204 abstractActivityC17204, InterfaceC2742 interfaceC2742, IInArchive iInArchive, ISequentialOutStream[] iSequentialOutStreamArr) {
        super(abstractActivityC17204);
        this.f4528 = interfaceC2742;
        this.f4525 = iInArchive;
        this.f4529 = iSequentialOutStreamArr;
        this.f4527 = -1;
    }

    @Override // l.C20642, net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() throws SevenZipException {
        InterfaceC2742 interfaceC2742 = this.f4528;
        if (interfaceC2742.mo7310()) {
            return super.cryptoGetTextPassword();
        }
        String strMo9092 = interfaceC2742.mo9092();
        if (interfaceC2742.mo924() || TextUtils.isEmpty(strMo9092)) {
            throw new SevenZipException(new IOException("Archive password interaction required"));
        }
        return strMo9092;
    }

    @Override // l.AbstractC11691
    public final ISequentialOutStream getStream(int i) throws SevenZipException {
        ISequentialOutStream[] iSequentialOutStreamArr = this.f4529;
        InterfaceC2742 interfaceC2742 = this.f4528;
        if (interfaceC2742.mo924()) {
            throw new SevenZipException("Canceled");
        }
        boolean zBooleanValue = ((Boolean) this.f4525.getProperty(i, PropID.IS_FOLDER)).booleanValue();
        this.f4526 = zBooleanValue;
        if (zBooleanValue) {
            interfaceC2742.mo9093(i);
            return null;
        }
        interfaceC2742.mo7308(i);
        if (interfaceC2742.mo924()) {
            throw new SevenZipException("Canceled");
        }
        try {
            ISequentialOutStream iSequentialOutStreamMo7311 = interfaceC2742.mo7311();
            iSequentialOutStreamArr[0] = iSequentialOutStreamMo7311;
            if (iSequentialOutStreamMo7311 == null) {
                return null;
            }
            return new C10199(interfaceC2742, iSequentialOutStreamMo7311);
        } catch (SevenZipException e) {
            throw e;
        } catch (Throwable th) {
            throw new SevenZipException(th);
        }
    }

    @Override // l.AbstractC11691
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ISequentialOutStream mo4530(int i) {
        this.f4526 = false;
        return new C11845();
    }

    @Override // l.AbstractC11691
    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final void mo4532() {
        this.f4526 = true;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException {
        if (this.f4526) {
            return;
        }
        ISequentialOutStream[] iSequentialOutStreamArr = this.f4529;
        boolean z = false;
        ISequentialOutStream iSequentialOutStream = iSequentialOutStreamArr[0];
        boolean z2 = iSequentialOutStream instanceof Closeable;
        InterfaceC2742 interfaceC2742 = this.f4528;
        if (z2) {
            Closeable closeable = (Closeable) iSequentialOutStream;
            if (extractOperationResult == ExtractOperationResult.OK && !interfaceC2742.mo924()) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new SevenZipException(e);
                }
            } else {
                C20244.m46520(closeable);
            }
        }
        if (iSequentialOutStreamArr[0] != null) {
            iSequentialOutStreamArr[0] = null;
            z = true;
        }
        if (extractOperationResult != ExtractOperationResult.OK) {
            if (z) {
                interfaceC2742.mo9088();
            }
            throw new SevenZipException(extractOperationResult.toString());
        }
        if (interfaceC2742.mo924()) {
            return;
        }
        interfaceC2742.mo7312();
    }

    @Override // l.AbstractC11691
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo4533(long j, long j2) throws SevenZipException {
        InterfaceC2742 interfaceC2742 = this.f4528;
        if (interfaceC2742.mo924()) {
            throw new SevenZipException("Canceled");
        }
        int iM11075 = C3374.m11075(j, j2);
        if (iM11075 != this.f4527) {
            this.f4527 = iM11075;
            interfaceC2742.mo7309(iM11075);
        }
    }

    @Override // l.C20642
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4531() {
        return super.mo4531() || this.f4528.mo924();
    }
}
