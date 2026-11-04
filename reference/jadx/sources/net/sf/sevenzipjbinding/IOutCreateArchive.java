package net.sf.sevenzipjbinding;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public interface IOutCreateArchive extends IOutArchiveBase, Closeable {
    void createArchive(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback iOutCreateCallback);

    ArchiveFormat getArchiveFormat();
}
