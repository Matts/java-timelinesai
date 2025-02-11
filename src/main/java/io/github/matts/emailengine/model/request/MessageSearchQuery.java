package io.github.matts.emailengine.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.HashMap;

@AllArgsConstructor
@Accessors(chain = true)
@NoArgsConstructor
@Getter
@Setter
public class MessageSearchQuery {
    private String seq;
    private Boolean answered;
    private Boolean deleted;
    private Boolean draft;
    private Boolean unseen;
    private Boolean flagged;
    private Boolean seen;
    private String from;
    private String to;
    private String cc;
    private String bcc;
    private String body;
    private String subject;
    private Integer larger;
    private Integer smaller;
    private String uid;
    private Integer modseq;
    private String before;
    private String sence;
    private String sentBefore;
    private String sentSince;
    private String emailId;
    private String threadId;
    private HashMap<String,String> header;
    private String gmailRaw;

    public Form toForm() {
        return new Form(this);
    }

    @Getter
    public class Form {
        private MessageSearchQuery search;

        public Form(MessageSearchQuery search) {
            this.search = search;
        }
    }
}
