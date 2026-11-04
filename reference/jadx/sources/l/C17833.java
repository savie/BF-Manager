package l;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܽ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D9OF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17833 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f58501;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f58502;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16341[] f58503;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File f58504;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Executor f58505;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4409 f58506;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f58507 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AssetManager f58508;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f58509;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41681(int i, Serializable serializable) {
        this.f58505.execute(new RunnableC2002(i, 1, this, serializable));
    }

    public C17833(AssetManager assetManager, Executor executor, InterfaceC4409 interfaceC4409, String str, File file) {
        this.f58508 = assetManager;
        this.f58505 = executor;
        this.f58506 = interfaceC4409;
        this.f58502 = str;
        this.f58504 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24) {
            if (i >= 31) {
                bArr = C8883.f29009;
            } else {
                switch (i) {
                    case 24:
                    case 25:
                        bArr = C8883.f29008;
                        break;
                    case 26:
                        bArr = C8883.f29013;
                        break;
                    case 27:
                        bArr = C8883.f29011;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = C8883.f29010;
                        break;
                }
            }
        }
        this.f58509 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41683() {
        if (this.f58509 == null) {
            m41681(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.f58504;
        if (file.exists()) {
            if (!file.canWrite()) {
                m41681(4, (Serializable) null);
                return false;
            }
        } else {
            try {
                if (!file.createNewFile()) {
                    m41681(4, (Serializable) null);
                    return false;
                }
            } catch (IOException unused) {
                m41681(4, (Serializable) null);
                return false;
            }
        }
        this.f58507 = true;
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17833 m41685() {
        FileInputStream fileInputStreamM41680;
        C16341[] c16341ArrM44700;
        int i;
        AssetManager assetManager = this.f58508;
        InterfaceC4409 interfaceC4409 = this.f58506;
        if (!this.f58507) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        byte[] bArr = this.f58509;
        if (bArr != null) {
            C17833 c17833 = null;
            try {
                fileInputStreamM41680 = m41680(assetManager, "dexopt/baseline.prof");
            } catch (FileNotFoundException e) {
                interfaceC4409.mo14028(6, e);
                fileInputStreamM41680 = null;
            } catch (IOException e2) {
                interfaceC4409.mo14028(7, e2);
                fileInputStreamM41680 = null;
            }
            try {
                if (fileInputStreamM41680 != null) {
                    try {
                        if (!Arrays.equals(C19325.f62424, C23801.m53101(fileInputStreamM41680, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c16341ArrM44700 = C19325.m44700(fileInputStreamM41680, C23801.m53101(fileInputStreamM41680, 4), this.f58502);
                        try {
                            fileInputStreamM41680.close();
                        } catch (IOException e3) {
                            interfaceC4409.mo14028(7, e3);
                        }
                        this.f58503 = c16341ArrM44700;
                    } catch (IOException e4) {
                        interfaceC4409.mo14028(7, e4);
                        try {
                            fileInputStreamM41680.close();
                        } catch (IOException e5) {
                            interfaceC4409.mo14028(7, e5);
                        }
                        c16341ArrM44700 = null;
                    } catch (IllegalStateException e6) {
                        interfaceC4409.mo14028(8, e6);
                        fileInputStreamM41680.close();
                        c16341ArrM44700 = null;
                    }
                }
                C16341[] c16341Arr = this.f58503;
                if (c16341Arr != null && (i = Build.VERSION.SDK_INT) >= 24 && (i >= 31 || i == 24 || i == 25)) {
                    try {
                        FileInputStream fileInputStreamM41681 = m41680(assetManager, "dexopt/baseline.profm");
                        if (fileInputStreamM41681 != null) {
                            try {
                                if (!Arrays.equals(C19325.f62425, C23801.m53101(fileInputStreamM41681, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                this.f58503 = C19325.m44701(fileInputStreamM41681, C23801.m53101(fileInputStreamM41681, 4), bArr, c16341Arr);
                                fileInputStreamM41681.close();
                                c17833 = this;
                            } catch (Throwable th) {
                                try {
                                    fileInputStreamM41681.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else if (fileInputStreamM41681 != null) {
                            fileInputStreamM41681.close();
                        }
                    } catch (FileNotFoundException e7) {
                        interfaceC4409.mo14028(9, e7);
                    } catch (IOException e8) {
                        interfaceC4409.mo14028(7, e8);
                    } catch (IllegalStateException e9) {
                        this.f58503 = null;
                        interfaceC4409.mo14028(8, e9);
                    }
                    if (c17833 != null) {
                        return c17833;
                    }
                }
            } catch (Throwable th3) {
                try {
                    fileInputStreamM41680.close();
                } catch (IOException e10) {
                    interfaceC4409.mo14028(7, e10);
                }
                throw th3;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private FileInputStream m41680(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41684() {
        byte[] bArr;
        InterfaceC4409 interfaceC4409 = this.f58506;
        C16341[] c16341Arr = this.f58503;
        if (c16341Arr == null || (bArr = this.f58509) == null) {
            return;
        }
        if (!this.f58507) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(C19325.f62424);
                byteArrayOutputStream.write(bArr);
                if (!C19325.m44694(byteArrayOutputStream, bArr, c16341Arr)) {
                    interfaceC4409.mo14028(5, null);
                    this.f58503 = null;
                    byteArrayOutputStream.close();
                } else {
                    this.f58501 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f58503 = null;
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            interfaceC4409.mo14028(7, e);
        } catch (IllegalStateException e2) {
            interfaceC4409.mo14028(8, e2);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m41686() {
        byte[] bArr = this.f58501;
        if (bArr != null) {
            if (!this.f58507) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f58504);
                        try {
                            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C19853.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                            try {
                                FileLock fileLockTryLock = fileChannelConvertMaybeLegacyFileChannelFromLibrary.tryLock();
                                if (fileLockTryLock != null) {
                                    try {
                                        if (fileLockTryLock.isValid()) {
                                            byte[] bArr2 = new byte[512];
                                            while (true) {
                                                int i = byteArrayInputStream.read(bArr2);
                                                if (i > 0) {
                                                    fileOutputStream.write(bArr2, 0, i);
                                                } else {
                                                    m41681(1, (Serializable) null);
                                                    fileLockTryLock.close();
                                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    this.f58501 = null;
                                                    this.f58503 = null;
                                                    return true;
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (fileLockTryLock != null) {
                                            try {
                                                fileLockTryLock.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } catch (Throwable th3) {
                                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                    try {
                                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (FileNotFoundException e) {
                    m41681(6, e);
                    this.f58501 = null;
                    this.f58503 = null;
                    return false;
                } catch (IOException e2) {
                    m41681(7, e2);
                    this.f58501 = null;
                    this.f58503 = null;
                    return false;
                }
            } catch (Throwable th9) {
                this.f58501 = null;
                this.f58503 = null;
                throw th9;
            }
        }
        return false;
    }
}
