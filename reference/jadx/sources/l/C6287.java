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
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۛ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9OF */
/* JADX INFO: loaded from: classes2.dex */
public final class C6287 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Executor f21283;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f21284;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f21285;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f21286;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f21287 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final File f21288;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11227[] f21289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AssetManager f21290;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC13470 f21291;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17357(final int i, final Serializable serializable) {
        this.f21283.execute(new Runnable() { // from class: l.ܿ᩶ܰ
            @Override // java.lang.Runnable
            public final void run() {
                this.f55867.f21291.mo12096(i, serializable);
            }
        });
    }

    public C6287(AssetManager assetManager, Executor executor, InterfaceC13470 interfaceC13470, String str, File file) {
        this.f21290 = assetManager;
        this.f21283 = executor;
        this.f21291 = interfaceC13470;
        this.f21286 = str;
        this.f21288 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = C18408.f58670;
                    break;
                case 26:
                    bArr = C18408.f58667;
                    break;
                case 27:
                    bArr = C18408.f58669;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C18408.f58672;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = C18408.f58666;
                    break;
            }
        }
        this.f21284 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17360() {
        if (this.f21284 == null) {
            m17357(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.f21288;
        if (file.exists()) {
            if (!file.canWrite()) {
                m17357(4, (Serializable) null);
                return false;
            }
        } else {
            try {
                file.createNewFile();
            } catch (IOException unused) {
                m17357(4, (Serializable) null);
                return false;
            }
        }
        this.f21287 = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x009b A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #6 {all -> 0x00b0, blocks: (B:57:0x008f, B:59:0x009b, B:62:0x00aa, B:63:0x00af), top: B:87:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa A[Catch: all -> 0x00b0, TRY_ENTER, TryCatch #6 {all -> 0x00b0, blocks: (B:57:0x008f, B:59:0x009b, B:62:0x00aa, B:63:0x00af), top: B:87:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc A[Catch: IllegalStateException -> 0x00c0, IOException -> 0x00c7, FileNotFoundException -> 0x00cc, TRY_LEAVE, TryCatch #10 {FileNotFoundException -> 0x00cc, IOException -> 0x00c7, IllegalStateException -> 0x00c0, blocks: (B:55:0x0087, B:60:0x00a5, B:71:0x00bc, B:69:0x00b9, B:68:0x00b6), top: B:97:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6287 m17362() {
        FileInputStream fileInputStreamM17356;
        C11227[] c11227ArrM17565;
        int i;
        FileInputStream fileInputStreamM17357;
        AssetManager assetManager = this.f21290;
        InterfaceC13470 interfaceC13470 = this.f21291;
        if (!this.f21287) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        byte[] bArr = this.f21284;
        if (bArr != null) {
            C6287 c6287 = null;
            try {
                fileInputStreamM17356 = m17356(assetManager, "dexopt/baseline.prof");
            } catch (FileNotFoundException e) {
                interfaceC13470.mo12096(6, e);
                fileInputStreamM17356 = null;
            } catch (IOException e2) {
                interfaceC13470.mo12096(7, e2);
                fileInputStreamM17356 = null;
            }
            try {
                if (fileInputStreamM17356 != null) {
                    try {
                        if (!Arrays.equals(C6413.f21730, C23927.m52748(fileInputStreamM17356, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c11227ArrM17565 = C6413.m17565(fileInputStreamM17356, C23927.m52748(fileInputStreamM17356, 4), this.f21286);
                        try {
                            fileInputStreamM17356.close();
                        } catch (IOException e3) {
                            interfaceC13470.mo12096(7, e3);
                        }
                        this.f21289 = c11227ArrM17565;
                    } catch (IOException e4) {
                        interfaceC13470.mo12096(7, e4);
                        try {
                            fileInputStreamM17356.close();
                        } catch (IOException e5) {
                            interfaceC13470.mo12096(7, e5);
                        }
                        c11227ArrM17565 = null;
                    } catch (IllegalStateException e6) {
                        interfaceC13470.mo12096(8, e6);
                        fileInputStreamM17356.close();
                        c11227ArrM17565 = null;
                    }
                }
                C11227[] c11227Arr = this.f21289;
                if (c11227Arr != null && (i = Build.VERSION.SDK_INT) >= 24 && i <= 34) {
                    if (i == 24 || i == 25) {
                        try {
                            fileInputStreamM17357 = m17356(assetManager, "dexopt/baseline.profm");
                            if (fileInputStreamM17357 != null) {
                                try {
                                    if (Arrays.equals(C6413.f21731, C23927.m52748(fileInputStreamM17357, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    this.f21289 = C6413.m17566(fileInputStreamM17357, C23927.m52748(fileInputStreamM17357, 4), bArr, c11227Arr);
                                    fileInputStreamM17357.close();
                                    c6287 = this;
                                } catch (Throwable th) {
                                    try {
                                        fileInputStreamM17357.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } else if (fileInputStreamM17357 != null) {
                                fileInputStreamM17357.close();
                            }
                        } catch (FileNotFoundException e7) {
                            interfaceC13470.mo12096(9, e7);
                        } catch (IOException e8) {
                            interfaceC13470.mo12096(7, e8);
                        } catch (IllegalStateException e9) {
                            this.f21289 = null;
                            interfaceC13470.mo12096(8, e9);
                        }
                        if (c6287 != null) {
                            return c6287;
                        }
                    } else {
                        switch (i) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                                fileInputStreamM17357 = m17356(assetManager, "dexopt/baseline.profm");
                                if (fileInputStreamM17357 != null) {
                                    if (Arrays.equals(C6413.f21731, C23927.m52748(fileInputStreamM17357, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    this.f21289 = C6413.m17566(fileInputStreamM17357, C23927.m52748(fileInputStreamM17357, 4), bArr, c11227Arr);
                                    fileInputStreamM17357.close();
                                    c6287 = this;
                                } else if (fileInputStreamM17357 != null) {
                                    fileInputStreamM17357.close();
                                }
                                if (c6287 != null) {
                                    return c6287;
                                }
                            default:
                                return this;
                        }
                    }
                }
            } catch (Throwable th3) {
                try {
                    fileInputStreamM17356.close();
                } catch (IOException e10) {
                    interfaceC13470.mo12096(7, e10);
                }
                throw th3;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private FileInputStream m17356(AssetManager assetManager, String str) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m17361() {
        byte[] bArr;
        InterfaceC13470 interfaceC13470 = this.f21291;
        C11227[] c11227Arr = this.f21289;
        if (c11227Arr == null || (bArr = this.f21284) == null) {
            return;
        }
        if (!this.f21287) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(C6413.f21730);
                byteArrayOutputStream.write(bArr);
                if (!C6413.m17559(byteArrayOutputStream, bArr, c11227Arr)) {
                    interfaceC13470.mo12096(5, null);
                    this.f21289 = null;
                    byteArrayOutputStream.close();
                } else {
                    this.f21285 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f21289 = null;
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
            interfaceC13470.mo12096(7, e);
        } catch (IllegalStateException e2) {
            interfaceC13470.mo12096(8, e2);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m17359() {
        byte[] bArr = this.f21285;
        if (bArr != null) {
            if (!this.f21287) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f21288);
                        try {
                            byte[] bArr2 = new byte[512];
                            while (true) {
                                int i = byteArrayInputStream.read(bArr2);
                                if (i > 0) {
                                    fileOutputStream.write(bArr2, 0, i);
                                } else {
                                    m17357(1, (Serializable) null);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    this.f21285 = null;
                                    this.f21289 = null;
                                    return true;
                                }
                                try {
                                    byteArrayInputStream.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        byteArrayInputStream.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    this.f21285 = null;
                    this.f21289 = null;
                    throw th5;
                }
            } catch (FileNotFoundException e) {
                m17357(6, e);
                this.f21285 = null;
                this.f21289 = null;
                return false;
            } catch (IOException e2) {
                m17357(7, e2);
                this.f21285 = null;
                this.f21289 = null;
                return false;
            }
        }
        return false;
    }
}
