package l;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩷۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes.dex */
public final class C22069 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49901(InterfaceC5509 interfaceC5509, InterfaceC2742 interfaceC2742) throws Throwable {
        m49902(null, C1170.stream(interfaceC5509).mapToInt(new C7963()).toArray(), interfaceC2742);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49902(AbstractActivityC17204 abstractActivityC17204, int[] iArr, InterfaceC2742 interfaceC2742) throws Throwable {
        ISequentialOutStream iSequentialOutStream;
        ISequentialOutStream iSequentialOutStream2;
        IInArchive iInArchive = null;
        ISequentialOutStream[] iSequentialOutStreamArr = {null};
        IInArchive iInArchiveMo9096 = interfaceC2742.mo9096();
        C1251 c1251 = new C1251(abstractActivityC17204, interfaceC2742, iInArchiveMo9096, iSequentialOutStreamArr);
        c1251.m47258(interfaceC2742.mo9092());
        c1251.m47256(new C19150(interfaceC2742));
        while (true) {
            try {
                try {
                    interfaceC2742.mo9095();
                    iInArchiveMo9096.extract(iArr, false, c1251);
                    if (c1251.m47257()) {
                        C18902.m43875(c1251.m47255(), interfaceC2742.mo9090());
                    }
                    if (c1251.m47260()) {
                        String strM47255 = c1251.m47255();
                        if (!TextUtils.isEmpty(strM47255)) {
                            interfaceC2742.mo9089(strM47255);
                        }
                    }
                    interfaceC2742.mo9094(iInArchiveMo9096);
                    iSequentialOutStream = iSequentialOutStreamArr[0];
                    if (iSequentialOutStream instanceof Closeable) {
                        break;
                    } else {
                        return;
                    }
                } catch (SevenZipException e) {
                    if (c1251.mo4531()) {
                        ISequentialOutStream iSequentialOutStream3 = iSequentialOutStreamArr[0];
                        if (iSequentialOutStream3 != null) {
                            if (iSequentialOutStream3 instanceof Closeable) {
                                C20244.m46520((Closeable) iSequentialOutStream3);
                            }
                            iSequentialOutStreamArr[0] = null;
                            interfaceC2742.mo9088();
                        }
                        interfaceC2742.mo9094(iInArchiveMo9096);
                        try {
                            interfaceC2742.mo7313();
                            iSequentialOutStream = iSequentialOutStreamArr[0];
                            if (iSequentialOutStream instanceof Closeable) {
                                break;
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            iSequentialOutStream2 = iSequentialOutStreamArr[0];
                            if (iSequentialOutStream2 instanceof Closeable) {
                                C20244.m46520((Closeable) iSequentialOutStream2);
                            }
                            C20244.m46520(iInArchive);
                            throw th;
                        }
                    }
                    if (interfaceC2742.mo924()) {
                        ISequentialOutStream iSequentialOutStream4 = iSequentialOutStreamArr[0];
                        if (iSequentialOutStream4 instanceof Closeable) {
                            C20244.m46520((Closeable) iSequentialOutStream4);
                        }
                        C20244.m46520(iInArchiveMo9096);
                        return;
                    }
                    IOException iOExceptionM49899 = m49899(e);
                    if (iOExceptionM49899 != null) {
                        throw iOExceptionM49899;
                    }
                    if (!interfaceC2742.mo7310()) {
                        throw e;
                    }
                    if (!c1251.m47260()) {
                        throw e;
                    }
                    if (c1251.m47259()) {
                        C18902.m43874();
                    }
                    c1251.m47258(null);
                }
            } catch (Throwable th2) {
                th = th2;
                iInArchive = iInArchiveMo9096;
                iSequentialOutStream2 = iSequentialOutStreamArr[0];
                if (iSequentialOutStream2 instanceof Closeable) {
                    C20244.m46520((Closeable) iSequentialOutStream2);
                }
                C20244.m46520(iInArchive);
                throw th;
            }
        }
        C20244.m46520((Closeable) iSequentialOutStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49900(InterfaceC2742 interfaceC2742) throws Throwable {
        ExtractOperationResult extractOperationResultM15101;
        IInArchive iInArchiveMo9096 = interfaceC2742.mo9096();
        ArchiveFormat archiveFormat = iInArchiveMo9096.getArchiveFormat();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        AtomicReference atomicReference = new AtomicReference();
        C9453 c9453 = new C9453(interfaceC2742, atomicBoolean, atomicBoolean2, atomicReference);
        c9453.m47258(interfaceC2742.mo9092());
        c9453.m47256(new C19150(interfaceC2742));
        while (!interfaceC2742.mo924()) {
            try {
                boolean z = true;
                try {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    atomicReference.set(null);
                    iInArchiveMo9096.extract(null, true, c9453);
                    if (!interfaceC2742.mo924()) {
                        if (c9453.m47257()) {
                            C18902.m43875(c9453.m47255(), interfaceC2742.mo9090());
                        }
                        if (c9453.m47260()) {
                            String strM47255 = c9453.m47255();
                            if (!TextUtils.isEmpty(strM47255)) {
                                interfaceC2742.mo9089(strM47255);
                            }
                        }
                        interfaceC2742.mo9094(iInArchiveMo9096);
                        return;
                    }
                    C20244.m46520(iInArchiveMo9096);
                    return;
                } catch (SevenZipException e) {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    if (c9453.mo4531()) {
                        interfaceC2742.mo9094(iInArchiveMo9096);
                        try {
                            interfaceC2742.mo7313();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            iInArchiveMo9096 = null;
                            C20244.m46520(iInArchiveMo9096);
                            throw th;
                        }
                    }
                    if (!interfaceC2742.mo924()) {
                        IOException iOExceptionM49899 = m49899(e);
                        if (iOExceptionM49899 != null) {
                            throw iOExceptionM49899;
                        }
                        C4915 c4915 = (C4915) atomicReference.getAndSet(null);
                        if (c4915 == null || ((extractOperationResultM15101 = c4915.m15101()) != ExtractOperationResult.WRONG_PASSWORD && ((archiveFormat != ArchiveFormat.SEVEN_ZIP && archiveFormat != ArchiveFormat.RAR) || (extractOperationResultM15101 != ExtractOperationResult.CRCERROR && extractOperationResultM15101 != ExtractOperationResult.DATAERROR)))) {
                            z = false;
                        }
                        if (c9453.m47260() && c4915 != null && c4915.m15100() && z) {
                            if (c9453.m47259()) {
                                C18902.m43874();
                            }
                            c9453.m47258(null);
                        } else {
                            throw e;
                        }
                    } else {
                        C20244.m46520(iInArchiveMo9096);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        C20244.m46520(iInArchiveMo9096);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m49899(SevenZipException sevenZipException) {
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        arrayDeque.add(sevenZipException);
        while (!arrayDeque.isEmpty()) {
            Throwable th = (Throwable) arrayDeque.removeFirst();
            if (hashSet.add(th)) {
                if ((th instanceof IOException) && !(th instanceof SevenZipException)) {
                    return (IOException) th;
                }
                if (th.getCause() != null) {
                    arrayDeque.add(th.getCause());
                }
                if (th instanceof SevenZipException) {
                    SevenZipException sevenZipException2 = (SevenZipException) th;
                    if (sevenZipException2.getCauseLastThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastThrown());
                    }
                    if (sevenZipException2.getCauseFirstPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseFirstPotentialThrown());
                    }
                    if (sevenZipException2.getCauseLastPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastPotentialThrown());
                    }
                }
            }
        }
        return null;
    }
}
