.class public final Ll/ۜۖ֫;
.super Ljava/lang/Object;
.source "H6JL"


# instance fields
.field public ۙ:Landroid/view/View;

.field public ۤ:Z

.field public final ۫:Landroid/webkit/WebView;

.field public final ܳ:Landroid/view/ViewStub;

.field public ᩴ:Landroid/view/View;

.field public ᩷:Ll/ܽ֡᩻;

.field public ᩸:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/ViewStub;Landroid/webkit/WebView;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ll/ۜۖ֫;->ܳ:Landroid/view/ViewStub;

    .line 26
    iput-object p2, p0, Ll/ۜۖ֫;->۫:Landroid/webkit/WebView;

    .line 27
    new-instance p1, Ll/ۖۖ֫;

    invoke-direct {p1, p0}, Ll/ۖۖ֫;-><init>(Ll/ۜۖ֫;)V

    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->setFindListener(Landroid/webkit/WebView$FindListener;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۜۖ֫;)V
    .locals 1

    .line 42
    iget-object p0, p0, Ll/ۜۖ֫;->۫:Landroid/webkit/WebView;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->findNext(Z)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۜۖ֫;IZ)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ll/ۜۖ֫;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ۜۖ֫;->ۤ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    if-lez v0, :cond_1

    if-eqz p2, :cond_1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    invoke-direct {p0, p1}, Ll/ۜۖ֫;->ۙ(Z)V

    :cond_1
    return-void
.end method

.method private ۙ(Z)V
    .locals 3

    .line 116
    iget-object v0, p0, Ll/ۜۖ֫;->ᩴ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 117
    iget-object v0, p0, Ll/ۜۖ֫;->᩸:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 118
    iget-object v0, p0, Ll/ۜۖ֫;->ᩴ:Landroid/view/View;

    const v1, 0x3ec28f5c    # 0.38f

    if-eqz p1, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const v2, 0x3ec28f5c    # 0.38f

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 119
    iget-object v0, p0, Ll/ۜۖ֫;->᩸:Landroid/view/View;

    if-eqz p1, :cond_1

    const/high16 v1, 0x3f800000    # 1.0f

    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۜۖ֫;I)Z
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 52
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/ۜۖ֫;->᩸:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/ۜۖ֫;->۫:Landroid/webkit/WebView;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->findNext(Z)V

    .line 53
    :cond_2
    iget-object p0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۨ᩷()V

    return v0
.end method

