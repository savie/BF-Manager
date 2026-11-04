.class public final synthetic Ll/۫᩶᩸;
.super Ljava/lang/Object;
.source "NB3C"

# interfaces
.implements Ll/᩻ܶ᩵;
.implements Ll/ۧ᩶᩸;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۫᩶᩸;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/۫᩶᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܶ᩵᩸;

    .line 6
    check-cast p1, Ljava/lang/Void;

    .line 571
    invoke-virtual {v0}, Ll/ܶ᩵᩸;->᩸()Ll/᩹ܽ᩵;

    move-result-object p1

    return-object p1
.end method

.method public ᩷()Ljava/io/InputStream;
    .locals 4

    .line 2
    iget-object v0, p0, Ll/۫᩶᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۬ܺۤ;

    .line 202
    new-instance v1, Ll/᩻ܽۤ;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3, v0}, Ll/᩻ܽۤ;-><init>(JLl/۬ܺۤ;)V

    return-object v1
.end method
