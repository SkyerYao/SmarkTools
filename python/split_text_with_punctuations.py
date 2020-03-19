def split_text_with_punctuations(text):
    regex = "！|？|。|!|\\?"
    pattern = re.compile(regex)
    tempory_sentences = pattern.split(text)
    find_result = re.findAll(pattern, text)
    sentences = []
    for i in range(len(find_result)):
        new_sentence = tempory_sentences[i] + find_result[i]
        sentences.append(new_sentence)
    return sentences
    
if __name__ == '__main__':
    text = "第一句。第二句！第三句？第四句!第五句?"
    sentences = split_text_with_punctuations(text)