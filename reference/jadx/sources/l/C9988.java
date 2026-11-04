package l;

import android.content.ContextWrapper;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۢ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9988 extends AbstractC16876 implements InterfaceC1040 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f32091;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f32092;

    @Override // l.InterfaceC19860
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ۙ */
    public final C15384 mo11(C5690 c5690, AbstractC11655 abstractC11655, boolean z) {
        AbstractC7006 abstractC7006 = (AbstractC7006) abstractC11655;
        ByteBuffer byteBuffer = c5690.f19651;
        byteBuffer.getClass();
        C20782.m47568(byteBuffer.hasArray());
        C20782.m47565(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f32091;
            if (iMax == -1) {
                ContextWrapper contextWrapper = this.f32092;
                if (contextWrapper != null) {
                    Point pointM19478 = C7116.m19478(contextWrapper);
                    int i = pointM19478.x;
                    int i2 = pointM19478.y;
                    C15648 c15648 = c5690.f19653;
                    if (c15648 != null) {
                        int i3 = c15648.f50833;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = c15648.f50821;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            abstractC7006.f23098 = C6942.m19222(byteBuffer.remaining(), iMax, byteBuffer.array());
            abstractC7006.f37777 = c5690.f19652;
            return null;
        } catch (C2970 e) {
            return new C9242("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new C9242(e2);
        }
    }

    public C9988(ContextWrapper contextWrapper) {
        super(new C5690[1], new AbstractC7006[1]);
        this.f32092 = contextWrapper;
        this.f32091 = -1;
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ᩸ */
    public final C5690 mo17() {
        return new C5690(1, 0);
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC11655 mo16() {
        return new C7752(this);
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ۙ */
    public final C15384 mo10(Throwable th) {
        return new C9242("Unexpected decode error", th);
    }
}
