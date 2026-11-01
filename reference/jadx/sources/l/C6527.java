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

/* JADX INFO: renamed from: l.ۜۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19LE */
/* JADX INFO: loaded from: classes2.dex */
public final class C6527 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f21985;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f21986 = new ArrayList();

    public C6527(byte[] bArr) throws IOException {
        m17731(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        this.f21985 = bitmapDecodeByteArray;
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Decode bitmap failed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17731(byte[] bArr) throws IOException {
        C17367 c17367 = new C17367(bArr);
        C20190.m45649((InterfaceC0433) c17367, 1196314761);
        C20190.m45649((InterfaceC0433) c17367, 169478669);
        boolean z = false;
        while (c17367.available() > 0) {
            int iM40455 = c17367.m40455();
            C22050 c22050 = new C22050();
            c22050.f71469 = c17367.readInt();
            byte[] bArr2 = new byte[iM40455];
            c17367.m40446(iM40455, bArr2);
            c22050.f71470 = bArr2;
            c22050.f71468 = c17367.m40455();
            this.f21986.add(c22050);
            if (c22050.f71469 == 1413563465) {
                z = true;
            }
        }
        if (!z) {
            throw new IOException("Data chunk not found");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m17739() {
        ArrayList<C22050> arrayList = this.f21986;
        Iterator it = arrayList.iterator();
        int length = 8;
        while (it.hasNext()) {
            length += ((C22050) it.next()).f71470.length + 12;
        }
        C11018 c11018 = new C11018(length);
        c11018.writeInt(1196314761);
        c11018.writeInt(169478669);
        for (C22050 c22050 : arrayList) {
            c11018.m27790(c22050.f71470.length);
            c11018.writeInt(c22050.f71469);
            c11018.write(c22050.f71470);
            c11018.m27790(c22050.f71468);
        }
        return c11018.m27788();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17733(BufferedOutputStream bufferedOutputStream) {
        int width = this.f21985.getWidth();
        int height = this.f21985.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width + 2, height + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setFilterBitmap(false);
        canvas.drawBitmap(this.f21985, 1.0f, 1.0f, paint);
        canvas.translate(1.0f, 1.0f);
        C5789 c5789M17732 = m17732();
        if (c5789M17732 != null) {
            Rect rect = c5789M17732.f19677;
            ArrayList<C16373> arrayList = c5789M17732.f19674;
            ArrayList<C16373> arrayList2 = c5789M17732.f19676;
            paint.setColor(-16777216);
            for (C16373 c16373 : arrayList2) {
                canvas.drawRect(c16373.f52692, -1.0f, c16373.f52691, 0.0f, paint);
            }
            for (C16373 c16374 : arrayList) {
                canvas.drawRect(-1.0f, c16374.f52692, 0.0f, c16374.f52691, paint);
            }
            if (!rect.equals(C5789.m15959(arrayList2, arrayList, width, height))) {
                canvas.drawRect(rect.left, height, width - rect.right, height + 1, paint);
                canvas.drawRect(width, rect.top, width + 1, height - rect.bottom, paint);
            }
        }
        C5116 c5116M17737 = m17737();
        if (c5116M17737 != null) {
            paint.setColor(-65536);
            float f = height;
            float f2 = height + 1;
            canvas.drawRect(0.0f, f, c5116M17737.f17821, f2, paint);
            float f3 = width;
            canvas.drawRect(width - c5116M17737.f17820, f, f3, f2, paint);
            float f4 = width + 1;
            canvas.drawRect(f3, 0.0f, f4, c5116M17737.f17818, paint);
            canvas.drawRect(f3, height - c5116M17737.f17818, f4, f, paint);
        }
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C5789 m17732() {
        for (C22050 c22050 : this.f21986) {
            if (c22050.f71469 == 1666478190) {
                C5789 c5789 = new C5789();
                C17367 c17367 = new C17367(c22050.f71470);
                c17367.skipBytes(1);
                byte b = c17367.readByte();
                byte b2 = c17367.readByte();
                int i = c17367.readByte();
                int i2 = c17367.readInt();
                int i3 = c17367.readInt();
                Rect rect = c5789.f19677;
                rect.left = c17367.m40455();
                rect.right = c17367.m40455();
                rect.top = c17367.m40455();
                rect.bottom = c17367.m40455();
                int i4 = c17367.readInt();
                c17367.seek(i2);
                for (int i5 = b / 2; i5 > 0; i5--) {
                    c5789.f19676.add(new C16373(c17367.m40455(), c17367.m40455()));
                }
                c17367.seek(i3);
                for (int i6 = b2 / 2; i6 > 0; i6--) {
                    c5789.f19674.add(new C16373(c17367.m40455(), c17367.m40455()));
                }
                c17367.seek(i4);
                c5789.f19675 = new int[i];
                for (byte b3 = 0; b3 < i; b3 = (byte) (b3 + 1)) {
                    c5789.f19675[b3] = c17367.m40455();
                }
                c5789.m15962(this.f21985);
                return c5789;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17735(C5789 c5789) {
        c5789.m15962(this.f21985);
        c5789.m15964(this.f21985);
        ArrayList<C22050> arrayList = this.f21986;
        for (C22050 c22050 : arrayList) {
            if (c22050.f71469 == 1666478190) {
                c22050.f71470 = c5789.m15963();
                c22050.m48993();
                return;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C22050) arrayList.get(i)).f71469 == 1413563465) {
                C22050 c22051 = new C22050();
                c22051.f71469 = 1666478190;
                c22051.f71470 = c5789.m15963();
                c22051.m48993();
                arrayList.add(i, c22051);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5116 m17737() {
        for (C22050 c22050 : this.f21986) {
            if (c22050.f71469 == 1649176686) {
                C5116 c5116 = new C5116();
                C17367 c17367 = new C17367(c22050.f71470);
                c5116.f17821 = c17367.readInt();
                c5116.f17818 = c17367.readInt();
                c5116.f17820 = c17367.readInt();
                c5116.f17819 = c17367.readInt();
                return c5116;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17734(C5116 c5116) {
        ArrayList<C22050> arrayList = this.f21986;
        if (c5116 == null) {
            C9030.removeIf(arrayList, new C3704(0));
            return;
        }
        for (C22050 c22050 : arrayList) {
            if (c22050.f71469 == 1649176686) {
                c22050.f71470 = c5116.m14261();
                c22050.m48993();
                return;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C22050) arrayList.get(i)).f71469 == 1413563465) {
                C22050 c22051 = new C22050();
                c22051.f71469 = 1649176686;
                c22051.f71470 = c5116.m14261();
                c22051.m48993();
                arrayList.add(i, c22051);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m17740() {
        Iterator it = this.f21986.iterator();
        while (it.hasNext()) {
            if (((C22050) it.next()).f71469 == 1666478190) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17736() {
        int i;
        ArrayList arrayList = this.f21986;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C22050) it.next()).f71469 == 1666478190) {
                return false;
            }
        }
        int width = this.f21985.getWidth();
        int height = this.f21985.getHeight();
        if (width >= 3 && height >= 3 && Color.alpha(this.f21985.getPixel(0, 0)) == 0) {
            int i2 = height - 1;
            if (Color.alpha(this.f21985.getPixel(0, i2)) == 0) {
                int i3 = width - 1;
                if (Color.alpha(this.f21985.getPixel(i3, 0)) == 0 && Color.alpha(this.f21985.getPixel(i3, i2)) == 0) {
                    int i4 = width - 2;
                    int[] iArr = new int[i4];
                    int i5 = height - 2;
                    int[] iArr2 = new int[i5];
                    int i6 = i4;
                    this.f21985.getPixels(iArr, 0, width, 1, 0, i4, 1);
                    this.f21985.getPixels(iArr2, 0, 1, 0, 1, 1, i5);
                    ArrayList arrayListM17730 = m17730(iArr);
                    ArrayList arrayListM17731 = m17730(iArr2);
                    if (arrayListM17730 != null && arrayListM17731 != null) {
                        this.f21985.getPixels(iArr, 0, width, 1, i2, i6, 1);
                        this.f21985.getPixels(iArr2, 0, 1, i3, 1, 1, i5);
                        C5116 c5116 = new C5116();
                        if (!C20318.stream(iArr).allMatch(new C0882()) && !C20318.stream(iArr2).allMatch(new C12878())) {
                            int i7 = 0;
                            while (true) {
                                i = i6;
                                if (i7 >= i || iArr[i7] != -65536) {
                                    break;
                                }
                                iArr[i7] = 0;
                                c5116.f17821++;
                                i7++;
                                i6 = i;
                            }
                            for (int i8 = width - 3; i8 >= 0 && iArr[i8] == -65536; i8--) {
                                iArr[i8] = 0;
                                c5116.f17820++;
                            }
                            for (int i9 = 0; i9 < i5 && iArr2[i9] == -65536; i9++) {
                                iArr2[i9] = 0;
                                c5116.f17818++;
                            }
                            for (int i10 = height - 3; i10 >= 0 && iArr2[i10] == -65536; i10--) {
                                iArr2[i10] = 0;
                                c5116.f17819++;
                            }
                            if (c5116.f17821 == 0 && c5116.f17818 == 0 && c5116.f17820 == 0 && c5116.f17819 == 0) {
                                c5116 = null;
                            }
                            ArrayList arrayListM17732 = m17730(iArr);
                            ArrayList arrayListM17733 = m17730(iArr2);
                            if (arrayListM17732 != null && arrayListM17733 != null && arrayListM17732.size() <= 1 && arrayListM17733.size() <= 1 && arrayListM17732.size() == arrayListM17733.size()) {
                                C5789 c5789 = new C5789();
                                c5789.f19676.addAll(arrayListM17730);
                                c5789.f19674.addAll(arrayListM17731);
                                if (arrayListM17732.isEmpty()) {
                                    c5789.f19677.set(C5789.m15959(c5789.f19676, c5789.f19674, i, i5));
                                } else {
                                    C16373 c16373 = (C16373) arrayListM17732.get(0);
                                    C16373 c16374 = (C16373) arrayListM17733.get(0);
                                    Rect rect = c5789.f19677;
                                    rect.left = c16373.f52692;
                                    rect.right = i - c16373.f52691;
                                    rect.top = c16374.f52692;
                                    rect.bottom = i5 - c16374.f52691;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i5, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                Paint paint = new Paint();
                                paint.setAntiAlias(false);
                                paint.setFilterBitmap(false);
                                canvas.drawBitmap(this.f21985, -1.0f, -1.0f, paint);
                                this.f21985 = bitmapCreateBitmap;
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    this.f21985.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                    arrayList.clear();
                                    m17731(byteArrayOutputStream.toByteArray());
                                    m17735(c5789);
                                    m17734(c5116);
                                    return true;
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m17730(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = -1;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (Color.alpha(i3) == 0) {
                i3 = 0;
            }
            if (i3 != -16777216) {
                if (i3 != 0) {
                    return null;
                }
                if (z) {
                    arrayList.add(new C16373(i, i2));
                    z = false;
                }
            } else if (!z) {
                i = i2;
                z = true;
            }
        }
        if (z) {
            arrayList.add(new C16373(i, length));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Bitmap m17738() {
        return this.f21985;
    }
}
