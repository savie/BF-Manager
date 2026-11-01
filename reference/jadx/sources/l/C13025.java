package l;

import android.content.ContextWrapper;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۬ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13025 extends AbstractC12505 implements InterfaceC3851 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f43437;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f43438;

    @Override // l.InterfaceC10388
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۙ */
    public final C7565 mo13(C16033 c16033, AbstractC0509 abstractC0509, boolean z) {
        AbstractC21491 abstractC21491 = (AbstractC21491) abstractC0509;
        ByteBuffer byteBuffer = c16033.f51912;
        byteBuffer.getClass();
        C2023.m6510(byteBuffer.hasArray());
        C2023.m6507(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f43437;
            if (iMax == -1) {
                ContextWrapper contextWrapper = this.f43438;
                if (contextWrapper != null) {
                    Point pointM41831 = C17983.m41831(contextWrapper);
                    int i = pointM41831.x;
                    int i2 = pointM41831.y;
                    C7648 c7648 = c16033.f51911;
                    if (c7648 != null) {
                        int i3 = c7648.f25240;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = c7648.f25263;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            abstractC21491.f69840 = C17900.m41528(byteBuffer.remaining(), iMax, byteBuffer.array());
            abstractC21491.f2202 = c16033.f51910;
            return null;
        } catch (C22861 e) {
            return new C6674("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new C6674(e2);
        }
    }

    public C13025(ContextWrapper contextWrapper) {
        super(new C16033[1], new AbstractC21491[1]);
        this.f43438 = contextWrapper;
        this.f43437 = -1;
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۖ */
    public final C16033 mo11() {
        return new C16033(1, 0);
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC0509 mo15() {
        return new C22197(this);
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۙ */
    public final C7565 mo12(Throwable th) {
        return new C6674("Unexpected decode error", th);
    }
}
