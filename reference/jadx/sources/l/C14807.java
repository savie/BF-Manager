package l;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.PropID;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ܳ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes5.dex */
public final class C14807 extends AbstractC19040 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48412;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9868 f48413;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f48414;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f48415;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ISequentialOutStream[] f48416;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14807(AbstractActivityC12483 abstractActivityC12483, InterfaceC9868 interfaceC9868, IInArchive iInArchive, ISequentialOutStream[] iSequentialOutStreamArr) {
        super(abstractActivityC12483);
        this.f48413 = interfaceC9868;
        this.f48414 = iInArchive;
        this.f48416 = iSequentialOutStreamArr;
        this.f48412 = -1;
    }

    @Override // l.C10574, net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() throws SevenZipException {
        InterfaceC9868 interfaceC9868 = this.f48413;
        if (interfaceC9868.mo10347()) {
            return super.cryptoGetTextPassword();
        }
        String strMo11192 = interfaceC9868.mo11192();
        if (interfaceC9868.mo2357() || TextUtils.isEmpty(strMo11192)) {
            throw new SevenZipException(new IOException("Archive password interaction required"));
        }
        return strMo11192;
    }

    @Override // l.AbstractC19040
    public final ISequentialOutStream getStream(int i) throws SevenZipException {
        ISequentialOutStream[] iSequentialOutStreamArr = this.f48416;
        InterfaceC9868 interfaceC9868 = this.f48413;
        if (interfaceC9868.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        boolean zBooleanValue = ((Boolean) this.f48414.getProperty(i, PropID.IS_FOLDER)).booleanValue();
        this.f48415 = zBooleanValue;
        if (zBooleanValue) {
            interfaceC9868.mo11195(i);
            return null;
        }
        interfaceC9868.mo11186(i);
        if (interfaceC9868.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        try {
            ISequentialOutStream iSequentialOutStreamMo11194 = interfaceC9868.mo11194();
            iSequentialOutStreamArr[0] = iSequentialOutStreamMo11194;
            if (iSequentialOutStreamMo11194 == null) {
                return null;
            }
            return new C23979(interfaceC9868, iSequentialOutStreamMo11194);
        } catch (SevenZipException e) {
            throw e;
        } catch (Throwable th) {
            throw new SevenZipException(th);
        }
    }

    @Override // l.AbstractC19040
    /* JADX INFO: renamed from: ۜ */
    public final ISequentialOutStream mo6658(int i) {
        this.f48415 = false;
        return new C13958(3);
    }

    @Override // l.AbstractC19040
    /* JADX INFO: renamed from: ֡ۙ */
    public final void mo6656() {
        this.f48415 = true;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException {
        if (this.f48415) {
            return;
        }
        ISequentialOutStream[] iSequentialOutStreamArr = this.f48416;
        boolean z = false;
        ISequentialOutStream iSequentialOutStream = iSequentialOutStreamArr[0];
        boolean z2 = iSequentialOutStream instanceof Closeable;
        InterfaceC9868 interfaceC9868 = this.f48413;
        if (z2) {
            Closeable closeable = (Closeable) iSequentialOutStream;
            if (extractOperationResult == ExtractOperationResult.OK && !interfaceC9868.mo2357()) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new SevenZipException(e);
                }
            } else {
                C19431.m44468(closeable);
            }
        }
        if (iSequentialOutStreamArr[0] != null) {
            iSequentialOutStreamArr[0] = null;
            z = true;
        }
        if (extractOperationResult != ExtractOperationResult.OK) {
            if (z) {
                interfaceC9868.mo11188();
            }
            throw new SevenZipException(extractOperationResult.toString());
        }
        if (interfaceC9868.mo2357()) {
            return;
        }
        interfaceC9868.mo11193();
    }

    @Override // l.AbstractC19040
    /* JADX INFO: renamed from: ۖ */
    public final void mo6657(long j, long j2) throws SevenZipException {
        InterfaceC9868 interfaceC9868 = this.f48413;
        if (interfaceC9868.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        int iM22238 = C8516.m22238(j, j2);
        if (iM22238 != this.f48412) {
            this.f48412 = iM22238;
            interfaceC9868.mo10348(iM22238);
        }
    }

    @Override // l.C10574
    /* JADX INFO: renamed from: ܺۙ */
    public final boolean mo26748() {
        return super.mo26748() || this.f48413.mo2357();
    }
}
