package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 19LE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15425 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f50270;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f50271 = new ArrayList();

    public C15425(byte[] bArr) throws IOException {
        m36945(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        this.f50270 = bitmapDecodeByteArray;
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Decode bitmap failed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36945(byte[] bArr) throws IOException {
        C20348 c20348 = new C20348(bArr);
        C17364.m40795((InterfaceC15872) c20348, 1196314761);
        C17364.m40795((InterfaceC15872) c20348, 169478669);
        boolean z = false;
        while (c20348.available() > 0) {
            int iM46754 = c20348.m46754();
            C10950 c10950 = new C10950();
            c10950.f34616 = c20348.readInt();
            byte[] bArr2 = new byte[iM46754];
            c20348.m46745(iM46754, bArr2);
            c10950.f34617 = bArr2;
            c10950.f34615 = c20348.m46754();
            this.f50271.add(c10950);
            if (c10950.f34616 == 1413563465) {
                z = true;
            }
        }
        if (!z) {
            throw new IOException("Data chunk not found");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m36954() {
        ArrayList<C10950> arrayList = this.f50271;
        Iterator it = arrayList.iterator();
        int length = 8;
        while (it.hasNext()) {
            length += ((C10950) it.next()).f34617.length + 12;
        }
        C6178 c6178 = new C6178(length);
        c6178.writeInt(1196314761);
        c6178.writeInt(169478669);
        for (C10950 c10950 : arrayList) {
            c6178.m17802(c10950.f34617.length);
            c6178.writeInt(c10950.f34616);
            c6178.write(c10950.f34617);
            c6178.m17802(c10950.f34615);
        }
        return c6178.m17808();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36947(BufferedOutputStream bufferedOutputStream) {
        int width = this.f50270.getWidth();
        int height = this.f50270.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width + 2, height + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setFilterBitmap(false);
        canvas.drawBitmap(this.f50270, 1.0f, 1.0f, paint);
        canvas.translate(1.0f, 1.0f);
        C18453 c18453M36955 = m36955();
        if (c18453M36955 != null) {
            ArrayList<C24421> arrayList = c18453M36955.f60076;
            ArrayList<C24421> arrayList2 = c18453M36955.f60074;
            paint.setColor(-16777216);
            for (C24421 c24421 : arrayList2) {
                canvas.drawRect(c24421.f79289, -1.0f, c24421.f79288, 0.0f, paint);
            }
            for (C24421 c24422 : arrayList) {
                canvas.drawRect(-1.0f, c24422.f79289, 0.0f, c24422.f79288, paint);
            }
            Rect rect = c18453M36955.f60075;
            Rect rectM42998 = C18453.m42998(arrayList2, arrayList, width, height);
            int i = rect.left;
            if (i != rectM42998.left || rect.right != rectM42998.right) {
                canvas.drawRect(i, height, width - rect.right, height + 1, paint);
            }
            int i2 = rect.top;
            if (i2 != rectM42998.top || rect.bottom != rectM42998.bottom) {
                canvas.drawRect(width, i2, width + 1, height - rect.bottom, paint);
            }
        }
        C22139 c22139M36953 = m36953();
        if (c22139M36953 != null) {
            paint.setColor(-65536);
            float f = height;
            float f2 = height + 1;
            canvas.drawRect(0.0f, f, c22139M36953.f71316, f2, paint);
            float f3 = width;
            canvas.drawRect(width - c22139M36953.f71315, f, f3, f2, paint);
            float f4 = width + 1;
            canvas.drawRect(f3, 0.0f, f4, c22139M36953.f71317, paint);
            canvas.drawRect(f3, height - c22139M36953.f71314, f4, f, paint);
        }
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18453 m36955() {
        for (C10950 c10950 : this.f50271) {
            if (c10950.f34616 == 1666478190) {
                C18453 c18453 = new C18453();
                C20348 c20348 = new C20348(c10950.f34617);
                c20348.skipBytes(1);
                byte b = c20348.readByte();
                byte b2 = c20348.readByte();
                int i = c20348.readByte();
                int i2 = c20348.readInt();
                int i3 = c20348.readInt();
                Rect rect = c18453.f60075;
                rect.left = c20348.m46754();
                rect.right = c20348.m46754();
                rect.top = c20348.m46754();
                rect.bottom = c20348.m46754();
                int i4 = c20348.readInt();
                c20348.seek(i2);
                for (int i5 = b / 2; i5 > 0; i5--) {
                    c18453.f60074.add(new C24421(c20348.m46754(), c20348.m46754()));
                }
                c20348.seek(i3);
                for (int i6 = b2 / 2; i6 > 0; i6--) {
                    c18453.f60076.add(new C24421(c20348.m46754(), c20348.m46754()));
                }
                c20348.seek(i4);
                c18453.f60073 = new int[i];
                for (byte b3 = 0; b3 < i; b3 = (byte) (b3 + 1)) {
                    c18453.f60073[b3] = c20348.m46754();
                }
                c18453.m43001(this.f50270);
                return c18453;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36948(C18453 c18453) {
        int i;
        ArrayList<C10950> arrayList = this.f50271;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((C10950) arrayList.get(i2)).f34616 == 1413563465) {
                        C10950 c10950 = new C10950();
                        c10950.f34616 = 1817145454;
                        c10950.f34617 = C9502.m24884(this.f50270);
                        c10950.m27773();
                        arrayList.add(i2, c10950);
                        break;
                    }
                }
                break;
            }
        } while (((C10950) it.next()).f34616 != 1817145454);
        c18453.m43001(this.f50270);
        c18453.m43003(this.f50270);
        for (C10950 c10951 : arrayList) {
            if (c10951.f34616 == 1666478190) {
                c10951.f34617 = c18453.m43002();
                c10951.m27773();
                return;
            }
        }
        for (i = 0; i < arrayList.size(); i++) {
            if (((C10950) arrayList.get(i)).f34616 == 1413563465) {
                C10950 c10952 = new C10950();
                c10952.f34616 = 1666478190;
                c10952.f34617 = c18453.m43002();
                c10952.m27773();
                arrayList.add(i, c10952);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22139 m36953() {
        for (C10950 c10950 : this.f50271) {
            if (c10950.f34616 == 1649176686) {
                C22139 c22139 = new C22139();
                C20348 c20348 = new C20348(c10950.f34617);
                c22139.f71316 = c20348.readInt();
                c22139.f71317 = c20348.readInt();
                c22139.f71315 = c20348.readInt();
                c22139.f71314 = c20348.readInt();
                return c22139;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36949(C22139 c22139) {
        ArrayList<C10950> arrayList = this.f50271;
        if (c22139 == null) {
            C1170.removeIf(arrayList, new C8618(1));
            return;
        }
        for (C10950 c10950 : arrayList) {
            if (c10950.f34616 == 1649176686) {
                c10950.f34617 = c22139.m50100();
                c10950.m27773();
                return;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C10950) arrayList.get(i)).f34616 == 1413563465) {
                C10950 c10951 = new C10950();
                c10951.f34616 = 1649176686;
                c10951.f34617 = c22139.m50100();
                c10951.m27773();
                arrayList.add(i, c10951);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m36952() {
        Iterator it = this.f50271.iterator();
        while (it.hasNext()) {
            if (((C10950) it.next()).f34616 == 1666478190) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36950() {
        ArrayList arrayList = this.f50271;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C10950) it.next()).f34616 == 1666478190) {
                return false;
            }
        }
        int width = this.f50270.getWidth();
        int height = this.f50270.getHeight();
        if (width < 3 || height < 3) {
            return false;
        }
        int pixel = this.f50270.getPixel(0, 0);
        int i = Color.alpha(pixel) == 0 ? 0 : -1;
        if (!m36946(pixel, i)) {
            return false;
        }
        int i2 = height - 1;
        if (!m36946(this.f50270.getPixel(0, i2), i)) {
            return false;
        }
        int i3 = width - 1;
        if (!m36946(this.f50270.getPixel(i3, 0), i) || !m36946(this.f50270.getPixel(i3, i2), i)) {
            return false;
        }
        int i4 = width - 2;
        int[] iArr = new int[i4];
        int i5 = height - 2;
        int[] iArr2 = new int[i5];
        this.f50270.getPixels(iArr, 0, width, 1, 0, i4, 1);
        this.f50270.getPixels(iArr2, 0, 1, 0, 1, 1, i5);
        ArrayList arrayListM36944 = m36944(i, iArr);
        ArrayList arrayListM36945 = m36944(i, iArr2);
        if (arrayListM36944 == null || arrayListM36945 == null) {
            return false;
        }
        this.f50270.getPixels(iArr, 0, width, 1, i2, i4, 1);
        this.f50270.getPixels(iArr2, 0, 1, i3, 1, 1, i5);
        C22139 c22139 = new C22139();
        if (C13847.stream(iArr).allMatch(new C22885()) || C13847.stream(iArr2).allMatch(new C19901())) {
            return false;
        }
        for (int i6 = 0; i6 < i4 && iArr[i6] == -65536; i6++) {
            iArr[i6] = i;
            c22139.f71316++;
        }
        for (int i7 = width - 3; i7 >= 0 && iArr[i7] == -65536; i7--) {
            iArr[i7] = i;
            c22139.f71315++;
        }
        for (int i8 = 0; i8 < i5 && iArr2[i8] == -65536; i8++) {
            iArr2[i8] = i;
            c22139.f71317++;
        }
        for (int i9 = height - 3; i9 >= 0 && iArr2[i9] == -65536; i9--) {
            iArr2[i9] = i;
            c22139.f71314++;
        }
        if (c22139.f71316 == 0 && c22139.f71317 == 0 && c22139.f71315 == 0 && c22139.f71314 == 0) {
            c22139 = null;
        }
        ArrayList arrayListM36946 = m36944(i, iArr);
        ArrayList arrayListM36947 = m36944(i, iArr2);
        if (arrayListM36946 == null || arrayListM36947 == null || arrayListM36946.size() > 1 || arrayListM36947.size() > 1) {
            return false;
        }
        C18453 c18453 = new C18453();
        c18453.f60074.addAll(arrayListM36944);
        c18453.f60076.addAll(arrayListM36945);
        c18453.f60075.set(C18453.m42998(c18453.f60074, c18453.f60076, i4, i5));
        if (!arrayListM36946.isEmpty()) {
            C24421 c24421 = (C24421) arrayListM36946.get(0);
            Rect rect = c18453.f60075;
            rect.left = c24421.f79289;
            rect.right = i4 - c24421.f79288;
        }
        if (!arrayListM36947.isEmpty()) {
            C24421 c24422 = (C24421) arrayListM36947.get(0);
            Rect rect2 = c18453.f60075;
            rect2.top = c24422.f79289;
            rect2.bottom = i5 - c24422.f79288;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setFilterBitmap(false);
        canvas.drawBitmap(this.f50270, -1.0f, -1.0f, paint);
        this.f50270 = bitmapCreateBitmap;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f50270.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            arrayList.clear();
            m36945(byteArrayOutputStream.toByteArray());
            m36948(c18453);
            m36949(c22139);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36946(int i, int i2) {
        if (i2 == 0) {
            return Color.alpha(i) == 0;
        }
        return i == i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m36944(int i, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = -1;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i4 != -16777216) {
                if (!m36946(i4, i)) {
                    return null;
                }
                if (z) {
                    arrayList.add(new C24421(i2, i3));
                    z = false;
                }
            } else if (!z) {
                i2 = i3;
                z = true;
            }
        }
        if (z) {
            arrayList.add(new C24421(i2, length));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Bitmap m36951() {
        return this.f50270;
    }
}
