package bin.mt.plugin.api.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.util.ServiceLoader;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import l.C11018;
import l.C11644;
import l.C13932;
import l.C16737;
import l.C20010;
import l.C20945;
import l.C21111;
import l.C4344;
import l.C6037;
import l.InterfaceC17629;

/* JADX INFO: loaded from: classes.dex */
public class VectorDrawableLoaderImpl implements InterfaceC17629 {
    public static void register() {
        ServiceLoader.register(InterfaceC17629.class, new VectorDrawableLoaderImpl());
    }

    @Override // l.InterfaceC17629
    public Drawable fromVectorXml(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(Integer.MAX_VALUE);
            if ((inputStream.read() & 255) == 3 && (inputStream.read() & 255) == 0) {
                inputStream.reset();
                return C21111.m47538(C20945.m47094(inputStream).m47106(), new C6037(), false);
            }
            inputStream.reset();
            C11018 c11018 = new C11018();
            C4344 c4344 = new C4344(new C6037());
            c4344.m12180(Collections.EMPTY_MAP);
            c4344.m12182(true);
            c4344.m12179(C20010.m45297(inputStream, StandardCharsets.UTF_8));
            c4344.m12181(c11018);
            return C21111.m47538(C20945.m47094(new ByteArrayInputStream(c11018.m27788(), 0, c11018.size())).m47106(), new C6037(), false);
        } catch (VectorParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new VectorParseException(e2);
        }
    }

    @Override // l.InterfaceC17629
    public Drawable fromSvg(InputStream inputStream) {
        try {
            C11644 c11644M29081 = C11644.m29081(inputStream);
            RectF rectFM29095 = c11644M29081.m29095();
            int iM29084 = (int) c11644M29081.m29084();
            int iM29096 = (int) c11644M29081.m29096();
            if (iM29084 == -1 && iM29096 == -1) {
                iM29084 = (int) (rectFM29095.right - rectFM29095.left);
                iM29096 = (int) (rectFM29095.bottom - rectFM29095.top);
            }
            int iM33769 = C13932.m33769(iM29084);
            int iM337610 = C13932.m33769(iM29096);
            c11644M29081.m29097(iM33769);
            c11644M29081.m29088(iM337610);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM33769, iM337610, Bitmap.Config.ARGB_8888);
            c11644M29081.m29090(new Canvas(bitmapCreateBitmap));
            return new BitmapDrawable(C16737.m39279(), bitmapCreateBitmap);
        } catch (Exception e) {
            throw new VectorParseException(e);
        }
    }
}
