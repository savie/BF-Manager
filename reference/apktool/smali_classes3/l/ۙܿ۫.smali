.class public final synthetic Ll/ۙܿ۫;
.super Ljava/lang/Object;
.source "1AFL"

# interfaces
.implements Ll/֨֨;


# instance fields
.field public final synthetic ۙ:Ll/᩹ۖ᩸;

.field public final synthetic ۤ:Ll/᩹ۖ᩸;

.field public final synthetic ᩷:Ll/᩹ۖ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙܿ۫;->ۙ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/ۙܿ۫;->᩷:Ll/᩹ۖ᩸;

    iput-object p3, p0, Ll/ۙܿ۫;->ۤ:Ll/᩹ۖ᩸;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/֫ܿ۫;

    .line 253
    invoke-virtual {p1}, Ll/֫ܿ۫;->ۙ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۙܿ۫;->ۙ:Ll/᩹ۖ᩸;

    invoke-virtual {v1, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 254
    invoke-virtual {p1}, Ll/֫ܿ۫;->ۤ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۙܿ۫;->᩷:Ll/᩹ۖ᩸;

    invoke-virtual {v1, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 255
    invoke-virtual {p1}, Ll/֫ܿ۫;->᩷()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۙܿ۫;->ۤ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method
