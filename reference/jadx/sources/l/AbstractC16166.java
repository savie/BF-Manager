package l;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import net.sf.sevenzipjbinding.IArchiveOpenCallback;
import net.sf.sevenzipjbinding.IArchiveOpenVolumeCallback;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.PropID;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ܶܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6Z */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16166 extends C20642 implements IArchiveOpenCallback, IArchiveOpenVolumeCallback, InterfaceC7509, Closeable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f52481;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final HashMap f52482;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f52483;

    @Override // net.sf.sevenzipjbinding.IArchiveOpenCallback
    public final void setTotal(Long l2, Long l3) {
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo36798(String str);

    public AbstractC16166(AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204);
        this.f52482 = new HashMap();
        this.f52483 = false;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveOpenCallback
    public final void setCompleted(Long l2, Long l3) throws SevenZipException {
        if (mo924()) {
            throw new SevenZipException("Canceled");
        }
    }

    @Override // net.sf.sevenzipjbinding.IArchiveOpenVolumeCallback
    public final Object getProperty(PropID propID) {
        if (propID == PropID.NAME) {
            return this.f52481;
        }
        return null;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveOpenVolumeCallback
    public final IInStream getStream(String str) throws SevenZipException {
        HashMap map = this.f52482;
        if (this.f52483) {
            throw new SevenZipException("Closed");
        }
        try {
            InterfaceC17713 interfaceC17713 = (InterfaceC17713) map.get(str);
            if (interfaceC17713 != null && !interfaceC17713.isClosed()) {
                interfaceC17713.seek(0L);
                this.f52481 = str;
                return new C2953(interfaceC17713);
            }
            boolean z = interfaceC17713 == null;
            C13961 c13961M49855 = C14584.m35193(str, new String[0]).m49855("r");
            map.put(str, c13961M49855);
            if (z) {
                mo36798(str);
            }
            this.f52481 = str;
            return new C2953(c13961M49855);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SevenZipException e) {
            throw e;
        } catch (Exception e2) {
            throw new SevenZipException(e2);
        }
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final void m38347() {
        Iterator it = this.f52482.values().iterator();
        while (it.hasNext()) {
            C20244.m46520((InterfaceC17713) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f52483) {
            return;
        }
        this.f52483 = true;
        m38347();
        this.f52482.clear();
    }
}
