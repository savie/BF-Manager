.class public final Ll/ۧ۬᩷;
.super Ljava/lang/Object;
.source "H6ZH"


# static fields
.field public static final synthetic ۙ:I

.field public static ۤ:Z

.field public static final ᩷:Ljava/util/WeakHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "*"

    .line 78
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    const-string v0, ""

    .line 79
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    const/4 v0, 0x1

    .line 81
    sput-boolean v0, Ll/ۧ۬᩷;->ۤ:Z

    .line 82
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll/ۧ۬᩷;->᩷:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static ۙ()Landroid/content/pm/PackageInfo;
    .locals 2

    .line 393
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 394
    invoke-static {}, Ll/ۘ۬᩷;->ۙ()Landroid/content/pm/PackageInfo;

    move-result-object v0

    return-object v0

    .line 397
    :cond_0
    :try_start_0
    invoke-static {}, Ll/ۧ۬᩷;->᩷()Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ۙ(Landroid/webkit/WebView;)Ll/֫ۙۤ;
    .locals 3

    .line 452
    sget-object v0, Ll/ᩴۙۤ;->᩷:Ll/ܶ۬᩷;

    .line 453
    invoke-virtual {v0}, Ll/᩺۬᩷;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean v0, Ll/ۧ۬᩷;->ۤ:Z

    if-eqz v0, :cond_1

    .line 454
    sget-object v0, Ll/ۧ۬᩷;->᩷:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۙۤ;

    if-nez v1, :cond_0

    .line 456
    new-instance v1, Ll/֫ۙۤ;

    .line 1566
    invoke-static {}, Ll/ۚۙۤ;->᩸()Ll/ۧۙۤ;

    move-result-object v2

    .line 1570
    invoke-interface {v2, p0}, Ll/ۧۙۤ;->createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    move-result-object v2

    .line 456
    invoke-direct {v1, v2}, Ll/֫ۙۤ;-><init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V

    .line 457
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 461
    :cond_1
    new-instance v0, Ll/֫ۙۤ;

    .line 1566
    invoke-static {}, Ll/ۚۙۤ;->᩸()Ll/ۧۙۤ;

    move-result-object v1

    .line 1570
    invoke-interface {v1, p0}, Ll/ۧۙۤ;->createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    move-result-object p0

    .line 461
    invoke-direct {v0, p0}, Ll/֫ۙۤ;-><init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V

    return-object v0
.end method

.method public static ۙ(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;)Ll/ᩳ۬᩷;
    .locals 1

    .line 851
    sget-object v0, Ll/ᩴۙۤ;->᩸:Ll/ܶ۬᩷;

    .line 852
    invoke-virtual {v0}, Ll/᩺۬᩷;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 853
    invoke-static {p0}, Ll/ۧ۬᩷;->ۙ(Landroid/webkit/WebView;)Ll/֫ۙۤ;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 854
    invoke-interface {p2, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/֫ۙۤ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/ᩳ۬᩷;

    move-result-object p0

    return-object p0

    .line 856
    :cond_0
    invoke-static {}, Ll/ᩴۙۤ;->ۙ()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static ۙ(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 801
    sget-object v0, Ll/ᩴۙۤ;->֫:Ll/ܶ۬᩷;

    .line 802
    invoke-virtual {v0}, Ll/᩺۬᩷;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 803
    invoke-static {p0}, Ll/ۧ۬᩷;->ۙ(Landroid/webkit/WebView;)Ll/֫ۙۤ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/֫ۙۤ;->ۙ(Ljava/lang/String;)V

    return-void

    .line 805
    :cond_0
    invoke-static {}, Ll/ᩴۙۤ;->ۙ()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static ۙ(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;Ll/ۤܿۛ;)V
    .locals 1

    .line 768
    sget-object v0, Ll/ᩴۙۤ;->֫:Ll/ܶ۬᩷;

    .line 769
    invoke-virtual {v0}, Ll/᩺۬᩷;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 770
    invoke-static {p0}, Ll/ۧ۬᩷;->ۙ(Landroid/webkit/WebView;)Ll/֫ۙۤ;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 771
    invoke-interface {p2, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    .line 770
    invoke-virtual {p0, p1, p2, p3}, Ll/֫ۙۤ;->ۙ(Ljava/lang/String;[Ljava/lang/String;Ll/ۤܿۛ;)V

    return-void

    .line 773
    :cond_0
    invoke-static {}, Ll/ᩴۙۤ;->ۙ()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static ᩷()Landroid/content/pm/PackageInfo;
    .locals 3

    const-string v0, "android.webkit.WebViewFactory"

    .line 413
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getLoadedPackageInfo"

    const/4 v2, 0x0

    .line 414
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 415
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    return-object v0
.end method
