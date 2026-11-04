package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.ArrayList;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8H6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23326 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75558;

    public /* synthetic */ C23326(int i) {
        this.f75558 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f75558) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f75558) {
            case 0:
                byte[] bArr = (byte[]) obj;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (options.outWidth > 0 && options.outHeight > 0) {
                        options.inSampleSize = 1;
                        while (true) {
                            int iMax = Math.max(options.outWidth, options.outHeight);
                            int i = options.inSampleSize;
                            if (iMax / i <= 512) {
                                options.inJustDecodeBounds = false;
                                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                                if (bitmapDecodeByteArray == null) {
                                    return false;
                                }
                                bitmapDecodeByteArray.recycle();
                                return true;
                            }
                            options.inSampleSize = i * 2;
                        }
                    }
                    return false;
                } catch (OutOfMemoryError | RuntimeException unused) {
                    return false;
                }
            case 1:
                String str = (String) obj;
                return str == null || str.isEmpty();
            case 2:
                return !((String) obj).isEmpty();
            case 3:
                C21943 c21943 = (C21943) obj;
                return ((ArrayList) c21943.mo1986()).isEmpty() && c21943.m49643().isEmpty() && c21943.m49646().isEmpty() && !c21943.mo17865(EnumC1763.MTH_ENTER_BLOCK) && !c21943.mo17865(EnumC1763.MTH_EXIT_BLOCK);
            case 4:
                return (((C2920) obj).f38071 & 4503599627370496L) != 0;
            default:
                return (((C12510) obj).f40170.f15825 & 2305843009213693952L) == 2305843009213693952L;
        }
    }
}
