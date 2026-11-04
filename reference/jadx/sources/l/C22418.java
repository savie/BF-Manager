package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B6FR */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22418 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72604;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72605;

    public /* synthetic */ C22418(int i, Object obj) {
        this.f72604 = i;
        this.f72605 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f72604) {
            case 0:
                C23164 c23164 = (C23164) this.f72605;
                File file = (File) obj;
                c23164.getClass();
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        String absolutePath = file.getAbsolutePath();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                List listM52084 = c23164.m52084(absolutePath, byteArrayOutputStream.toByteArray());
                                fileInputStream.close();
                                return listM52084;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                            throw new C13817("Failed to load DEX file: " + file, e);
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    throw new C13817("Failed to load DEX file: " + file, e);
                }
            case 1:
                return ((MaterialDynamicColors) this.f72605).lambda$onTertiaryFixed$140((DynamicScheme) obj);
            default:
                return C3218.m10560((C3218) this.f72605, (String) obj);
        }
    }
}
