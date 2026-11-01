package l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19230 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62155;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62156;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62157;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62158;

    public /* synthetic */ RunnableC19230(Object obj, Object obj2, Object obj3, int i) {
        this.f62156 = i;
        this.f62158 = obj;
        this.f62155 = obj2;
        this.f62157 = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00e5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: all -> 0x011c, TryCatch #2 {all -> 0x011c, blocks: (B:13:0x0041, B:16:0x004b, B:17:0x0067, B:19:0x006d, B:20:0x007b, B:22:0x0081, B:23:0x008f, B:43:0x00c9, B:44:0x00d1, B:46:0x00d7, B:47:0x00e5, B:49:0x00eb, B:51:0x00f7, B:53:0x0101, B:55:0x010f, B:25:0x0093, B:28:0x009c, B:31:0x00a5, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0), top: B:74:0x0041, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb A[Catch: all -> 0x011c, TryCatch #2 {all -> 0x011c, blocks: (B:13:0x0041, B:16:0x004b, B:17:0x0067, B:19:0x006d, B:20:0x007b, B:22:0x0081, B:23:0x008f, B:43:0x00c9, B:44:0x00d1, B:46:0x00d7, B:47:0x00e5, B:49:0x00eb, B:51:0x00f7, B:53:0x0101, B:55:0x010f, B:25:0x0093, B:28:0x009c, B:31:0x00a5, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0), top: B:74:0x0041, outer: #1 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        InterfaceC9961 value;
        int i = this.f62156;
        Object obj = this.f62157;
        Object obj2 = this.f62155;
        Object obj3 = this.f62158;
        int i2 = 1;
        switch (i) {
            case 0:
                C10058.m25467((EnumC9578) obj, (C10058) obj3, (Throwable) obj2);
                return;
            case 1:
                C5696 c5696 = (C5696) obj2;
                C3181 c3181 = (C3181) obj;
                try {
                    C2455 c2455 = new C2455(((C13810) obj3).m33624());
                    try {
                        C12107 entry = c2455.getEntry("resources.arsc");
                        if (entry != null) {
                            C1493 c1493 = new C1493(c2455.m7471(entry));
                            c1493.m5142();
                            String strSubstring = c5696.getPath().substring(1);
                            Iterator it2 = c1493.mo17615().iterator();
                            while (it2.hasNext()) {
                                for (InterfaceC19133 interfaceC19133 : ((InterfaceC17721) it2.next()).mo19112()) {
                                    String typeName = interfaceC19133.getTypeName();
                                    switch (typeName.hashCode()) {
                                        case -891985903:
                                            if (!typeName.equals("string")) {
                                                it = interfaceC19133.mo25271().iterator();
                                                while (it.hasNext()) {
                                                    for (InterfaceC3609 interfaceC3609 : ((InterfaceC12783) it.next()).mo31746()) {
                                                        if (!interfaceC3609.mo7644()) {
                                                            value = interfaceC3609.getValue();
                                                            if (!value.mo25185() && value.mo25187().getValue().equals(strSubstring)) {
                                                                C16737.m39273(new RunnableC13667(i2, c3181, interfaceC3609));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case -475309713:
                                            if (!typeName.equals("plurals")) {
                                                it = interfaceC19133.mo25271().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC3609.mo7644()) {
                                                            value = interfaceC3609.getValue();
                                                            if (!value.mo25185()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 3355:
                                            if (!typeName.equals("id")) {
                                                it = interfaceC19133.mo25271().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC3609.mo7644()) {
                                                            value = interfaceC3609.getValue();
                                                            if (!value.mo25185()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 3004913:
                                            if (!typeName.equals("attr")) {
                                                it = interfaceC19133.mo25271().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC3609.mo7644()) {
                                                            value = interfaceC3609.getValue();
                                                            if (!value.mo25185()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 93090393:
                                            if (!typeName.equals("array")) {
                                                it = interfaceC19133.mo25271().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC3609.mo7644()) {
                                                            value = interfaceC3609.getValue();
                                                            if (!value.mo25185()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 109780401:
                                            if (!typeName.equals("style")) {
                                                it = interfaceC19133.mo25271().iterator();
                                                while (it.hasNext()) {
                                                    while (r7.hasNext()) {
                                                        if (!interfaceC3609.mo7644()) {
                                                            value = interfaceC3609.getValue();
                                                            if (!value.mo25185()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            it = interfaceC19133.mo25271().iterator();
                                            while (it.hasNext()) {
                                                while (r7.hasNext()) {
                                                    if (!interfaceC3609.mo7644()) {
                                                        value = interfaceC3609.getValue();
                                                        if (!value.mo25185()) {
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            }
                        }
                        c2455.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            c2455.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable unused) {
                    return;
                }
            default:
                String str = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                ImageView imageView = (ImageView) ((WeakReference) obj3).get();
                if (imageView == null || !str.equals(imageView.getTag())) {
                    return;
                }
                Drawable drawable = imageView.getDrawable();
                if (drawable == null) {
                    drawable = new ColorDrawable(0);
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(imageView.getResources(), bitmap)});
                transitionDrawable.setCrossFadeEnabled(true);
                imageView.setImageDrawable(transitionDrawable);
                transitionDrawable.startTransition(300);
                return;
        }
    }
}
