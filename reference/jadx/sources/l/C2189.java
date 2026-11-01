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

/* JADX INFO: renamed from: l.ۖ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2189 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6799(InterfaceC14842 interfaceC14842, InterfaceC9868 interfaceC9868) {
        m6798(null, C9030.stream(interfaceC14842).mapToInt(new C6339()).toArray(), interfaceC9868);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6798(AbstractActivityC12483 abstractActivityC12483, int[] iArr, InterfaceC9868 interfaceC9868) {
        ISequentialOutStream iSequentialOutStream;
        ISequentialOutStream iSequentialOutStream2;
        IInArchive iInArchive = null;
        ISequentialOutStream[] iSequentialOutStreamArr = {null};
        IInArchive iInArchiveMo11185 = interfaceC9868.mo11185();
        C14807 c14807 = new C14807(abstractActivityC12483, interfaceC9868, iInArchiveMo11185, iSequentialOutStreamArr);
        c14807.m26747(interfaceC9868.mo11192());
        c14807.m26746(new C11279(interfaceC9868));
        while (true) {
            try {
                try {
                    interfaceC9868.mo11191();
                    iInArchiveMo11185.extract(iArr, false, c14807);
                    if (c14807.m26745()) {
                        C19808.m45037(c14807.m26750(), interfaceC9868.mo11189());
                    }
                    if (c14807.m26749()) {
                        String strM26750 = c14807.m26750();
                        if (!TextUtils.isEmpty(strM26750)) {
                            interfaceC9868.mo11187(strM26750);
                        }
                    }
                    interfaceC9868.mo11190(iInArchiveMo11185);
                    iSequentialOutStream = iSequentialOutStreamArr[0];
                    if (iSequentialOutStream instanceof Closeable) {
                        break;
                    } else {
                        return;
                    }
                } catch (SevenZipException e) {
                    if (c14807.mo26748()) {
                        ISequentialOutStream iSequentialOutStream3 = iSequentialOutStreamArr[0];
                        if (iSequentialOutStream3 != null) {
                            if (iSequentialOutStream3 instanceof Closeable) {
                                C19431.m44468((Closeable) iSequentialOutStream3);
                            }
                            iSequentialOutStreamArr[0] = null;
                            interfaceC9868.mo11188();
                        }
                        interfaceC9868.mo11190(iInArchiveMo11185);
                        try {
                            interfaceC9868.mo10349();
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
                                C19431.m44468((Closeable) iSequentialOutStream2);
                            }
                            C19431.m44468(iInArchive);
                            throw th;
                        }
                    }
                    if (interfaceC9868.mo2357()) {
                        ISequentialOutStream iSequentialOutStream4 = iSequentialOutStreamArr[0];
                        if (iSequentialOutStream4 instanceof Closeable) {
                            C19431.m44468((Closeable) iSequentialOutStream4);
                        }
                        C19431.m44468(iInArchiveMo11185);
                        return;
                    }
                    IOException iOExceptionM6796 = m6796(e);
                    if (iOExceptionM6796 != null) {
                        throw iOExceptionM6796;
                    }
                    if (!interfaceC9868.mo10347()) {
                        throw e;
                    }
                    if (!c14807.m26749()) {
                        throw e;
                    }
                    if (c14807.m26751()) {
                        C19808.m45036();
                    }
                    c14807.m26747(null);
                }
            } catch (Throwable th2) {
                th = th2;
                iInArchive = iInArchiveMo11185;
                iSequentialOutStream2 = iSequentialOutStreamArr[0];
                if (iSequentialOutStream2 instanceof Closeable) {
                    C19431.m44468((Closeable) iSequentialOutStream2);
                }
                C19431.m44468(iInArchive);
                throw th;
            }
        }
        C19431.m44468((Closeable) iSequentialOutStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6797(InterfaceC9868 interfaceC9868) {
        ExtractOperationResult extractOperationResultM28470;
        IInArchive iInArchiveMo11185 = interfaceC9868.mo11185();
        ArchiveFormat archiveFormat = iInArchiveMo11185.getArchiveFormat();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        AtomicReference atomicReference = new AtomicReference();
        C2105 c2105 = new C2105(interfaceC9868, atomicBoolean, atomicBoolean2, atomicReference);
        c2105.m26747(interfaceC9868.mo11192());
        c2105.m26746(new C11279(interfaceC9868));
        while (!interfaceC9868.mo2357()) {
            try {
                boolean z = true;
                try {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    atomicReference.set(null);
                    iInArchiveMo11185.extract(null, true, c2105);
                    if (!interfaceC9868.mo2357()) {
                        if (c2105.m26745()) {
                            C19808.m45037(c2105.m26750(), interfaceC9868.mo11189());
                        }
                        if (c2105.m26749()) {
                            String strM26750 = c2105.m26750();
                            if (!TextUtils.isEmpty(strM26750)) {
                                interfaceC9868.mo11187(strM26750);
                            }
                        }
                        interfaceC9868.mo11190(iInArchiveMo11185);
                        return;
                    }
                    C19431.m44468(iInArchiveMo11185);
                    return;
                } catch (SevenZipException e) {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    if (c2105.mo26748()) {
                        interfaceC9868.mo11190(iInArchiveMo11185);
                        try {
                            interfaceC9868.mo10349();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            iInArchiveMo11185 = null;
                            C19431.m44468(iInArchiveMo11185);
                            throw th;
                        }
                    }
                    if (!interfaceC9868.mo2357()) {
                        IOException iOExceptionM6796 = m6796(e);
                        if (iOExceptionM6796 != null) {
                            throw iOExceptionM6796;
                        }
                        C11363 c11363 = (C11363) atomicReference.getAndSet(null);
                        if (c11363 == null || ((extractOperationResultM28470 = c11363.m28470()) != ExtractOperationResult.WRONG_PASSWORD && ((archiveFormat != ArchiveFormat.SEVEN_ZIP && archiveFormat != ArchiveFormat.RAR) || (extractOperationResultM28470 != ExtractOperationResult.CRCERROR && extractOperationResultM28470 != ExtractOperationResult.DATAERROR)))) {
                            z = false;
                        }
                        if (c2105.m26749() && c11363 != null && c11363.m28469() && z) {
                            if (c2105.m26751()) {
                                C19808.m45036();
                            }
                            c2105.m26747(null);
                        } else {
                            throw e;
                        }
                    } else {
                        C19431.m44468(iInArchiveMo11185);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        C19431.m44468(iInArchiveMo11185);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m6796(SevenZipException sevenZipException) {
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