.method public static bridge synthetic ۤ(Ll/ۜۖ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۜۖ֫;->۫()V

    return-void
.end method

.method private ۫()V
    .locals 3

    .line 98
    invoke-direct {p0}, Ll/ۜۖ֫;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 99
    invoke-direct {p0, v0}, Ll/ۜۖ֫;->ۙ(Z)V

    .line 100
    iget-boolean v1, p0, Ll/ۜۖ֫;->ۤ:Z

    iget-object v2, p0, Ll/ۜۖ֫;->۫:Landroid/webkit/WebView;

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 104
    :cond_1
    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/webkit/WebView;->findAllAsync(Ljava/lang/String;)V

    return-void

    .line 109
    :cond_2
    :goto_0
    invoke-direct {p0, v0}, Ll/ۜۖ֫;->ۙ(Z)V

    const-string v0, ""

    .line 111
    invoke-virtual {v2, v0}, Landroid/webkit/WebView;->findAllAsync(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v2}, Landroid/webkit/WebView;->clearMatches()V

    return-void
.end method

.method private ܳ()Z
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ۜۖ֫;->ۙ:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic ᩷(Ll/ۜۖ֫;)V
    .locals 1

    .line 41
    iget-object p0, p0, Ll/ۜۖ֫;->۫:Landroid/webkit/WebView;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->findNext(Z)V

    return-void
.end method


# virtual methods
.method public final ۙ()Z
    .locals 3

    .line 77
    invoke-direct {p0}, Ll/ۜۖ֫;->ܳ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 78
    :cond_0
    iget-object v0, p0, Ll/ۜۖ֫;->ۙ:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 79
    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۨ᩷()V

    .line 80
    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 109
    invoke-direct {p0, v1}, Ll/ۜۖ֫;->ۙ(Z)V

    const-string v0, ""

    .line 111
    iget-object v1, p0, Ll/ۜۖ֫;->۫:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->findAllAsync(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v1}, Landroid/webkit/WebView;->clearMatches()V

    .line 82
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    const/4 v0, 0x1

    return v0
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x0

    .line 93
    iput-boolean v0, p0, Ll/ۜۖ֫;->ۤ:Z

    .line 94
    invoke-direct {p0}, Ll/ۜۖ֫;->۫()V

    return-void
.end method

.method public final ᩴ()V
    .locals 3

    .line 36
    iget-object v0, p0, Ll/ۜۖ֫;->ۙ:Landroid/view/View;

    if-nez v0, :cond_0

    .line 37
    iget-object v0, p0, Ll/ۜۖ֫;->ܳ:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۖ֫;->ۙ:Landroid/view/View;

    const v1, 0x7f0a028c

    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܽ֡᩻;

    iput-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    .line 39
    iget-object v0, p0, Ll/ۜۖ֫;->ۙ:Landroid/view/View;

    const v1, 0x7f0a028e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۖ֫;->ᩴ:Landroid/view/View;

    .line 40
    iget-object v0, p0, Ll/ۜۖ֫;->ۙ:Landroid/view/View;

    const v1, 0x7f0a028d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۖ֫;->᩸:Landroid/view/View;

    .line 41
    iget-object v0, p0, Ll/ۜۖ֫;->ᩴ:Landroid/view/View;

    new-instance v1, Ll/ۧ֡֫;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ۧ֡֫;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    iget-object v0, p0, Ll/ۜۖ֫;->᩸:Landroid/view/View;

    new-instance v1, Ll/᩻֡֫;

    invoke-direct {v1, v2, p0}, Ll/᩻֡֫;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    iget-object v0, p0, Ll/ۜۖ֫;->ᩴ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۛ᩹;->ۙ(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 44
    iget-object v0, p0, Ll/ۜۖ֫;->᩸:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۛ᩹;->ۙ(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 45
    iget-object v0, p0, Ll/ۜۖ֫;->ۙ:Landroid/view/View;

    const v1, 0x7f0a028b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 46
    new-instance v1, Ll/֨ۖ֫;

    invoke-direct {v1, p0}, Ll/֨ۖ֫;-><init>(Ll/ۜۖ֫;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۛ᩹;->ۙ(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 48
    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    const/4 v1, 0x1

    .line 803
    invoke-virtual {v0, v1}, Ll/᩹ۖ᩸;->ۘ(Z)V

    .line 49
    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ll/᩹ۖ᩸;->᩶(I)V

    .line 50
    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    new-instance v1, Ll/ۡۖ֫;

    invoke-direct {v1, p0}, Ll/ۡۖ֫;-><init>(Ll/ۜۖ֫;)V

    invoke-virtual {v0, v1}, Ll/ܽ֡᩻;->ۙ(Ll/ܺ֡᩻;)V

    .line 58
    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    new-instance v1, Ll/۠ۖ֫;

    invoke-direct {v1, p0}, Ll/۠ۖ֫;-><init>(Ll/ۜۖ֫;)V

    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 65
    :cond_0
    iget-object v0, p0, Ll/ۜۖ֫;->ۙ:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    invoke-direct {p0}, Ll/ۜۖ֫;->۫()V

    .line 67
    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 68
    iget-object v0, p0, Ll/ۜۖ֫;->᩷:Ll/ܽ֡᩻;

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۤ(Landroid/view/View;)V

    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 123
    iget-object v0, p0, Ll/ۜۖ֫;->۫:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setFindListener(Landroid/webkit/WebView$FindListener;)V

    return-void
.end method

.method public final ᩸()V
    .locals 2

    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Ll/ۜۖ֫;->ۤ:Z

    .line 89
    invoke-direct {p0}, Ll/ۜۖ֫;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 109
    invoke-direct {p0, v0}, Ll/ۜۖ֫;->ۙ(Z)V

    const-string v0, ""

    .line 111
    iget-object v1, p0, Ll/ۜۖ֫;->۫:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->findAllAsync(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v1}, Landroid/webkit/WebView;->clearMatches()V

    :cond_0
    return-void
.end method
