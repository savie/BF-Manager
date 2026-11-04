package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.᩸᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B6FR */
/* JADX INFO: loaded from: classes.dex */
public final class C23164 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20180 f75086;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f75085 = C16980.m40037(C23164.class);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f75084 = 1;

    public C23164(C20180 c20180) {
        this.f75086 = c20180;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m52085(List list) {
        return (List) C1170.stream(list).map(new C9746(3)).map(new C22418(0, this)).filter(new C15165(2)).flatMap(new C3984(1)).peek(new C11229()).collect(C2025.toList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m52084(final String str, final byte[] bArr) {
        C16208 c16208;
        if (bArr.length < 112 || bArr[0] != 100 || bArr[1] != 101 || bArr[2] != 120 || bArr[3] != 10) {
            throw new C13817(C25272.m56409("Invalid DEX header: ", str));
        }
        if (C16237.m38539(36, bArr) < 120) {
            c16208 = null;
        } else {
            int iM38539 = C16237.m38539(32, bArr);
            int iM385310 = C16237.m38539(UMErrorCode.E_UM_BE_DEFLATE_FAILED, bArr);
            C16237.m38539(116, bArr);
            c16208 = new C16208(iM38539, iM385310);
        }
        return c16208 != null ? (List) C1170.stream(C16208.m38521(bArr, c16208)).map(new Function() { // from class: l.ۙ᩻᩵
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f18558.m52081(str, ((Integer) obj).intValue(), bArr);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        }).collect(C2025.toList()) : Collections.singletonList(m52081(str, 0, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2281 m52081(String str, int i, byte[] bArr) {
        int i2;
        if (this.f75086.m46429()) {
            int i3 = i + 32;
            if (i + 36 > bArr.length) {
                throw new C13817(C25272.m56409("Dex file truncated, can't read file length, file: ", str));
            }
            int iM38539 = C16237.m38539(i3, bArr);
            if (i + iM38539 > bArr.length) {
                throw new C13817("Dex file truncated, length in header: " + iM38539 + ", file: " + str);
            }
            int iM385310 = C16237.m38539(i + 8, bArr);
            Adler32 adler32 = new Adler32();
            adler32.update(bArr, i + 12, iM38539 - 12);
            int value = (int) adler32.getValue();
            if (iM385310 != value) {
                throw new C13817(String.format("Bad dex file checksum: 0x%08x, expected: 0x%08x, file: %s", Integer.valueOf(value), Integer.valueOf(iM385310), str));
            }
        }
        synchronized (C23164.class) {
            int i4 = f75084 + 1;
            f75084 = i4;
            if (i4 >= 65535) {
                f75084 = 1;
            }
            i2 = f75084;
        }
        return new C2281(i2, i, str, bArr);
    }
}
