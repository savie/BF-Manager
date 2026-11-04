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
import l.C14955;
import l.C1752;
import l.C21246;
import l.C21576;
import l.C22173;
import l.C24236;
import l.C5125;
import l.C6178;
import l.C6907;
import l.InterfaceC23348;

/* JADX INFO: loaded from: classes.dex */
public class VectorDrawableLoaderImpl implements InterfaceC23348 {
    public static void register() {
        ServiceLoader.register(InterfaceC23348.class, new VectorDrawableLoaderImpl());
    }

    @Override // l.InterfaceC23348
    public Drawable fromVectorXml(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(Integer.MAX_VALUE);
            if ((inputStream.read() & 255) == 3 && (inputStream.read() & 255) == 0) {
                inputStream.reset();
                return C24236.m54217(C14955.m35973(inputStream).m35991(), new C21246(), false);
            }
            inputStream.reset();
            C6178 c6178 = new C6178();
            C22173 c22173 = new C22173(new C21246());
            c22173.m50143(Collections.EMPTY_MAP);
            c22173.m50145(true);
            c22173.m50142(C5125.m15490(inputStream, StandardCharsets.UTF_8));
            c22173.m50144(c6178);
            return C24236.m54217(C14955.m35973(new ByteArrayInputStream(c6178.m17808(), 0, c6178.size())).m35991(), new C21246(), false);
        } catch (VectorParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new VectorParseException(e2);
        }
    }

    @Override // l.InterfaceC23348
    public Drawable fromSvg(InputStream inputStream) {
        try {
            C1752 c1752M6176 = C1752.m6176(inputStream);
            RectF rectFM6191 = c1752M6176.m6191();
            int iM6197 = (int) c1752M6176.m6197();
            int iM6195 = (int) c1752M6176.m6195();
            if (iM6197 == -1 && iM6195 == -1) {
                iM6197 = (int) (rectFM6191.right - rectFM6191.left);
                iM6195 = (int) (rectFM6191.bottom - rectFM6191.top);
            }
            int iM19160 = C6907.m19160(iM6197);
            int iM19161 = C6907.m19160(iM6195);
            c1752M6176.m6196(iM19160);
            c1752M6176.m6184(iM19161);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM19160, iM19161, Bitmap.Config.ARGB_8888);
            c1752M6176.m6186(new Canvas(bitmapCreateBitmap));
            return new BitmapDrawable(C21576.m49055(), bitmapCreateBitmap);
        } catch (Exception e) {
            throw new VectorParseException(e);
        }
    }
}
