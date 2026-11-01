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

/* JADX INFO: renamed from: l.۠᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6Z */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8457 extends C10574 implements IArchiveOpenCallback, IArchiveOpenVolumeCallback, InterfaceC5614, Closeable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f29352;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f29353;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f29354;

    @Override // net.sf.sevenzipjbinding.IArchiveOpenCallback
    public final void setTotal(Long l2, Long l3) {
    }

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo3330(String str);

    public AbstractC8457(AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483);
        this.f29352 = new HashMap();
        this.f29354 = false;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveOpenCallback
    public final void setCompleted(Long l2, Long l3) throws SevenZipException {
        if (mo2357()) {
            throw new SevenZipException("Canceled");
        }
    }

    @Override // net.sf.sevenzipjbinding.IArchiveOpenVolumeCallback
    public final Object getProperty(PropID propID) {
        if (propID == PropID.NAME) {
            return this.f29353;
        }
        return null;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveOpenVolumeCallback
    public final IInStream getStream(String str) throws SevenZipException {
        HashMap map = this.f29352;
        if (this.f29354) {
            throw new SevenZipException("Closed");
        }
        try {
            InterfaceC7739 interfaceC7739 = (InterfaceC7739) map.get(str);
            if (interfaceC7739 != null && !interfaceC7739.isClosed()) {
                interfaceC7739.seek(0L);
                this.f29353 = str;
                return new C17738(interfaceC7739);
            }
            boolean z = interfaceC7739 == null;
            C1388 c1388M46710 = C5553.m15313(str, new String[0]).m46710("r");
            map.put(str, c1388M46710);
            if (z) {
                mo3330(str);
            }
            this.f29353 = str;
            return new C17738(c1388M46710);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SevenZipException e) {
            throw e;
        } catch (Exception e2) {
            throw new SevenZipException(e2);
        }
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final void m22115() {
        Iterator it = this.f29352.values().iterator();
        while (it.hasNext()) {
            C19431.m44468((InterfaceC7739) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f29354) {
            return;
        }
        this.f29354 = true;
        m22115();
        this.f29352.clear();
    }
}
