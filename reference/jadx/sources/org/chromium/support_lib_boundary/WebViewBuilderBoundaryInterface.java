package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import l.C12312;

/* JADX INFO: loaded from: classes2.dex */
public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context context, Consumer consumer);

    public class Config implements Consumer {
        public int baseline = 0;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public ArrayList f82013 = new ArrayList();

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public ArrayList f82011 = new ArrayList();

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public ArrayList f82012 = new ArrayList();

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return C12312.$default$andThen(this, consumer);
        }

        public void addJavascriptInterface(Object obj, String str, List list) {
            this.f82013.add(obj);
            this.f82011.add(str);
            this.f82012.add(list);
        }

        @Override // java.util.function.Consumer
        public void accept(BiConsumer biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(1, new Object[]{this.f82013, this.f82011, this.f82012});
        }
    }
}
